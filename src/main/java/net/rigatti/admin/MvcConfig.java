package net.rigatti.admin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"net.rigatti.admin"})
@EnableJpaRepositories(basePackages = {"net.rigatti.admin.repository"})
@EnableTransactionManagement
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/admin/users/list").setViewName("admin/users/list");
    }

	@Bean(name = "dataSource")
	@Profile("local")
	public DriverManagerDataSource dataSourceLocal() {
	    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	    driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/access");
	    driverManagerDataSource.setUsername("root");
	    driverManagerDataSource.setPassword("motdepasse");
	    return driverManagerDataSource;
	}

	@Bean(name = "dataSource")
	@Profile("default")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://us-cdbr-iron-east-04.cleardb.net:3306/access");
		driverManagerDataSource.setUsername("b26ccce8bc2574");
		driverManagerDataSource.setPassword("5658739a");
		return driverManagerDataSource;
	}
}