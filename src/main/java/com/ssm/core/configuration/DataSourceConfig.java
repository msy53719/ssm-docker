//package com.ssm.core.configuration;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import com.alibaba.druid.pool.DruidDataSource;
//@Configuration
//public class DataSourceConfig {
//	@Autowired
//	Environment env;
//
//	@Bean
//	public DataSource getDataSource() {
//		DruidDataSource datasource = new DruidDataSource();
//		datasource.setUrl(env.getProperty("spring.datasource.url"));
//		datasource.setUsername(env.getProperty("spring.datasource.username"));
//		datasource.setPassword(env.getProperty("spring.datasource.password"));
//		datasource.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
//		return datasource;
//	}
//}
