package com.cyn.mybatis.springbootmybatis.mapper;

import com.cyn.mybatis.springbootmybatis.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<Users> findAll();

    @Insert("insert into users(name, salary) values(#{name}, #{salary})")
    void insert(Users users);

    @Update("update users set salary=#{salary} where name=#{name}")
    void update(Users users);

    @Delete("delete from users where name=#{name}")
    void delete(Users users);
}
