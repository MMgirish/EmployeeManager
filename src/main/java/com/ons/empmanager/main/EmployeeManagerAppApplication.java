package com.ons.empmanager.main;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.ons.empmanager")
@EntityScan ("com.ons.empmanager.model")
@EnableJpaRepositories ("com.ons.empmanager.repository")
public class EmployeeManagerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerAppApplication.class, args);
	}
	
	@Bean
    public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        return new ServletRegistrationBean<FacesServlet>(servlet, "*.jsf");
    }
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
