package com.mjb.user.service.impl;

import com.mjb.user.dao.UserDao;
import com.mjb.user.model.User;
import com.mjb.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: MavenSSM
 * @description: ${description}
 * @author: mijiabin
 * @create: 2018-07-26 19:01
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
