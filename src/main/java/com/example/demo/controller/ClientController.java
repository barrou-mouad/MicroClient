package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Account;
import com.example.demo.entities.Client;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {
@Autowired
ClientService clientService;
@Autowired
AccountRepository accountService;
	
@GetMapping("/test")
public String sayHello() {
	return "hello ";
}
	
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
@PostMapping("account/{id}")
public Account saveAccount(@RequestBody Account account,@PathVariable(name="id") String id) {
	//TODO: process POST request
 //   System.out.println(account.getClient().getId());
//	Account a=new Account(account.getId(),account.getAddress(),account.getPrivateKey());
//	accountService.save(account);
   // account=accountService.save(account);
   // Account a=new Account();
    //a.setId(account.getId());
    //a.setAddress(account.getAddress());
  //  a.setPrivateKey(account.getPrivateKey());
	//account.getClient().getAccounts().add(a);
//	System.out.println();
	//
	//c1.getAccounts().add(a);
//	System.out.println(account.getClient().getId());
	account=	accountService.save(account);
	Client c= clientService.getClientById(id);
	c.getAccounts().add(account);
	clientService.save(c);

	return account;
}
@GetMapping("code/{code}")
public Client getByode(@PathVariable String code) {	
	return clientService.clientByCode(code);
}



}
