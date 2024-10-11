package com.tech.prjm09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GildongController {
	
	@RequestMapping("/gildongview")
	public String gildongview() {
		System.out.println("hhhhhh");
		return "gildongview";
	}
	
	public void aaa() {
		System.out.println("hi");
	}
	public void bbb() {
		System.out.println("bb");
	}
	public void ddd() {
		System.out.println("dd:");
		System.out.println("dd:");
		
	}

}
