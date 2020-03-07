package com.wolfx.config;

import com.wolfx.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-07 14:05
 */
@ComponentScan({"com.wolfx.controller","com.wolfx.service", "com.wolfx.dao"})
@Configuration
public class MainConfigOfAutowired {

    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLable(2);
        return bookDao;
    }
}
