package com.xavo.echo.v1;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Hello, World";
	}
}