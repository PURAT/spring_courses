package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
//
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() { }
//
//    @Pointcut("execution(* aop.UniLibrary.add*(..))\n")
//    private void addBookMethod() { }
//
//    @Pointcut("allMethodsFromUniLibrary() && !addBookMethod()")
//    private void exceptAddMethodsFromUniLibrary() { }
//
//
//    @Before("exceptAddMethodsFromUniLibrary()")
//    public void beforeMethodsExceptAddMethodsFromUniLibraryAdvice() {
//        System.out.println("beforeMethodsExceptAddMethodsFromUniLibraryAdvice: writing Log #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*(..))")
//    private void getAllGetFromUniLibrary() { }
//
//    @Pointcut("execution(* aop.UniLibrary.return*(..))")
//    private void returnAllFromUniLibrary() { }
//
//
//    @Before("getAllGetFromUniLibrary()")
//    public void beforeGetAllReturnsFromUniLibrary() {
//        System.out.println("beforeGetAllReturnsFromUniLibrary: writing Log #1");
//    }
//
//    @Before("returnAllFromUniLibrary()")
//    public void beforeReturnAllReturnsFromUniLibrary() {
//        System.out.println("beforeReturnAllReturnsFromUniLibrary: writing Log #2");
//    }

//    @Pointcut("getAllGetFromUniLibrary() || returnAllFromUniLibrary()")
//    private void getAndReturnFromUniLibrary() { }
//
//    @Before("getAndReturnFromUniLibrary()")
//    public void beforeGetAndReturnAllReturnsFromUniLibrary() {
//        System.out.println("beforeGetAndReturnAllReturnsFromUniLibrary: writing Log #3");
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

//        System.out.println("signature.method: " + signature.getMethod());
//        System.out.println("signature.name: " + signature.getName());
//        System.out.println("signature.returnType: " + signature.getReturnType());
//        System.out.println("signature.getParameterNames: " + Arrays.toString(signature.getParameterNames()));
//        System.out.println("signature.getParameterTypes: " + Arrays.toString(signature.getParameterTypes()));
//        System.out.println("joinPoint.args: " + Arrays.toString(joinPoint.getArgs()));

        Object[] arguments = joinPoint.getArgs();
        if (signature.getName().equals("addBook")) {
            for (Object obj: arguments) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Книга: \"" + book.getName() + "\"" +
                            "\nАвтор: " + book.getAuthor() +
                            "\nГод издания: " + book.getYearOfPublicationBook());
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование - попытка получить книгу/журнал.");
        System.out.println("------------------------------------------------------------------------");
    }
}
