package com.talent.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author guobing
 * @Title: Person
 * @ProjectName spring-boot-02-config
 * @Description: TODO
 * @date 2018/12/24下午2:58
 */

/**
 * @ConfigurationProperties: 告诉Spring Boot，将本类中所有属性和配置文件中的相关配置进行绑定
 *      必须和@Component结合使用
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
@PropertySource(value = {"classpath:person.properties"}, encoding = "UTF-8")
public class Person {

    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birthday;

    private Map<String, Object> map;

    private List<Object> list;

    private Dog dog;
}
