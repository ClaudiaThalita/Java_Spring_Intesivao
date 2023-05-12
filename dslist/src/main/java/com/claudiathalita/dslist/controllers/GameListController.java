package com.claudiathalita.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claudiathalita.dslist.dto.GameDTO;
import com.claudiathalita.dslist.dto.GameListDTO;
import com.claudiathalita.dslist.dto.GameMinDTO;
import com.claudiathalita.dslist.services.GameListService;
import com.claudiathalita.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;	

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}