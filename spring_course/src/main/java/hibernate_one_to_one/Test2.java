package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                .addAnnotatedClass(Employee.class)
                                .addAnnotatedClass(Detail.class)
                                .buildSessionFactory();

        Session session = null;
        try {
//            Employee emp = new Employee("Yan", "Groznuy", "IT", 2200);
//            Detail detail = new Detail("Praga", "3546879534", "yan1992@gmail.com");
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);


//            Detail detail = session.get(Detail.class, 5);
//            detail.getEmployee().setEmpDetail(null);
//            session.delete(detail);

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete from Employee where details_id = null ").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
