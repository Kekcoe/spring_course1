package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу from UniLibrary");
        System.out.println("------------------------------");
    }

    public void returnBook(){
        System.out.println("We are returning book to uniLibrary");
        System.out.println("------------------------------");
    }

    public void getMagazine(){
        System.out.println("We are getting magazine");
        System.out.println("------------------------------");
    }

    public void returnMagazine(){
        System.out.println("We are returning magazine to uniLibrary");
        System.out.println("------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы are adding книгу from UniLibrary");
        System.out.println("------------------------------");
    }

    public void addMagazine(){
        System.out.println("We are adding magazine to UniLibrary ");
        System.out.println("------------------------------");
    }

    @Override
    public void getBook(String bookName) {

    }
}
