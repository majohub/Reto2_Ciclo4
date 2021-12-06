package com.usa;

import com.usa.repositories.crud.CloneCrudRepository;
import com.usa.repositories.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class ProyectoReto2Application implements CommandLineRunner {

    @Autowired
    private CloneCrudRepository cloneCrudRepository;

    @Autowired
    private UserCrudRepository userCrudRepository;



    public static void main(String[] args) {
        SpringApplication.run(ProyectoReto2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cloneCrudRepository.deleteAll();
        userCrudRepository.deleteAll();


    }
}











