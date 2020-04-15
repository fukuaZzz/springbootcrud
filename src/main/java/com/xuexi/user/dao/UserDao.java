package com.xuexi.user.dao;

import com.xuexi.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    public List<User> getAll(@Param("content")Map map);

    void delete(Integer id);
}
