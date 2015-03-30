package org.jackson.springmvc.annotationcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello2")
public class HelloWorldController2 {
	@RequestMapping("/sayHello.do")
	public String sayHello(@RequestParam("user") User user){
		System.out.println(user.getUserName()+" "+user.getAge());
		return "hello";
	}

}
