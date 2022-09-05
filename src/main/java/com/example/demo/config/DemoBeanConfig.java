package com.example.demo.config;


import com.example.demo.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoBeanConfig {

    @Bean
//    @Qualifier("abc")
    public User createBeanUser(){
        User user = new User();
        user.setFullName("Cybersoft");
        user.setAge(5);
        user.setGender(true);
        return user;
    }


}
