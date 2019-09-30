package com.rsa.sportsClub.controllers;


import com.rsa.sportsClub.pojo.Game;
import com.rsa.sportsClub.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/game")
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/list")
    public List<Game> getAllGames() {
        gameService.getAllGames().forEach(System.out::println);
       return gameService.getAllGames();
    }

}
