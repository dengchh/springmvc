package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Test")
public class TestController {
	
	@RequestMapping("/mvc")
	public String helloMvc(){
		return "test";
	}
}
