package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAdvice {
    @Before("aop.apects.MyPointCuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: get/handle exception after attemp to get " +
                "book /magazine");
        System.out.println("------------------------------");
    }
}
