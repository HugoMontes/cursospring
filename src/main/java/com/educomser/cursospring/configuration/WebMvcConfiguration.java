package com.educomser.cursospring.configuration;

import com.educomser.cursospring.component.RequestTimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    @Qualifier("requestTimeInterceptor")
    private RequestTimeInterceptor requestTimeInterceptor;

    // Implementar el metodo addInterceptor
    // Click derecho > Insert Code... > Implement Method...  
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestTimeInterceptor);
    }
}
