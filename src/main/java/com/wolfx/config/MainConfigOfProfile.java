package com.wolfx.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @description:
 * @author: sukang
 * @date: 2020-03-08 12:40
 */
@PropertySource(value = {"classpath:/db.properties"})
@Configuration
public class MainConfigOfProfile {

    @Value("${database.username}")
    private String userName;

    @Value("${database.password}")
    private String password;

    @Value("${database.driver}")
    private String driver;

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSourceOfDev() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/dev");
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceOfTest() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driver);
        return dataSource;
    }

    @Profile("prod")
    @Bean("prodDataSource")
    public DataSource dataSourceOfProd() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/prod");
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driver);
        return dataSource;
    }
}
