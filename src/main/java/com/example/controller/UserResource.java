package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Controller User", description = "APIs Rest detalle de un usuario")
@RequestMapping("rest/user")
public class UserResource {
	
	
	@ApiResponses(value = { @ApiResponse(code = 100, message = "100 is the message"),
	@ApiResponse(code = 200, message = "Successful"), @ApiResponse(code = 401, message = "Unauthorized"),
	@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found") })
	@GetMapping
	public List<User> gerUsers(){			
		return Arrays.asList( new User("Sam", 2000L), new User("Peter", 1000L) );
	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String UserName) {
	
		return new User(UserName, 2000L);
	}
	

}





 class User{
	
	private String userName;
    private Long salary;
	
	public User(String userName, Long salary) {
		this.userName = userName;
		this.salary = salary;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	
	
}
