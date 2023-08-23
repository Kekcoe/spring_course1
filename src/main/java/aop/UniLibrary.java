package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book){
        System.out.println("Мы берем книгу from UniLibrary " + book.getName());
    }

    public String returnBook(){
        System.out.println("We are returning book to uniLibrary");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("We are getting magazine");
    }

    @Override
    public void getBook(String bookName) {

    }
}
