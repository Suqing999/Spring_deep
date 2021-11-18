package com.suki.config;

import com.suki.bean.Person;
import com.suki.filter.myFilter;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Configuration  //告诉Spring个是配置类
//@ComponentScan("com.suki")
/*@ComponentScan(value = "com.suki",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
},useDefaultFilters = false)*/


/*@ComponentScans(value = {
        @ComponentScan(value = "com.suki.controller",includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
        },useDefaultFilters = false),
        @ComponentScan(value = "com.suki.service",includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Service.class)
        },useDefaultFilters = false)
})*/

@ComponentScan(value = "com.suki",includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {myFilter.class})
},useDefaultFilters = false)
public class MainConfig {
    @Bean("person_suki") //注册一个bean （类型就是返回值类型   id默认用方法名）
    public Person person(){
        return new Person("李四", 24);
    }
}
