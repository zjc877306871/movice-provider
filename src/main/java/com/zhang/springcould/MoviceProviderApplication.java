package com.zhang.springcould;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = "com.zhang.springcould.mapper")
//@ComponentScan(basePackages = "com.zhang.springcould")
public class MoviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviceProviderApplication.class, args);
	}
}
