package com.example.testrepo1.get;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping
public class GetController {
	@Value("${git.commit.message.short}")
	private String commitMessage;

	@Value("${git.branch}")
	private String branch;

	@Value("${git.commit.id}")
	private String commitId;

	@GetMapping()
	public String get() {
		return "Hello world!";
	}

	@GetMapping("/info")
	public String info() {
		return "commitMessage: " + commitMessage + "\nbranch: " + branch + "\ncommitId: " + commitId;
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
