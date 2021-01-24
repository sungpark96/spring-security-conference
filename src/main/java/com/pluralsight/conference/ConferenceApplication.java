package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class ConferenceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConferenceApplication.class, args);
    }
}


//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
//@SpringBootApplication
//public class ConferenceApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ConferenceApplication.class, args);
//	}
//
//}
