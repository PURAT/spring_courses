package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class University {

    private static List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Alex Shtunder", 8.7);
        Student student2 = new Student("Arseniy Malov", 8.8);
        Student student3 = new Student("Will Smith", 6.7);
        Collections.addAll(students, student1, student2, student3);
        System.out.println("Добавлены студенты в университет.");
    }

    public List<Student> getStudents() {
        System.out.println(students);
        students.get(4);
        return students;
    }
}
