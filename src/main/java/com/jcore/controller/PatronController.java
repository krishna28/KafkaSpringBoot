package com.jcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jcore.model.Patron;
import com.jcore.repository.PatronRepository;

@RestController
@EnableMongoRepositories(basePackages="con.jcore.repository")
public class PatronController {
	
	@Autowired
	private PatronRepository patronRepo;
	
	@RequestMapping("/greeting")
	public String sayHello(){
		return "Heelo krishna how are you";
	}
	
	@RequestMapping("/save")
	public String save(){
		Patron p1 = new Patron("Krisna", 29, 5000);
	    patronRepo.save(p1);
	    return "Saved";
	}

}
