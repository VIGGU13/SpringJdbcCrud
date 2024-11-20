package com.Config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class SpringConfig {
	@Bean
	public DriverManagerDataSource mydatsource()
	{
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/springJDBC");
		dm.setUsername("root");
		dm.setPassword("admin");
		return dm;
	}
	@Bean
	public JdbcTemplate myjdbcTemp() {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(mydatsource());
		return jd;
}
}
