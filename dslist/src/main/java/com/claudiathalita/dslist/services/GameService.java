package com.claudiathalita.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudiathalita.dslist.dto.GameMinDTO;
import com.claudiathalita.dslist.entities.Game;
import com.claudiathalita.dslist.repositories.GameRepository;

@Service	 
public class GameService {
	
	@Autowired
	private GameRepository gamerepository;

	public List<Game> findAll(){
		
		List<Game> result = gamerepository.findAll();
		
		return result;
	}
}
