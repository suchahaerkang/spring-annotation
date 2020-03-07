package com.wolfx.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 12:06
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //姓名
    @Value("张三")
    private String name;

    //年龄
    @Value("#{20-2}")
    private int age;

    //昵称
    @Value("${person.nickName}")
    private String nickName;
}
