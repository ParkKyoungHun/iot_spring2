package com.iot.sp2.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iot.sp2.user.service.UserService;
import com.iot.sp2.user.service.UserServiceImpl;

@Controller
@RequestMapping("/test")
public class TestController {
	
	private static UserService us = new UserServiceImpl();
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model map){;
		return "test/list";
	}

	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model map){
		return "test/write";
	}

	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model map){
		return "test/write";
	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model map){
		return "test/delete";
	}
}
