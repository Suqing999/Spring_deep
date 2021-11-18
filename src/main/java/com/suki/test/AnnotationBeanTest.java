package com.suki.test;

import com.suki.bean.Person;
import com.suki.config.MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanTest {
    @Test
    public void testAnnotationBean(){
        //加载配置类
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = aac.getBean("person_suki", Person.class);
        System.out.println(person);
    }
}
