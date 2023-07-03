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

    @GetMapping("/article")
    public String article() {
        return "article";
    }

    @GetMapping("/archive")
    public String archive() {
        return "archive";
    }

    @GetMapping("/learn")
    public String learn() {
        return "learn";
    }

    @GetMapping("/updateRecord")
    public String updateRecord() {
        return "updateRecord";
    }

    @GetMapping("/aboutMe")
    public String aboutMe() {
        return "aboutMe";
    }

    //后台
    @GetMapping("/adminIndex")
    public String indexAdmin() {
        return "admin/index";
    }

    @GetMapping("/adminEdit")
    public String editAdmin() {
        return "admin/edit";
    }


}
