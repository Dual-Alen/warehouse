package com.nchu.warehouse.controller;


import com.nchu.warehouse.entity.User;
import com.nchu.warehouse.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.security.auth.Subject;
import javax.xml.transform.Result;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author youmoweidai
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/warehouse/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/api/login")
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getName();
        username = HtmlUtils.htmlEscape(username);

        Subject subject = SecurityUtils.getSubject();
//        subject.getSession().setTimeout(10000);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, requestUser.getPassword());
        usernamePasswordToken.setRememberMe(true);
        try {
            subject.login(usernamePasswordToken);
            User user = userService.findByUsername(username);
            if (!user.isEnabled()) {
                return ResultFactory.buildFailResult("该用户已被禁用");
            }
            return ResultFactory.buildSuccessResult(username);
        } catch (IncorrectCredentialsException e) {
            return ResultFactory.buildFailResult("密码错误");
        } catch (UnknownAccountException e) {
            return ResultFactory.buildFailResult("账号不存在");
        }
    }

    @GetMapping("/api/logout")
    public Result logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return ResultFactory.buildSuccessResult("成功登出");
    }

    @GetMapping("/api/authentication")
    public String authentication() {
        return "身份认证成功";
    }
}

//public class LoginController {
//
//    @Autowired
//    UserService userService;
//
//    @PostMapping("/api/login")
//    public Result login(@RequestBody User requestUser) {
//        String username = requestUser.getUsername();
//        username = HtmlUtils.htmlEscape(username);
//
//        Subject subject = SecurityUtils.getSubject();
////        subject.getSession().setTimeout(10000);
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, requestUser.getPassword());
//        usernamePasswordToken.setRememberMe(true);
//        try {
//            subject.login(usernamePasswordToken);
//            User user = userService.findByUsername(username);
//            if (!user.isEnabled()) {
//                return ResultFactory.buildFailResult("该用户已被禁用");
//            }
//            return ResultFactory.buildSuccessResult(username);
//        } catch (IncorrectCredentialsException e) {
//            return ResultFactory.buildFailResult("密码错误");
//        } catch (UnknownAccountException e) {
//            return ResultFactory.buildFailResult("账号不存在");
//        }
//    }
//
//    @PostMapping("/api/register")
//    public Result register(@RequestBody User user) {
//        int status = userService.register(user);
//        switch (status) {
//            case 0:
//                return ResultFactory.buildFailResult("用户名和密码不能为空");
//            case 1:
//                return ResultFactory.buildSuccessResult("注册成功");
//            case 2:
//                return ResultFactory.buildFailResult("用户已存在");
//        }
//        return ResultFactory.buildFailResult("未知错误");
//    }
//
//    @GetMapping("/api/logout")
//    public Result logout() {
//        Subject subject = SecurityUtils.getSubject();
//        subject.logout();
//        return ResultFactory.buildSuccessResult("成功登出");
//    }
//
//    @GetMapping("/api/authentication")
//    public String authentication() {
//        return "身份认证成功";
//    }
//}
