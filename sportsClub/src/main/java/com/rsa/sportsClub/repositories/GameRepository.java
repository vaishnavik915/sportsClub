package com.rsa.sportsClub.repositories;

import com.rsa.sportsClub.pojo.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends MongoRepository<Game, String>{
}
