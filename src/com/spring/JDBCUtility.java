package com.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("com.spring")
public class JDBCUtility {

	@Bean
	public DataSource datasouce() {
		BasicDataSource bd = new BasicDataSource();
		bd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bd.setUrl("jdbc:mysql://localhost:3306/spring");
		bd.setUsername("root");
		bd.setPassword("root");
		return bd;
		
	}
	
	@Bean
	public JdbcTemplate jdbctemplate() {
		return new JdbcTemplate(datasouce());
	}
}
