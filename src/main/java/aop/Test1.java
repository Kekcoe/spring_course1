package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig1.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);


        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.getMagazine();

//        uniLibrary.returnBook();
//        uniLibrary.returnMagazine();
     uniLibrary.addBook("Skek", book);
     uniLibrary.addMagazine();
//
////        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
////        schoolLibrary.getBook();
        context.close();
    }
}