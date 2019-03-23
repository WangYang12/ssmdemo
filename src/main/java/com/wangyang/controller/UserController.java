package com.wangyang.controller;


import com.wangyang.entity.UserInfo;
import com.wangyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/get")
    public ModelAndView show(){
        ModelAndView mv = null;
        try {
            mv = new ModelAndView("show");
            List<UserInfo> list = service.getAllUser();
            mv.addObject("data",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
}


