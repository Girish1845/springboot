package com.example.demo.db;
import jdk.jshell.Snippet;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class UserInfoRepository {
    private String name;
    private String email;
    private String address;
    private String phone;
}