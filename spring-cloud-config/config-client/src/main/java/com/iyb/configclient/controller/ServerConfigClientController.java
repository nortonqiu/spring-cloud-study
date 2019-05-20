package com.iyb.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerConfigClientController {

    @Value("${user.nickname}")
    String nickname;

    @Value("${user.school}")
    String school;

    @Value("${user.master}")
    String master ;

    @Value("${environment}")
    String environment ;

    @RequestMapping(value = "/user/info")
    public String hi(){
        return "姓名：" + nickname + ", 大学：" + school + ", 专业：" + master+ ",环境：" + environment ;
    }
}
