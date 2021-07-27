package com.codev.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SNCRouteBuilder extends RouteBuilder {


	@Override

	public void configure() throws Exception {

		from("direct:sncdemo")
		.routeId("sample")
		.bean(Responder.class)
		.end();
	}

}
