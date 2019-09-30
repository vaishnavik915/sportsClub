package com.rsa.sportsClub.controllers;

import com.rsa.sportsClub.pojo.Slot;
import com.rsa.sportsClub.services.SlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/slot")
@RestController
public class SlotController {

    @Autowired
    SlotService slotService;

    @RequestMapping("/list")
    public List<Slot> getAllSlots() {
        return slotService.getAllSlots();
    }
}
