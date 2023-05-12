package com.claudiathalita.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudiathalita.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
