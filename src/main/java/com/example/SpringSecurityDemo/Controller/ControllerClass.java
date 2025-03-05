package com.example.SpringSecurityDemo.Controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurityDemo.Entity.Employee;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class ControllerClass {
	
	@GetMapping("/")
	public String welcomeMethod(HttpServletRequest request) {
		return "Hello Guys, Welcome to Infy" + request.getSession().getId();
	}
	
	@GetMapping("/csrf")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

	@PostMapping("/")
	public String add() {
		return "Hello Guys, Welcome to Infy" ;
	}
	
//	@GetMapping("/employee/{name}")
//	public Employee getEmployee(@PathVariable String name) {
//		Employee emp = new Employee(1, "Sravani", "Computers");
//		return emp;
//	}
}
