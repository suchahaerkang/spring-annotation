package com.wolfx.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-13 9:09
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(){
        String sql = "INSERT INTO `tb_user`(name,age) VALUES(?, ?)";
        String str = UUID.randomUUID().toString().substring(0,5);
        jdbcTemplate.update(sql, str, 19);
        System.out.println("插入成功");
    }

}
