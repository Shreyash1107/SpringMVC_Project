package org.alumni.config;

import org.alumni.model.LoginModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig 
{
	@Bean(value = "datasource")
	public DriverManagerDataSource getdatasource()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUsername("root");
		datasource.setUrl("jdbc:mysql://localhost:3306/alumnimanagement");
		datasource.setPassword("Shreyash@123");
		return datasource;
	}
	@Bean(value="template")
	public JdbcTemplate template()
	{
		return new JdbcTemplate(getdatasource());
	}
}