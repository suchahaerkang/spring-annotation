package com.wolfx.service;

import com.wolfx.dao.BookDao;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 15:09
 */
@ToString
@Service
public class BookService {

    //@Qualifier("bookDao2")
    @Autowired
    private BookDao bookDao;
}
