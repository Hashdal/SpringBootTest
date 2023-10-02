package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/test1")
	public String index() {
		return "this is test1 endpoint from port 8080";
	}
    @GetMapping("/test2")
    public String test() {
        return "this is test2 endpoint friom port 8080";
    }
}
