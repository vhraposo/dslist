package com.gamesproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamesproject.dslist.dto.GameDTO;
import com.gamesproject.dslist.dto.GameListDTO;
import com.gamesproject.dslist.dto.GameMinDTO;
import com.gamesproject.dslist.entities.Game;
import com.gamesproject.dslist.entities.GameList;
import com.gamesproject.dslist.repositories.GameListRepository;
import com.gamesproject.dslist.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository; 
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
}
