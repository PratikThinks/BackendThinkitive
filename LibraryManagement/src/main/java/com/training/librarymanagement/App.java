package com.training.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.sql.DriverManager;


/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication springApplication = new SpringApplication(App.class);
        ConfigurableApplicationContext context = springApplication.run();


    }



}

@Component
class Example{

}
