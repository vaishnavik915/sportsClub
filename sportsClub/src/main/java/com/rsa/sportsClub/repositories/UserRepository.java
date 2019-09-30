package com.rsa.sportsClub.repositories;

import com.rsa.sportsClub.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String>{
}
