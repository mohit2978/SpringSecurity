package com.springSecurity.SpringSecurity.Controller;

import com.springSecurity.SpringSecurity.Model.User;
import com.springSecurity.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName){
        return userService.getUser(userName);
    }

    @PostMapping("/")
    public User add( @RequestBody User user){
        return userService.addUser(user);
    }
}
