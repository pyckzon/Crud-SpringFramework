package com.csalazar.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csalazar.app.model.Alien;
import com.csalazar.app.model.Player;

@Repository
public interface InterRepository extends CrudRepository<Alien, Integer> {

	void findByName(String name);

}
