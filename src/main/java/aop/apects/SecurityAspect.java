package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {

    @Before("aop.apects.MyPointCuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: проверка прав на получение книги/журнала");
        System.out.println("------------------------------");
    }

}
