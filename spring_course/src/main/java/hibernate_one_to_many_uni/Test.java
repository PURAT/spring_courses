package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Employee.class)
                                .addAnnotatedClass(Department.class)
                                .buildSessionFactory();
        Session session = null;
        try {
            Department department1 = new Department("IT", 1800, 800);
            Department department2 = new Department("HR", 1600, 1200);
            Employee emp1 = new Employee("Oleg", "Rinovich", 1050);
            Employee emp2 = new Employee("Masha", "Smirnova", 1000);
            Employee emp3 = new Employee("Igor", "Ishakov", 850);
            department1.addEmployeeToDepartment(emp1);
            department2.addEmployeeToDepartment(emp2);
            department1.addEmployeeToDepartment(emp3);

            session = factory.getCurrentSession();
            session.beginTransaction();

//            session.save(department1);
//            session.save(department2);

//            Department dep = session.get(Department.class, 13);
//            System.out.println(dep.getEmployees());

//            Department dep = session.get(Department.class, 14);
//            session.delete(dep);

//            Employee emp = session.get(Employee.class, 14);
//            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
