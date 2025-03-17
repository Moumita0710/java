package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
public class MyController {
	@RequestMapping("/home")
	public String home(HttpServletRequest req) {
		HttpSession ses=req.getSession();
		String name=req.getParameter("name");
		System.out.println(name+"its working");
		ses.setAttribute("name", name);
		return "home.jsp";
	//http://localhost:8080/home?name=Moumita	
	}

}
