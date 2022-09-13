package com.piaohua.service.impl;

import com.piaohua.beans.User;
import com.piaohua.dao.UserDao;
import com.piaohua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User logincheck(User user) {
        return userDao.logincheck(user);
    }

    @Override
    public void insertUsers(User user) {
        userDao.addUserr(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public void updateById(User user) {
        userDao.updateById(user);
    }



}
