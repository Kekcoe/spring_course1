package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {

    @Before("aop.apects.MyPointCuts.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }

}
