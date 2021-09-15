package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Взяли книгу из школьной библиотеки.");
    }
}
