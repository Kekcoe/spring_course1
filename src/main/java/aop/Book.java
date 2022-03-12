package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Test book name")
    private String Name;

    public String getName() {
        return Name;
    }
}
