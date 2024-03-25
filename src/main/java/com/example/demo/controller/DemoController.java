package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiry.Test;

@RestController
public class DemoController {
	
	@GetMapping("/test2")
	public Test check() {
		Test test = new Test();
		test.setName("山田");
		test.setScore(100);
		return test;
	}

}
