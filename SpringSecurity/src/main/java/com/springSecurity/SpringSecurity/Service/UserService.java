package com.springSecurity.SpringSecurity.Service;

import com.springSecurity.SpringSecurity.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> userList;

    UserService(){
        userList=new ArrayList<>();
        userList.add(new User("abc","def","abc@def.com"));
        userList.add(new User("xyz","def","xyz@def.com"));
    }

    public List<User> getAllUser(){
        return this.userList;
    }

    public User getUser(String userName){
       return userList.stream().filter(user ->
            user.getUserName().equals(userName)
        ).findAny().orElse(null);
    }

   public User addUser(User user){
        userList.add(user);
        return user;
    }


}
