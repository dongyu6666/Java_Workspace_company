package com.fawvw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//如果定制个性化功能，写这个组件，将其交给Springboot，Springboot就会自动装配
//扩展SpringMVC,dispatchservlet
@Configuration
//@EnableWebMvc
public class MyMvcConfig implements WebMvcConfigurer {


}
