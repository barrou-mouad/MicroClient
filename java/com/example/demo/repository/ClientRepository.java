package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entities.Client;

public interface ClientRepository extends MongoRepository<Client, String>{

public Client getClientByCodeClient(String codeClient);
}
