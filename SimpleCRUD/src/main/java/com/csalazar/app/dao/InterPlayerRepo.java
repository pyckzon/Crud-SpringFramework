package com.csalazar.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.csalazar.app.model.Player;

public interface InterPlayerRepo extends CrudRepository<Player, Integer> {
	List<Player> findBynickname(String nickname);
}
