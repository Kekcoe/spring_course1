package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.MyConfig;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig1.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();

        System.out.println("Book returned to library " + bookName);
        context.close();

        System.out.println("Method main ends");
    }
}
