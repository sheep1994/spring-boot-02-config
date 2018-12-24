package com.talent.config;

import com.talent.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guobing
 * @Title: ImportResourceConfig
 * @ProjectName spring-boot-02-config
 * @Description: TODO
 * @date 2018/12/24下午5:10
 */

/**
 * @Configuration: 指明当前类是一个配置类，替代之前的Spring配置文件
 */
@Configuration
public class ImportResourceConfig {

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
