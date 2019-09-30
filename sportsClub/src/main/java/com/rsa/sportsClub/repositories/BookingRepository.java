package com.rsa.sportsClub.repositories;

import com.rsa.sportsClub.pojo.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking,String>{
}
