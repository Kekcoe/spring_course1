package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("Мы берем книгу from UniLibrary");
    }

    public void returnBook(){
        System.out.println("We are returning book to uniLibrary");
    }

    public void getMagazine(){
        System.out.println("We are getting magazine");
    }

    public void returnMagazine(){
        System.out.println("We are returning magazine to uniLibrary");
    }

    public void addBook(){
        System.out.println("Мы are adding книгу from UniLibrary");
    }

    public void addMagazine(){
        System.out.println("We are adding magazine to UniLibrary ");
    }

    @Override
    public void getBook(String bookName) {

    }
}
