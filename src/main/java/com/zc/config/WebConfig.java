/*
package com.zc.config;

import com.zc.interceptor.ActionInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

*/
/**
 * @author wangjiangtao
 *//*

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Bean
    public ActionInterceptor actionInterceptor() {
        return new ActionInterceptor();
    }

    */
/**
     * 添加登录拦截
     *//*

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(actionInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login/**")
                .excludePathPatterns("/index");
    }
}
*/
