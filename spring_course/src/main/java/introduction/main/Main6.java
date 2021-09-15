package introduction.main;

import introduction.MyConfig2;
import introduction.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
