package spring_introduction;

import aop.UniLibrary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("aop")
public class MyConfig {

//    @Bean
//    @Scope("singleton")
//    public Pet catBean() {
//        return new Cat();
//    }
//
//    @Bean
//    public Person personBean(){
//        return new Person(catBean());
//    }

    @Bean
    public UniLibrary uniLibraryBean(){
        return new UniLibrary();
    }

}
