package com.huadou.cn.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
/**
 * Created by jinliang on 16-10-14.
 */

/**
 * Druid的 DataSource 配置类
 */
@Configuration
@EnableTransactionManagement
public class DruidDataSourceConfig implements EnvironmentAware {

    private RelaxedPropertyResolver propertyResolver;

    public void setEnvironment(Environment env) {
        this.propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
    }

    @Bean
    public DataSource dataSource() {
        System.out.println("=================   注入druid！！！======================= ");
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        datasource.setUsername(propertyResolver.getProperty("username"));
        datasource.setPassword(propertyResolver.getProperty("password"));

        System.out.println("initial-size:" + propertyResolver.getProperty("initial-size"));
        datasource.setInitialSize(Integer.valueOf(propertyResolver.getProperty("initial-size")));

        System.out.println("min-idle:" + propertyResolver.getProperty("min-idle"));
        datasource.setMinIdle(Integer.valueOf(propertyResolver.getProperty("min-idle")));

        System.out.println("max-wait:" + propertyResolver.getProperty("max-wait"));
        datasource.setMaxWait(Long.valueOf(propertyResolver.getProperty("max-wait")));

        System.out.println("max-active:" + propertyResolver.getProperty("max-active"));
        datasource.setMaxActive(Integer.valueOf(propertyResolver.getProperty("max-active")));

        System.out.println("min-evictable-idle-time-millis:" + propertyResolver.getProperty("min-evictable-idle-time-millis"));
        datasource.setMinEvictableIdleTimeMillis(Long.valueOf(propertyResolver.getProperty("min-evictable-idle-time-millis")));
        try {
            datasource.setFilters("stat,wall");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datasource;
    }
}
