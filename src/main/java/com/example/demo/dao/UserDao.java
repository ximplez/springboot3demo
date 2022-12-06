package com.example.demo.dao;

import com.example.demo.entiy.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author xmz
 * @Description
 * @Date 2022/12/06 21:33
 **/
@Mapper
public interface UserDao {
    public User selectAll();
}
