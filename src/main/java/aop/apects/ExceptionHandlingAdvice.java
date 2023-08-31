package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAdvice {
    @Before("aop.apects.MyPointCuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: get/handle exception after attemp to get " +
                "book /magazine");
    }
}
