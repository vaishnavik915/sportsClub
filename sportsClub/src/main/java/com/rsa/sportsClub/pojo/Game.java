package com.rsa.sportsClub.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "game")
public class Game {
    @Id
    private String gameId;
    private String name;
    private Club club;

    public Game(String name, Club club, String gameId) {
        this.gameId = gameId;
        this.name = name;
        this.club = club;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
