package com.example.StudentManagement.Controllers;

import com.example.StudentManagement.Models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentControllers {

    Map<String, Student> students  = new HashMap<>();

    String createEmployee(Student student){
        Student newStudent = new Student(student.getName(), student.getAge(),student.getAdhar(),student.getUniversity());
        students.put(newStudent.getId(), newStudent);
        return newStudent.getId();
    }

    Student getStudent(String id){
        Student student = students.get(id);
        if(student !=null) return student;
        return null;
    }

}
