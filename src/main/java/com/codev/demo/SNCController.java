package com.codev.demo;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/base_url")
@Component
@Slf4j
public class SNCController {

	@Autowired
	ProducerTemplate prodTemple;

	@PostMapping("/example")
	public DemoResponse invokeBpmExample(@RequestBody DemoRequest demoRequest) {

		Object r = prodTemple.requestBody("direct:sncdemo", demoRequest);
		log.info("r is " + r);
		return (DemoResponse) r;

	}

	
	
}

