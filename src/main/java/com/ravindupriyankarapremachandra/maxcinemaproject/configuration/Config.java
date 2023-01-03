package com.ravindupriyankarapremachandra.maxcinemaproject.configuration;

import org.springframework.context.annotation.Bean;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class Config {
    @Bean
    public ClassLoaderTemplateResolver primaryTemplateResolver() {
        ClassLoaderTemplateResolver primaryTemplateResolver = new ClassLoaderTemplateResolver();
        primaryTemplateResolver.setPrefix("templates/");
        primaryTemplateResolver.setSuffix(".html");
        primaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
        primaryTemplateResolver.setCharacterEncoding("UTF-8");
        primaryTemplateResolver.setOrder(1);
        primaryTemplateResolver.setCheckExistence(true);
        return primaryTemplateResolver;
    }



}
