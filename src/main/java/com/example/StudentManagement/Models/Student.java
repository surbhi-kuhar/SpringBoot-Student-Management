package com.example.StudentManagement.Models;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.SecureRandom;

@Getter
@Setter
@NoArgsConstructor
public class Student {
    private String id;
    private String name;
    private String adhar;
    private String university;
    private int age;

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    private String generateRandomId(int length) {
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }


    public Student(String name, int age, String adhar, String university) {
        this.id = generateRandomId(10);
        this.name = name;
        this.age = age;
        this.adhar = adhar;
        this.university = university;
    }

}
