package introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat is created");
    }

    public void say() {
        System.out.println("Meow-Meow");
    }
}
