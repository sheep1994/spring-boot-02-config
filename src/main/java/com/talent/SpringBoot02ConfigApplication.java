package com.talent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author guobing
 * @Title: SpringBoot02ConfigApplication
 * @ProjectName spring-boot-02-config
 * @Description: TODO
 * @date 2018/12/24下午4:51
 */

/**
 * @ImportResource(locations = {"classpath:applicationContext.xml"})导入Spring资源文件
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:applicationContext.xml"})
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }

}

