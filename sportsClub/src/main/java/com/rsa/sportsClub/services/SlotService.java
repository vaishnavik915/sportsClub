package com.rsa.sportsClub.services;

import com.rsa.sportsClub.pojo.Slot;
import com.rsa.sportsClub.repositories.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlotService {

    @Autowired
    SlotRepository slotRepository;


    public List<Slot> getAllSlots(){
        return slotRepository.findAll();
    }
}
