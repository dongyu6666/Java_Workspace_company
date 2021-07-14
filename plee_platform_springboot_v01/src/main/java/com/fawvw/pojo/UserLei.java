package com.fawvw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserLei implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String department;
    private String group;
    private String status;
    private String role_name;


}
