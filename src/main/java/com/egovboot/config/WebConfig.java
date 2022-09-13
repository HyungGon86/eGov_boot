package com.egovboot.config;

import com.egovboot.interseptor.LoggerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) { // 제외 url이 많을경우 List로 담아서 넣어줍니다.
        registry.addInterceptor(new LoggerInterceptor())
                .addPathPatterns("/*") /* 인터셉터 패턴 등록 */
                .excludePathPatterns("/test"); // 해당 경로는 인터셉터가 가로채지 않는다.
    }
}
