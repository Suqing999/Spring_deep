package com.suki.test;

import com.suki.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void testBean(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);
    }
}
