package com.piaohua.service;

import com.piaohua.beans.User;

import java.util.List;

public interface UserService {
    //登录
    User logincheck(User user);
    //用户注册
    void insertUsers(User user);



    public List<User> findAll();

    public void addUser(User user);

    public void deleteById(Integer id);

    public User findById(Integer id);

    public void updateById(User user);

}
