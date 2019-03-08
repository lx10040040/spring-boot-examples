package com.neo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neo.mapper")
public class Application {

	public static void main(String[] args) {
		System.out.println("start .......");
		SpringApplication.run(Application.class, args);
	}
}
