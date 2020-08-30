package com.DaoImpl;

import com.Dao.UserDao;
import com.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserDaoImpl implements UserDao {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void add(User user) {
        mongoTemplate.save(user);
    }


}
