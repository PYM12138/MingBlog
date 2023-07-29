package com.pym.mingblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Ming
 * @Date 2023/6/6 23:42
 * @Description: 首页后台操作编写
 */
@Controller
public class DirectLinkController {
    //直链跳转
    //前台
    @GetMapping("/")
    public String index() {
        return "index";
    }
    //文章页
    @GetMapping("/article")
    public String article() {
        return "article";
    }

    //归档页
    @GetMapping("/archive")
    public String archive() {
        return "archive";
    }

    //学习页
    @GetMapping("/learn")
    public String learn() {
        return "learn";
    }

    //更新日记
    @GetMapping("/updateRecord")
    public String updateRecord() {
        return "updateRecord";
    }

    //关于我
    @GetMapping("/aboutMe")
    public String aboutMe() {
        return "aboutMe";
    }

    //登录注册找回密码
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/recoverPassword")
    public String recoverPassword() {
        return "recoverPassword";
    }

    @GetMapping("/forgotPassword")
    public String forgotPassword() {
        return "forgotPassword";
    }


    //后台
    //首页
    @GetMapping("/adminIndex")
    public String adminIndex() {
        return "admin/index";
    }

    //文章编辑页
    @GetMapping("/adminEdit")
    public String adminEdit() {
        return "admin/edit";
    }

    //文章管理页
    @GetMapping("/adminMA")
    public String adminManagerArticle() {
        return "admin/managerArticle";
    }

    //文章操作记录
    @GetMapping("/adminAL")
    public String adminArticleLog() {
        return "admin/articleLog";
    }

    //用户管理页
    @GetMapping("/adminUser")
    public String adminUser() {
        return "admin/managerUser";
    }

    //用户详情页
    @GetMapping("/userPage")
    public String userPage() {
        return "admin/userPage";
    }

    //评论审核
    @GetMapping("/newMessage")
    public String newMessage() {
        return "admin/newMessage";
    }

    //历史评论
    @GetMapping("/historyMessage")
    public String historyMessage() {
        return "admin/historyMessage";
    }


}
