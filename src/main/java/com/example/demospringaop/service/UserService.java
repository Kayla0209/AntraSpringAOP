package com.example.demospringaop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringaop.model.*;

@Service
public class UserService {

    public User createUser(String name, Long uid) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setUid(uid);
        return newUser;
    }
}
