package com.mbs.mongo_rabbitmq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mbs.mongo_rabbitmq.entity.User;
import com.mbs.mongo_rabbitmq.repository.UserRepository;
import com.mbs.mongo_rabbitmq.service.UserService;

@SpringBootApplication
public class MainApplication {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return (args) -> {

            try {

                Query query = new Query()
                        .addCriteria(Criteria.where("age").is(39));

                List<User> list = mongoTemplate.find(query,User.class);

                System.out.println(list);

            } catch (Exception e) {
                e.printStackTrace();
            }

        };
    }
}
