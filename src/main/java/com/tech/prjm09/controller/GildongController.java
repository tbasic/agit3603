package com.tech.prjm09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GildongController {
	
	@RequestMapping("/gildongview")
	public String gildongview() {
		return "gildongview";
	}
	
	public void aaa() {
		System.out.println("hi");
	}
	public void bbb() {
		System.out.println("bb");
	}

}
