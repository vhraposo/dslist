package com.gamesproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesproject.dslist.entities.Game;
import com.gamesproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
