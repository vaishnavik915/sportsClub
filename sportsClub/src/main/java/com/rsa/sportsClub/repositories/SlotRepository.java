package com.rsa.sportsClub.repositories;

import com.rsa.sportsClub.pojo.Slot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends MongoRepository<Slot,String> {
}
