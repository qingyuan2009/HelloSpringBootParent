package com.rui.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration //启用自动配置， 对POM中dependency的架包进行自动配置
@Controller
public class Exe_002_thymeleaf {
    
    @RequestMapping("/thymeleaf")
    //ResponseBody: 返回的是Restful内容，不使用会进行页面跳转， 这里我们需要调到index.jsp页面    
    public String show(Model model) {
        model.addAttribute("word", "Ben");
        return "thymeleaf";
    }
}