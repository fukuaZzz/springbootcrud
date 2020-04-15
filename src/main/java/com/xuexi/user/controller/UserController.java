package com.xuexi.user.controller;

import com.xuexi.user.domain.User;
import com.xuexi.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    public List<User> getAll(Map map) {
        return userService.getAll(map);
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        try {
            userService.delete(id);
            return "success";
        }catch (Exception e){
            return "error";
        }
    }
}
