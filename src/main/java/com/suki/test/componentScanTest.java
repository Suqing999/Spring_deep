package com.suki.test;

import com.suki.bean.Person;
import com.suki.config.MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class componentScanTest {
    @Test
    public void testComponentScan(){
        //加载配置类
        AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNames = aac.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
