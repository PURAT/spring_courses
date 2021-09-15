package introduction.main;

import introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callPet();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        context.close();
    }
}
