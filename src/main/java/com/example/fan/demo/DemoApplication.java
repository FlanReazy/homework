package com.example.fan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fan.demo.design_patterns.creational.abstract_factory.AbstractFactoryPatternDemo;
import com.example.fan.demo.design_patterns.mvc.MVCDemo;
import com.example.fan.demo.design_patterns.structural.adapter.AdapterPatternDemo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// new MVCDemo().main(new String[] { "fanyuji" });

		// new AbstractFactoryPatternDemo().main(new String[] { "fanyuji" });
		new AdapterPatternDemo().main(new String[] { "fanyuji" });
	}

}
