package com.mjb.user.controller;

import com.mjb.user.model.User;
import com.mjb.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: MavenSSM
 * @description: ${description}
 * @author: mijiabin
 * @create: 2018-08-01 10:27
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/showUser.do")
    public ModelAndView selectUser(ModelAndView mv, @RequestParam String id) throws IOException {
        long userId = Long.parseLong(id);
        User user = this.userService.selectUser(userId);

        List<User> list = new ArrayList<User>();
        if(user != null){
            list.add(user);
        }
        ModelAndView modelAndView = new ModelAndView("../../index");
        modelAndView.addObject("userList", list);
        return modelAndView;
    }
}
