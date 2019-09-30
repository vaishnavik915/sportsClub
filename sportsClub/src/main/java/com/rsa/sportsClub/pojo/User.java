package com.rsa.sportsClub.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "user")
public class User {

    @Id
    private String userId;
    private String name;
    // the flat number of the society
    private  String flatNumber;

    public User(String userId, String name, String flatNumber) {
        this.userId = userId;
        this.name = name;
        this.flatNumber = flatNumber;
    }

    public User() {}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
