package com.rsa.sportsClub.pojo;

public class Club {

    private String name;
    private String location;

    public Club(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Club(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
