package com.example.testrepo1.get;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class GetController {
	@Value("${application.name}")
	private String applicationName;

	@Value("${build.version}")
	private String buildVersion;

	@Value("${build.timestamp}")
	private String buildTimestamp;

	@GetMapping()
	public String get() {
		return "Hello world!";
	}

	@GetMapping("/info")
	public String info() {
		return "AppName: " + applicationName + "\nVersion: " + buildVersion + "\nTime: " + buildTimestamp;
	}


	@GetMapping("/message")
	public String getsecond() {
		return "Hello Second World!";
	}

	@GetMapping("/test")
	public String test() {
		return "Hello Second Test World!";
	}

	@GetMapping("/test2")
	public String test2() {
		return "Hello Second Test World!";
	}
}
