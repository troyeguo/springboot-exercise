package vip.memberly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import vip.memberly.mapper.UserMapper;
import vip.memberly.pojo.User;

import java.util.List;

@Controller
@ConfigurationProperties(prefix = "person")
public class UserController {

    private String username;

    @Autowired(required = false)
    private UserMapper userMapper;

    public void setUsername(String username) {
        this.username = username;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String getIndex(){
        return username+"username";
    }

    @RequestMapping("/query")
    @ResponseBody
    public List<User> getAllUser(){
        List<User> users = userMapper.getAllUser();
        return users;
    }
}
