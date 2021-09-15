package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Employee.class)
                                .addAnnotatedClass(Department.class)
                                .buildSessionFactory();
        Session session = null;
        try {
//            Department department = new Department("IT", 2000, 600);
//            Employee emp1 = new Employee("Alex", "Rinovich", 900);
//            Employee emp2 = new Employee("Rita", "Smirnova", 1200);
//            Employee emp3 = new Employee("Max", "Ishakov", 850);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);

            session = factory.getCurrentSession();
            session.beginTransaction();

//            session.save(department);

//            ******************************************************
//            System.out.println("Get department.....");
//            Department dep = session.get(Department.class, 15);
//
//            System.out.println("Show department.....");
//            System.out.println(dep);
//
//            System.out.println("Show employees.....");
//            System.out.println(dep.getEmployees());

//            *******************************************************

//            System.out.println("Get employee.....");
//            Employee emp = session.get(Employee.class, 16);
//
//            System.out.println("Show employee.....");
//            System.out.println(emp);
//
//            System.out.println("Show department.....");
//            System.out.println(emp.getDepartment());

//            *******************************************************

//            Department dep = session.get(Department.class, 15);
//            List<Employee> emps = dep.getEmployees();
//            for (Employee emp: emps)
//                emp.setDepartment(null);
//            session.delete(dep);

//            *******************************************************

//            Employee emp = session.get(Employee.class, 16);
//            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
