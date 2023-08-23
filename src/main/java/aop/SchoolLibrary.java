package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook(String bookName) {
        System.out.println("Мы берем книгу from SchoolLibrary");
    }
}
