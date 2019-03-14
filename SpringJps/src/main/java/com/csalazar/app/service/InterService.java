package com.csalazar.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.csalazar.app.model.Alien;

public interface InterService {

	public List<Alien> getall();
	public List<Alien> getByName(String name);
	public ResponseEntity<String> postAlien(Alien alien);
	public ResponseEntity<String> updateAlien(List<Alien> alien);
	public ResponseEntity<String> deleteAlien(String nombre);
	
}
