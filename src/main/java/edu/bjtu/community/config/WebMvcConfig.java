package edu.bjtu.community.config;

import edu.bjtu.community.controller.interceptor.DataInterceptor;
import edu.bjtu.community.controller.interceptor.LoginTicketInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Autowired
    private LoginTicketInterceptor loginTicketInterceptor;   // 凭证


    @Autowired
    private DataInterceptor dataInterceptor;        // DAU UV

    @Override
    public void addInterceptors(InterceptorRegistry registry) {



        registry.addInterceptor(loginTicketInterceptor)
                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg");


        registry.addInterceptor(dataInterceptor)
                .excludePathPatterns("/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg");


    }

}
