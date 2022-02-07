package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;

import com.example.demo.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {
@Autowired
ClientService clientService;
@GetMapping("/all")
public List<Client> getAll(){
	
return clientService.getAll()	;
}
@GetMapping("by/{id}")
public Client getId(@PathVariable String id){
return clientService.getClientById(id)	;
}

@GetMapping("delete/{id}")
public void delete(@PathVariable String id){
 clientService.delete(id)	;
}

@PostMapping(value = "save")
public Client save(@RequestBody Client client) {
	//TODO: process POST request
	clientService.save(client);
	return client;

}
@GetMapping("code/{code}")
public Client getByode(@PathVariable String code) {	
	return clientService.clientByCode(code);
}


@GetMapping("clientDelete/{code}")
public void deleteByode(@PathVariable String code) {	
	 clientService.delete(code);
}


}
