package com.rsa.sportsClub.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "booking")
public class Booking {

    @Id
    private String bookingId;
    private Game game;
    private Slot slot;
    private List<User> users;

    public Booking(Game game, Slot slot, List<User> users) {
        //this.bookingId = bookingId;
        this.game = game;
        this.slot = slot;
        this.users = users;
    }

    public Booking() { }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public List<User> getUser() {
        return users;
    }

    public void setUser(User user) {
        this.users = users;
    }
}
