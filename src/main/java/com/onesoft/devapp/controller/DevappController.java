package com.onesoft.devapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevappController {
	
	@GetMapping(value = "/msg")
	public String getMsg() {
		return "Hello Friends";
	}

}
