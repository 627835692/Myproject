package com.ServiceImpl;

import com.Dao.UserDao;
import com.Service.UserService;
import com.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public void add(User user) {
        userDao.add(user);
    }



}
