package aop.apects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* get* ())")
    public void allGetMethods(){}
}
