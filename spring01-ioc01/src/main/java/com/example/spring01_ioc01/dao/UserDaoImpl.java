package com.example.spring01_ioc01.dao;

public class UserDaoImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("默认获取用户的数据");
    }
}
