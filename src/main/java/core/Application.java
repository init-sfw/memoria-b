package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@PropertySource("classpath:application.yml")
public class Application {
	
	public static ConfigurableApplicationContext CONTEXT;

    public static void main(String[] args) {
        CONTEXT = SpringApplication.run(Application.class, args);
    }
}
