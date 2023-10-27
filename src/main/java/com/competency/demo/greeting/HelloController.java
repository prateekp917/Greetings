package com.competency.demo.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {
	
	@GetMapping("/hello")
	public String getMessage() {
		
		return "Hello there!!";
	}

	@GetMapping("/helloName")
	@ResponseBody
	public String getMessageWithInputName(@RequestParam(name ="name") String name) {
		
		return "Hello, "+name;
	}
	
	@GetMapping("/hello/{name}")
	public String getMessageWithName(@PathVariable String name) {
		
		return "Hello, "+name;
	}
	
	
}
