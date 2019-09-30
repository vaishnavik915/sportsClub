package com.rsa.sportsClub.controllers;

import com.rsa.sportsClub.pojo.User;
import com.rsa.sportsClub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RequestMapping(value = "/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/hello")
    public List<User> sayHello() {
        return Arrays.asList(new User("1234","Ram", "3B6"));
    }
}
