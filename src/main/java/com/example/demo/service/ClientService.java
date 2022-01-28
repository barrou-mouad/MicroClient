package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;


public interface ClientService {
public Client save(Client client);
public Client update(Client client);
public Client getClientById(String id);
public void delete(String id);
public List<Client> getAll();
public Client clientByCode(String code);
}
