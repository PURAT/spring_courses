package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Pointcut("execution( * get*())")
    private void allGetMethods() { }

    @Before("allGetMethods()")
    public void beforeGetMethodsAdvice() {
        System.out.println("beforeGetMethodsAdvice: начало логирования студентов в университете.");
    }

    @AfterReturning(pointcut = "allGetMethods()", returning = "students")
    public void afterReturnGetMethodsAdvice(List<Student> students) {
        Student student = students.get(2);
        String nameSurname = "Mr. " + student.getNameSurname();
        student.setNameSurname(nameSurname);

        System.out.println("afterReturnGetMethodsAdvice: завершение логирования студентов в университете.");
    }


    @AfterThrowing(pointcut = "allGetMethods()", throwing = "exception")
    public void afterThrowingGetMethodsAdvice(Throwable exception) {

        System.out.println("Ошибка логирования: " + exception);
        System.out.println("afterThrowingGetMethodsAdvice: после ошибки логирования студентов в университете.");
    }

    @After("execution(* getStudents())")
    public void afterGetMethodsAdvice() {
        System.out.println("afterGetMethodsAdvice: логирование студентов с ошибкой или без ошибки");
    }
}
