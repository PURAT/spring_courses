package introduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dog")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog is created");
    }

    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    private void init() {
//        System.out.println("Init method.");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Destroy method.");
//    }
}
