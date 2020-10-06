package com.rui.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ConfigurationProperties(prefix="book")
//��ȡapplication.yml�е��Զ�������
public class Exe_002_properties {
		
	//����1-----------------------------------------------------------
	@Value("${book.author}")
	private String author2;
		
	@Value("${book.name}")
	private String name2;	
	
	//����2:----------------------------------------------------------
	//@ConfigurationProperties(prefix="book") ���Ͱ�ȫ������
	//@Value("${book.author}")     ����Ҫʹ��@Value
	private String author;
		
	//@Value("${book.name}")
	private String name;	
		
	//������ʵ��Get�� Set ����
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
		
	public String getName() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}	

	//---------------------------------------------------------------
	@RequestMapping("/property")
	@ResponseBody	
	public String showInfo() {
		return author2 + ":" + name2 + ";" + author + ":" + name ;
		
	}	
}