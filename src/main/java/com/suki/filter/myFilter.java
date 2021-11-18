package com.suki.filter;


import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class myFilter implements TypeFilter {

    //match 返回true 则匹配成功
    //      返回false 匹配失败

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源信息
        Resource resource = metadataReader.getResource();
        /*
        * classMetadata 还可以获取接口，父类，子类 以及 getEnclosingClass能够获取匿名内部类对应的外部类Class对象
        * */
        String className = classMetadata.getClassName();//获得当前类的类名
        System.out.println("class_name---->"+className);
        //指定一个规则
        if(className.contains("er")){//eg： Service 中含有er
            //System.out.println("包含进入到ioc"+className);
            return true;
        }
        return false;
    }
}
