package introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig2 {

    @Bean
    @Scope("singleton")
    public Pet dogBean(){
        return new Dog();
    }

    @Bean
    public Person personBean(){
        return new Person(dogBean());
    }
}
