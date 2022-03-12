package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void  allGetMetods(){}

    @Before("execution(* get*())")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/magazine");
    }

    @Before("allGetMetods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }
}
