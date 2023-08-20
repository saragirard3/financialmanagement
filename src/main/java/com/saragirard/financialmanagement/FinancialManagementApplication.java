package com.saragirard.financialmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.saragirard.financialmanagement.*")
@ComponentScan(basePackages = { "com.saragirard.financialmanagement.*" })
@EntityScan("my.package.base.*")
@SpringBootApplication
public class FinancialManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialManagementApplication.class, args);
	}

}
