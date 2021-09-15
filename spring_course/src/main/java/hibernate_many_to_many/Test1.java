package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            ***************************************************
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Oleg", 6);
//            Child child2 = new Child("Masha", 8);
//            Child child3 = new Child("Vasya", 7);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);

//            session.save(section1);

//            ***************************************************

//            Section section2 = new Section("Basketball");
//            Section section3 = new Section("Physics");
//            Section section4 = new Section("Chess");
//            Child child = new Child("Alex", 10);
//            child.addSectionToChild(section2);
//            child.addSectionToChild(section3);
//            child.addSectionToChild(section4);

//            session.save(child);

//            ***************************************************

//            Section section = session.get(Section.class, 1);
//            System.out.println(section.getChildren());

//            ***************************************************

//            Child child = session.get(Child.class, 4);
//            System.out.println(child.getSections());

//            ***************************************************

//            Section section = session.get(Section.class, 1);
//            session.delete(section);

//            ***************************************************

//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Grisha", 13);
//            Child child2 = new Child("Olya", 11);
//            Child child3 = new Child("Kolya", 10);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.persist(section1);

//            *************************************************

//            Child child = session.get(Child.class, 4);
//            session.delete(child);

//            *************************************************

//            Section dance = session.get(Section.class, 5);
//            Child masha = session.createQuery("from Child where name = 'Masha'", Child.class).getSingleResult();
//            Child oleg = session.createQuery("from Child where name = 'Oleg'", Child.class).getSingleResult();
//            Child vasya = session.createQuery("from Child where name = 'Vasya'", Child.class).getSingleResult();
//            dance.addChildToSection(masha);
//            dance.addChildToSection(oleg);
//            dance.addChildToSection(vasya);

//            *************************************************

//            Child child = session.get(Child.class, 3);
//            session.delete(child);

//            *************************************************

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
