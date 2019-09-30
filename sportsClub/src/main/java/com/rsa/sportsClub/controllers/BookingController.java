package com.rsa.sportsClub.controllers;

import com.rsa.sportsClub.pojo.Booking;
import com.rsa.sportsClub.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RequestMapping(value = "/booking")
@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    @RequestMapping(value = "/list")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}
