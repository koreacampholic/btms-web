package com.emsolteam.btms.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloSpring {
	
	public String sayHello(String name){
		return "Hello " + name;
	}

}
