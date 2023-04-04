package com.hello.devopsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName testController
 * @Description TODO
 * @Author lihao
 * @Date 2023/4/4 9:52
 * @Version 1.0
 */
@Controller
public class testController {
    @RequestMapping("/")
    public String hello(){
        return "index";
    }
}
