package com.xuexi.user.service.impl;

import com.xuexi.user.dao.UserDao;
import com.xuexi.user.domain.User;
import com.xuexi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll(Map map)  {
        return userDao.getAll(map);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
