package com.example.demospringaop.controller;

import com.example.demospringaop.model.User;
import com.example.demospringaop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("home")
    @ResponseBody
    public String home() {
        System.out.println("home");
        return "home page";
    }

    @RequestMapping(value = "/new-user", method = RequestMethod.GET)
    public User registerUser(@RequestParam("name") String MyName, @RequestParam("uid") Long MyUid) {
        System.out.println("Create new user.");
        return userService.createUser(MyName, MyUid);
    }
}
