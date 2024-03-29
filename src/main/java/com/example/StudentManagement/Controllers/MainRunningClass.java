package com.example.StudentManagement.Controllers;

import com.example.StudentManagement.Models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class MainRunningClass {

    private final StudentControllers studentControllers;

    public MainRunningClass(StudentControllers studentControllers) {
        this.studentControllers = studentControllers;
    }

    @PostMapping("/post")
    public String create(@RequestBody Student student){
        String id = studentControllers.createEmployee(student);
        return id;
    }

    @GetMapping("/get/{id}")
    public Student get(@PathVariable String id){
        Student student = studentControllers.getStudent(id);
        return student;
    }

    @GetMapping("/getall/{university}")
    public List<Student> getAll(@PathVariable String university){
        return studentControllers.getAllStudentsOfAUniversity(university);
    }


}