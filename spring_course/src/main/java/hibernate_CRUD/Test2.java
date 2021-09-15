package hibernate_CRUD;

import hibernate_CRUD.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Employee.class)
                                    .buildSessionFactory();

        // create and read
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = new Employee("Pavel", "Ivanov", "HR", 900);
            session.save(emp);

            int myId = emp.getId();
            Employee employee = session.get(Employee.class, myId);
            System.out.println(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
