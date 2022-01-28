package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Client;
import com.example.demo.repository.ClientRepository;
@Service
public class ClientServiceImp implements ClientService{
   @Autowired
   ClientRepository clrep;
	@Override
	public Client save(Client client) {
	    return	clrep.save(client);	
	}

	@Override
	public Client update(Client client) {
		return	clrep.save(client);
	}

	@Override
	public void delete(String id) {
		clrep.delete(getClientById(id));
		
	}

	@Override
	public Client getClientById(String id) {
		return clrep.findById(id).get();
	}

	@Override
	public List<Client> getAll() {
		return clrep.findAll();
	}

	@Override
	public Client clientByCode(String code) {
		return clrep.getClientByCodeClient(code);
	}

}
