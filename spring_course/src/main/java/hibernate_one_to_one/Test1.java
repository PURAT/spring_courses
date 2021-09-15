package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = factory.getCurrentSession()) {

            session.beginTransaction();

            // create
//            Employee emp = new Employee("Arseniy", "Ivanov", "Sales", 1700);
//            Detail detail = new Detail("Minsk", "124322355", "a.sha@yandex.ru");
//            emp.setEmpDetail(detail);
//            session.save(emp);

            // read
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());

            // delete
//            Employee emp = session.get(Employee.class, 3);
//            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
