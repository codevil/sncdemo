package com.codev.demo;

public class Responder {

	public DemoResponse reponde(DemoRequest demoRequest) {
		
		
		return DemoResponse.builder().res("yuo said "+demoRequest.getP1()).build();
	}
}
