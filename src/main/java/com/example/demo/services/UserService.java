package com.example.demo.services;
import org.springframework.stereotype.Service;

import  java.util.*;
@Service
public class UserService {
    public List<String> getAllUsers(){
        return  List.of("A","B");
    }
    public String createUser(){
        System.out.println("User Created!!");
        return  "User Created!!";

    };

}