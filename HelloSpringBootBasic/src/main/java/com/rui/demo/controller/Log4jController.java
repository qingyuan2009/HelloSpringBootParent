package com.rui.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Log4jController {
	
	//ʹ��spring Ĭ�ϵ�backlog
 	//private static Logger logger = Logger.getLogger(Log4jController.getClass);

	@RequestMapping("/log4j")
	public String show() {
		//logger.debug("debug ��־");
		//logger.info("info ��־");
		//logger.warn("warn ��־");
		//logger.error("error ��־");		
		return "show";
	}
}
