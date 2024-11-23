package com.oracle.security;

import org.springframework.stereotype.Component;

@Component
public class AppSecurity {

	public AppSecurity() {
		// TODO Auto-generated constructor stub

		System.out.println("AppSecurity construcotor");
	}

}
//com.oracle.security ..it is not following our project package name,so it will not consider as a bean by IOC