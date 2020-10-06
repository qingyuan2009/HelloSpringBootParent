package com.rui.demo.controller;


import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// ʹ����@RestController �Ͳ���Ҫ@Controller
public class Exe_001_hello {
    
  //������Ϣת��������ֹ����
    @Bean  //�Զ�����MVC����
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter convert = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return convert;
    }

	@RequestMapping("/")
	//@ResponseBody  ʹ����@RestController �Ͳ���Ҫ@ResponseBody
	public String first() {
		return "Hello World, ���!!!";
	}	
	
	@RequestMapping("/hello/{msg}")  //localhost:8080/hello/rui
	//@ResponseBody  ʹ����@RestController �Ͳ���Ҫ@ResponseBody
	public String hello(@PathVariable String msg) {
		return "Hello World! " + msg;
	}	
	
}