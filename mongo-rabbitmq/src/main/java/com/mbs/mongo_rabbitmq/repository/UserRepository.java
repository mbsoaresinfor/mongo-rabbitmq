package com.mbs.mongo_rabbitmq.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mbs.mongo_rabbitmq.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

}
