package aop.apects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*())")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUnilibrary(){
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUnilibrary()")
//    public void allMethodsExceptReturnMagazineAdvice(){
//        System.out.println("allMethodsExceptReturnMagazineAdvice(): LOG #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary()  || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturningLoggingAdvice(){
//        System.out.println("beforeReturningLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void  beforeGetAndReturningLoggingAdvice(){
//        System.out.println("beforeGetAndReturningLoggingAdvice: writing Log #3");
//    }



    @Before("aop.apects.MyPointCuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice: логирование " +
                "попытки получить книгу/журнал");
    }

}
