package com.wolfx.dao;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-04 15:09
 */
@Data
@ToString
@Repository
public class BookDao {

    private int lable = 1;
}
