package com.example.spring01_ioc01.dao;

public class UserDaoOracleImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据");
    }
}
