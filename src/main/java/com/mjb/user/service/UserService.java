package com.mjb.user.service;

import com.mjb.user.model.User;

/**
 * @program: MavenSSM
 * @description: ${description}
 * @author: mijiabin
 * @create: 2018-07-26 19:00
 **/
public interface UserService {

    public User selectUser(long userId);
}
