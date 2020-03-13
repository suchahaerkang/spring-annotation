package com.wolfx.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-13 8:58
 */
@EnableTransactionManagement
@ComponentScan("com.wolfx.tx")
@Configuration
public class MainConfigOfTx {

    /**
     * @description: 配置数据源
     * @param
     * @return: javax.sql.DataSource
     * @author: sukang
     * @date: 2020/3/13 9:06
     */
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/dev");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        return dataSource;
    }

    /**
     * @description: 将JdbcTemplate组件注册到容器中去
     * @param
     * @return: org.springframework.jdbc.core.JdbcTemplate
     * @author: sukang
     * @date: 2020/3/13 10:06
     */
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());

        return jdbcTemplate;
    }

    /**
     * @description: 将DataSourceTransactionManager的事务管理器注册到容器中去
     * @param
     * @return: org.springframework.transaction.PlatformTransactionManager
     * @author: sukang
     * @date: 2020/3/13 10:06
     */
    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException {
        return new DataSourceTransactionManager(dataSource());
    }
}
