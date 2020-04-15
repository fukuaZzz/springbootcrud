package com.xuexi.user.service;


import com.xuexi.user.domain.User;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> getAll(Map map);

    void delete(Integer id);
}
