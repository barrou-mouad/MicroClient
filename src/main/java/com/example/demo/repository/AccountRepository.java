package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.Account;

public interface AccountRepository extends MongoRepository<Account, String>{

}
