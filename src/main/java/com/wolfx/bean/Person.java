package com.wolfx.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 12:06
 */
@Data
@ToString
@AllArgsConstructor
public class Person {

    //姓名
    private String name;

    //年龄
    private int age;
}
