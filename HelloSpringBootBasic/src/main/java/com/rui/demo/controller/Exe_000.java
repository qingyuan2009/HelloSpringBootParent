package com.rui.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration //�����Զ����ã� ��POM��dependency�ļܰ������Զ�����
@Controller
public class Exe_000 {
    
    @RequestMapping("/first")
    //ResponseBody: ���ص���Restful���ݣ���ʹ�û������ת
    @ResponseBody
    public String first() {
        return "Hello World!";
    }
    
    //��׼ִ����ڣ�һ���ʹ��������ȡ��
    public static void main(String[] args) {
        SpringApplication.run(Exe_000.class, args);
    }

}