package com.claudiathalita.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claudiathalita.dslist.dto.GameMinDTO;
import com.claudiathalita.dslist.entities.Game;
import com.claudiathalita.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<Game> result =  gameService.findAll();		 
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
