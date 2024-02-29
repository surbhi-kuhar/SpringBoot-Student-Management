package com.example.EmployeeManagement.Controllers;

import com.example.EmployeeManagement.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    User getEmp(String id){
        User user = users.get(id);
        if(user!=null) return user;
        return null;
    }

    List<User> getAllEmp(){
        List<User>allEmps = new ArrayList<>();

        for(Map.Entry<String,User>entry:users.entrySet()){
            allEmps.add(entry.getValue());
        }

        return allEmps;
    }

}
