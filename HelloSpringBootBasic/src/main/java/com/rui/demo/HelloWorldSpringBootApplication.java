package com.rui.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@SpringBootApplication
//���ע�� @SpringBootApplication ������ @EnableAutoConfiguration, @ComponentScan
//@EnableAutoConfiguration
//@ComponentScan("com.rui.demo.controller...")  
@EnableAsync   //�����࿪���첽ִ��
public class HelloWorldSpringBootApplication {
    
    @Bean
    public HttpMessageConverters fastJsonMessageConverter() {
        //����FastJson����Ϣת����
        FastJsonHttpMessageConverter convert =  new FastJsonHttpMessageConverter();
        //����FastJson�����ö���
        FastJsonConfig config = new FastJsonConfig();
        //��Json���ݽ��и�ʽ��
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        convert.setFastJsonConfig(config);
        HttpMessageConverter<?> con = convert;
        return new HttpMessageConverters(con);
    }
    
    
    public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootApplication.class, args);
	}

}