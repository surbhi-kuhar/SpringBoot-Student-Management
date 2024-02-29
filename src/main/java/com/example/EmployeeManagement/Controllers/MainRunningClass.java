package com.example.EmployeeManagement.Controllers;

import com.example.EmployeeManagement.Models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class MainRunningClass {

    private final EmployeeControllers employeeControllers;

    public MainRunningClass(EmployeeControllers employeeControllers) {
        this.employeeControllers = employeeControllers;
    }

    @PostMapping("/post")
    public String create(@RequestBody User user){
        String id = employeeControllers.createEmployee(user);
        return id;
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable String id){
        User user = employeeControllers.getEmp(id);
        return user;
    }

}