package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Мы берем книгу из UniversityLibrary");
    }

    public String returnBook(){
        System.out.println("Мы  возвращаем книгу в UniversityLibrary");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniversityLibrary");
    }

    public void returnLibrary(){
        System.out.println("Мы возвращаем книгу в UniversityLibrary ");
    }
}
