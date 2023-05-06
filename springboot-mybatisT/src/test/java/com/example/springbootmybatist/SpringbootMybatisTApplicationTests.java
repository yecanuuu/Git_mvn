package com.example.springbootmybatist;

import com.example.mapper.UserMapper;
import com.example.polo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest//springboot整合单元测试的注解
class SpringbootMybatisTApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testListUser(){
        List<User> userList=userMapper.list();
        System.out.println(userList);
    }

}
