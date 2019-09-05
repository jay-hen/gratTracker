package com.jesshenry.grattracker;

import org.springframework.context.annotation.Configuration;
import org.springframework. web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public abstract class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/week").setViewName("week");
        registry.addViewController("/add").setViewName("add");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/signup").setViewName("signup");

    }

}