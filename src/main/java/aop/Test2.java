package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig1.class);
        University university =  context.getBean("university", University.class);
try{
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);}
catch(Exception e){
    System.out.println(" Was throwing exception " + e);
}
        context.close();
    }


}