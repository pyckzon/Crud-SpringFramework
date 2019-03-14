package com.csalazar.app.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.csalazar.app.model.Alien;

public interface ImplController {

	
	public ResponseEntity<Object> getAll();
	public List<Alien> getAlien(String name);
	public ResponseEntity<String> addAlien( @RequestBody Alien postAlien);
	public ResponseEntity<String> putAlien(List<Alien> putAlien);
	public ResponseEntity<String> deleteAlien(String nameAlien);
	
}
