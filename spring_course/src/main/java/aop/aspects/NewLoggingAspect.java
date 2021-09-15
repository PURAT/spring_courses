package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution( * returnBook())")
    public Object aroundReturnBookAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundReturnBookAdvice: В библиотеку пытаются вернуть книгу.");

        long start = System.currentTimeMillis();
        Object nameBook;
        try {
            nameBook = joinPoint.proceed();
        } catch (Exception e) {
//            nameBook = "Неизвестное название книги.";
            System.out.println("Логирование исключения " + e);
            throw e;
        }
        long finish = System.currentTimeMillis();

        System.out.println("Время выполнения метода returnBook = " + (finish - start) + " мс");
        System.out.println("aroundReturnBookAdvice: В библиотеку успешно вернули книгу.");
        return nameBook;
    }
}
