package com.piaohua.controller;

import com.piaohua.beans.User;
import com.piaohua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("user")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("show-login")
    public String showLogin(){
        return "login";
    }
    @RequestMapping("login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if (userService.logincheck(user) !=null && username!=" " && password!=" "){
            model.addAttribute("username",username);
            return "redirect:/abc";
        }else {
            model.addAttribute("flag","账号或密码错误......");
            return "login";
        }
    }






    @RequestMapping("show-regist")
    public String showRegist(){
        return "regist";
    }
    @RequestMapping("regist")
    public String regist(User user,Model model){
        System.out.println("用户注册："+user.getUsername()+user.getPassword());
        user.setId(1);
        userService.insertUsers(user);
        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }
}
