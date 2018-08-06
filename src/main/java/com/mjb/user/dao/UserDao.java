package com.mjb.user.dao;

import com.mjb.user.model.User;

/**
 * @program: MavenSSM
 * @description: ${description}
 * @author: mijiabin
 * @create: 2018-07-26 19:03
 **/
public interface UserDao {

    User selectUser(long id);
}
