package com.sxl.itheimaspringboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//@Runwith(SpringRunner.class)
// Springboot 2.4.0及以上版本使用Junit5，不需要加@Runwith
@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void test_add() {
        userService.add();
    }
}