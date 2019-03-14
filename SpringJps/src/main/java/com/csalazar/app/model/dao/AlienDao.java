package com.csalazar.app.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csalazar.app.model.Alien;

@Repository
public interface AlienDao extends CrudRepository<Alien, Integer> {
	public List<Alien> findAllByName(String name);
}
