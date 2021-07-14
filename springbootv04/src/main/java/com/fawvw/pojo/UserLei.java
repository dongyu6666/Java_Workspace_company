package com.fawvw.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "userlei")
//@Validated //数据校验

public class UserLei {

    //@Email(message = "邮箱错误")
    private String username;
    private String password;

    public UserLei() {
    }

    public UserLei(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLei{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
