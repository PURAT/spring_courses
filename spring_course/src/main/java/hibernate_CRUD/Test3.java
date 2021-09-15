package hibernate_CRUD;

import hibernate_CRUD.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // read (select)
        try (factory) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employeeList = session.createQuery("from Employee where name = 'Alex' OR salary > 1000")
                    .getResultList();

            for (Employee employee: employeeList) {
                System.out.println(employee);
            }

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
