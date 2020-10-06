package com.rui.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
	
	//ʹ��spring Ĭ�ϵ�logback
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/show")
	public String show() {
		logger.debug("debug ��־");
		logger.info("info ��־");
		logger.warn("warn ��־");
		logger.error("error ��־");		
		return "show";
	}
}