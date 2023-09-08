package aop.apects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice : try to return book to library");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }catch(Exception e){
            System.out.println("aroundReturnBookLoggingAdvice : was catch exception " + e);
            targetMethodResult = "Неизвестное название книги";

            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice : returned book to library");

        return targetMethodResult;
    }
}