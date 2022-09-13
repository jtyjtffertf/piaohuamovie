package com.piaohua.dao;

import com.piaohua.beans.User;

import java.util.List;

public interface UserDao {
    //登录
    User logincheck(User user);
    //注册
    void addUser(User user);



    public List<User> findAll();
    public void addUserr(User user);
    public void deleteById(Integer id);
    public User findById(Integer id);
    public void updateById(User user);

}
