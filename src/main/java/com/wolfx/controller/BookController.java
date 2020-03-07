package com.wolfx.controller;

import com.wolfx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 15:09
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
