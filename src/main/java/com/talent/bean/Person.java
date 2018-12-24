package com.talent.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
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
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birthday;

    private Map<String, Object> map;

    private List<Object> list;

    private Dog dog;
}
