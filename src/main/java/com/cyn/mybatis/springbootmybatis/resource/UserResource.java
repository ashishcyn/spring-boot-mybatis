package com.cyn.mybatis.springbootmybatis.resource;

import com.cyn.mybatis.springbootmybatis.mapper.UserMapper;
import com.cyn.mybatis.springbootmybatis.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    private UserMapper userMapper;

    public UserResource(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

   @GetMapping("/all")
    public List<Users> getAll() {
        return userMapper.findAll();
    }

    @GetMapping("/insert")
    public List<Users> insert() {
        Users users = new Users();
        users.setName("Tom");
        users.setSalary("10000");
        userMapper.insert(users);
        return userMapper.findAll();
    }

}
