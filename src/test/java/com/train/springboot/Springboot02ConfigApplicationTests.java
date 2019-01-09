package com.train.springboot;

import com.train.springboot.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ac;

    @Test
    public void testBean(){
        boolean helloService = ac.containsBean("helloService");
        System.out.println(helloService);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}

