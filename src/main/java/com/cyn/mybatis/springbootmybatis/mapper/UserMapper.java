package com.cyn.mybatis.springbootmybatis.mapper;

import com.cyn.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<Users> findAll();

    @Insert("insert into users(name, salary) values(#{name}, #{salary})")
    void insert(Users users);
}
