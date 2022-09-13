package com.piaohua.controller;

import com.piaohua.beans.User;
import com.piaohua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/abc")
    public String abc() {
        return "redirect:/userList";
    }


    @RequestMapping("/userList")
    public String userList(Model model) {
        List<User> list = userService.findAll();
        model.addAttribute("list", list);
        return "user_list";
    }
    @RequestMapping("/userAdd")
    public String userAdd(User user, Model model) {
        userService.addUser(user);
        return "redirect:/userList";
    }
    @RequestMapping("/userDelete")
    public String userDelete(Integer id) {
        userService.deleteById( id );
        return "redirect:/userList";
    }
    @RequestMapping("/userInfo")
    public String userInfo(Model model, Integer id) {
        User user = userService.findById( id );
        model.addAttribute("user",user);
        return "user_update";
    }
    @RequestMapping("/userUpdate")
    public String userUpdate(User user) {
        userService.updateById(user);
        return "redirect:/userList";
    }
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        return page;
    }

}
