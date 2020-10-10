package com.rui.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration //�����Զ����ã� ��POM��dependency�ļܰ������Զ�����
@Controller
public class Exe_001_freemarker {
    
    @RequestMapping("/page")
    //ResponseBody: ���ص���Restful���ݣ���ʹ�û����ҳ����ת�� ����������Ҫ����index.jspҳ��    
    public String show(Model model) {
        model.addAttribute("name", "Ben");
        return "show";
    }
}