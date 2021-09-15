package introduction;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person with arg is created");
    }

    public Person() {
        System.out.println("Person is created");
    }

    public void setPet(Pet pet) {
        System.out.println("setPet was invoked");
        this.pet = pet;
    }

    public void setName(String name) {
        System.out.println("setName was invoked");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("setAge was invoked");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callPet() {
        System.out.println("Hello, my Pet");
        pet.say();
    }
}
