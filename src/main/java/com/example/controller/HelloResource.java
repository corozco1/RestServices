package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Controller Hello", description = "APIs Rest Hello")
@RequestMapping("/rest/hello")
public class HelloResource {
	
	@ApiResponses(value = { @ApiResponse(code = 100, message = "100 is the message"),
	@ApiResponse(code = 200, message = "Successful"), @ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found") })
	@GetMapping
	public String hello() {
	   return "Hellow World";		
	}
	
	@PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
		return hello;
	}
	
	@PutMapping("/put")
	public String helloPut(@RequestBody final String hello) {
		return hello;
	}
}
