package com.itsartyomka.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user{id}")
public class UserController {
    private UserService userService;
    public User getUser(@PathVariable Long id){
        return userService.getById(id);
    }
}
