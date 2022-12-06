package com.example.demo;

import com.example.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xmz
 * @Description
 * @Date 2022/12/06 21:26
 **/
@RestController
public class DemoController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String helloWorld() {
        System.out.println(userDao.selectAll());
        return "hello world";
    }
}
