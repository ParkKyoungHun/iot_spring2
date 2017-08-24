package com.iot.sp2.test;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/1")
	public String test(HttpServletRequest request, Model map){
		String test = request.getParameter("test");
		map.addAttribute("test",test);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("test", "이렇게");
		map.addAttribute("hm",hm);
		return "test";
	}

	@RequestMapping("/2")
	public String test2(HttpServletRequest request, @RequestParam(value="ttt",required=false) String ttt){
		System.out.println(ttt);
		String test = request.getParameter("test");
		System.out.println(test);
		return "test";
	}
}
