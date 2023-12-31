package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class jdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://Localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("admin");
		
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbc=new JdbcTemplate();
		jdbc.setDataSource(getDataSource());
		return jdbc;
	}
	@Bean("studentdao")
	public StudentDao getStudentDao()
	{
		StudentDaoImpl stu=new StudentDaoImpl();
		stu.setJdbcTemplate(getTemplate());
		return stu;
	}
}
