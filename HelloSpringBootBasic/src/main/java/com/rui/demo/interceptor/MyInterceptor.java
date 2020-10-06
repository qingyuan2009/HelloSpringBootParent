package com.rui.demo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration  //�������Ǹ�����
public class MyInterceptor extends WebMvcConfigurerAdapter {
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        HandlerInterceptor inter = new HandlerInterceptor() {

            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
                    throws Exception {
                System.out.println("�Զ���������...");                
                //return HandlerInterceptor.super.preHandle(request, response, handler);
                return true;     //����������           
            }

            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                    ModelAndView modelAndView) throws Exception {
                // TODO Auto-generated method stub
                HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
            }

            @Override
            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                    Exception ex) throws Exception {
                // TODO Auto-generated method stub
                HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
            }    
        };
        
        //ע��������
        registry.addInterceptor(inter).addPathPatterns("/**");  //��������·��
    }

}
