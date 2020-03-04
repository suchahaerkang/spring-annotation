package com.wolfx.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @description: 自定义自动扫描规则必须实现TypeFilter类
 * @author: sukang
 * @date: 2020-03-04 17:29
 */
public class MyTypeFilter implements TypeFilter {

    /**
     * @description:
     * @param metadataReader 读取到当前扫描到的类信息
     * @param metadataReaderFactory 可以获取到其它任何类的信息
     * @return: boolean
     * @author: sukang
     * @date: 2020/3/4 17:30
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata(); //获取当前类注解信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata(); //获取当前扫描到的信息
        Resource resource = metadataReader.getResource(); //获取当前类的资源（类路径）
        String className = classMetadata.getClassName();
        System.out.println("当前扫描的类名为：" + className);
        if(className.contains("dao")){
            return true;
        }
        return false;
    }
}
