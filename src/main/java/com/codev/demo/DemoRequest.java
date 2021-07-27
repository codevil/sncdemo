package com.codev.demo;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class DemoRequest  {

	
	@JsonProperty("parameter1")
	@Valid
	String p1;

}
