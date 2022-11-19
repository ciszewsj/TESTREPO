package com.example.testrepo1.get;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class GetController {
	@GetMapping()
	public String get(){
		return "Hello world!";
	}

	@GetMapping("/message")
	public String getsecond(){
		return "Hello Second World!";
	}
	@GetMapping("/test")
	public String test(){
		return "Hello Second Test World!";
	}
}
g