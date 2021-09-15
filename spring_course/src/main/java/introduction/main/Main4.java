package introduction.main;

import introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

//        Cat cat = (Cat) context.getBean("catBean", Pet.class);
//        cat.say();

        context.close();
    }
}
