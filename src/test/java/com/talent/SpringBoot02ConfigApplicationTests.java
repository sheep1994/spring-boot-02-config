package com.talent;

import com.talent.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext act;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testHelloService() {
        boolean bean = act.containsBean("helloService");
        System.out.println(bean);
    }

}

