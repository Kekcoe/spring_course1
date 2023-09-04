package aop.apects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.awt.*;

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



    @Before("aop.apects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

       MethodSignature methodSignature =(MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature =" + methodSignature);
        System.out.println("methodSignature.getMethod() =" + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() =" + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() =" + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if(obj instanceof Book){
                    Book myBook = (Book)obj;
                    System.out.println("Info about book - " + myBook.getName() + ", author - " + myBook.getAuthor()+
                            ", was made in - "+ myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("book to library add " + obj);
                }
            }
        }


        System.out.println("beforeAddBookAdvice: логирование " +
                "попытки получить книгу/журнал");
        System.out.println("------------------------------");
    }

}
