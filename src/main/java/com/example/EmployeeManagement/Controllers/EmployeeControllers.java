package com.example.EmployeeManagement.Controllers;

import com.example.EmployeeManagement.Models.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeControllers {

    Map<String, User> users  = new HashMap<>();

    String createEmployee(User user){
        User newUser = new User(user.getName(),user.getAge());
        users.put(newUser.getId(), newUser);
        return newUser.getId();
    }

}
