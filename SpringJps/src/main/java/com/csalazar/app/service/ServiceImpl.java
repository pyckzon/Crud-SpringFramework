package com.csalazar.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.csalazar.app.model.Alien;
import com.csalazar.app.model.dao.AlienDao;
import com.csalazar.app.repository.InterRepository;
import com.csalazar.app.repository.RepositoryImpl;


@Service
public class ServiceImpl implements InterService {

	@Autowired
	AlienDao repo;
	
	@Autowired
	InterRepository repo2;
	
	@Override
	public List<Alien> getall() {
		// TODO Auto-generated method stub
		return (List<Alien>) repo.findAll();
	}

	@Override
	public ResponseEntity<String> postAlien(Alien alien) {
		// TODO Auto-generated method stub
		repo.save(alien);
		return ResponseEntity.status(HttpStatus.OK).body("Saved!!!");
	}

	@Override
	public ResponseEntity<String> updateAlien(List<Alien> alien) {
		return null;
		// TODO Auto-generated method stub
	}


	@Override
	public List<Alien> getByName(String name) {
		// TODO Auto-generated method stub
		//repo2.findByName(name);
		return repo.findAllByName(name);
	}

	@Override
	public ResponseEntity<String> deleteAlien(String nombre) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
