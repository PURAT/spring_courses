package aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Взяли книгу из университетской библиотеки.");
        System.out.println("------------------------------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("Взяли журнал из университетской библиотеки.");
        System.out.println("------------------------------------------------------------------------");
    }

    public String returnBook() {
        System.out.println("Возвратили книгу в университетскую библиотеку.");
        return "Война и Мир";
    }

    public void returnMagazine() {
        System.out.println("Возвратили журнал в университетскую библиотеку.");
        System.out.println("------------------------------------------------------------------------");
    }

    public void addBook(String person, Book book) {
        System.out.println(person + " подарил книгу \"" + book.getName() + "\" в университетскую библиотеку.");
        System.out.println("------------------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Подарили журнал в университетскую библиотеку.");
        System.out.println("------------------------------------------------------------------------");
    }
}
