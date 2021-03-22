package com.example.spring01_ioc01.service;

import com.example.spring01_ioc01.dao.UserDao;
import com.example.spring01_ioc01.dao.UserDaoImpl;
import com.example.spring01_ioc01.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    // 业务层调用dao层
//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();

    // 优化代码, 适应不同用户需求
    private UserDao userDao;

    // 利用set实现动态值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void getUser() {
        userDao.getUser();
    }
}
