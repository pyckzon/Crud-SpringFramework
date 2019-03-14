package com.csalazar.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csalazar.app.model.Alien;
import com.csalazar.app.service.InterService;

@RestController
public class Controller implements ImplController {
	
	@Autowired
	public InterService service;
	
	@PutMapping("/update")
	public String update(String name) {
		//List<Alien> alien= repo.findByName(name);
		return null;
	}
	
	
	@Override
	@GetMapping("/")
	public ResponseEntity<Object> getAll() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.OK).body(service.getall());
	}

	@GetMapping("/byname")
	@Override
	public List<Alien> getAlien(String name) {
		// TODO Auto-generated method stub
		return service.getByName(name);
	}

	@PostMapping(path="/addAlien",consumes="application/json")
	@Override
	public ResponseEntity<String> addAlien(Alien postAlien) {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.OK).body(service.postAlien(postAlien).toString());
	}

	@Override
	public ResponseEntity putAlien(List<Alien> putAlien) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@DeleteMapping("/delete")
	@Override
	public ResponseEntity<String> deleteAlien(String nameAlien) {
		// TODO Auto-generated method stub
		service.deleteAlien(nameAlien);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted!");
	}
}
