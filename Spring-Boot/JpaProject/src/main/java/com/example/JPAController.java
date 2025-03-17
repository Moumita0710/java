package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JPAController {
@Autowired
StudInterface SI;
@RequestMapping("/")
public String index() {
	return "index.jsp";
}
@RequestMapping("/addstud")
public String add(Student s) {
	SI.save(s);
	System.out.println("working");
	return "index.jsp";
}
@RequestMapping("/all")
@ResponseBody
public String getStuds() {
	return SI.findAll().toString();
}

}
