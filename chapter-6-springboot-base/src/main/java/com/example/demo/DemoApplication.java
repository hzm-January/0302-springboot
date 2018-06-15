package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@Value("${book.name}")
	private String myusername;

	@Autowired
	private PropertyBeanTest propertyBeanTest;

	@Autowired
	private PropertyBeanOtherTest propertyBeanOtherTest;

	@GetMapping("test/properties/value")
	@ResponseBody
	public String getString(){
		return myusername;
	}

	@GetMapping("test/properties/bean/in-default-application")
	@ResponseBody
	public String getString2(){
		System.out.println(propertyBeanTest.getName());
		return propertyBeanTest.getName();
	}

	@GetMapping("test/properties/bean/in-other-property")
	@ResponseBody
	public String getString3(){
		System.out.println(propertyBeanOtherTest.getName());
		return propertyBeanOtherTest.getName();
	}

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		springApplication.run(args);
//		SpringApplication.run(DemoApplication.class, args);
	}


}
