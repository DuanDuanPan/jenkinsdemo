package com.orient.cssrc.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloConrtoller
 * @description: TODO 类描述
 * @author: enjoyjavapan
 * @date: 2020/8/11 0011
 **/
@RestController
public class HelloConrtoller {

    @GetMapping("/")
    public String sayHelllo() {
        return "hello jenkins";
    }
}
