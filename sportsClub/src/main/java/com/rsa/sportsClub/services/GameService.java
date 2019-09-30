package com.rsa.sportsClub.services;

import com.rsa.sportsClub.pojo.Game;
import com.rsa.sportsClub.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {



    @Autowired
    GameRepository gameRepository;

    public List<Game> getAllGames()  {
        return gameRepository.findAll();
    }
}
