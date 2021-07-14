package com.fawvw;

import com.fawvw.pojo.UserLei;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootv04ApplicationTests {
    @Autowired
    private UserLei userlei;
    @Test
    void contextLoads() {
        System.out.println(userlei);
    }

}
