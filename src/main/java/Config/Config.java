package Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Writer write() {
        return new Writer();
    }

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public Reader reader() {
        return new Reader();
    }

    @Bean
    public Action action(Writer writer, Reader reader, Calculator calculator) {
        return new Action(writer, reader, calculator);
    }

}
