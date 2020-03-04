package com.wolfx.config;

import com.wolfx.bean.Person;
import com.wolfx.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 12:42
 */
@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.wolfx",includeFilters = {
             //@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
             //@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
public class MainConfig {

    //@Bean 注册组件，类型为方法返回值，id默认为方法名，如果@Bean组件添加value值，那么id就以value值为主
    @Bean
    public Person person(){
        return new Person("张三", 18);
    }
}
