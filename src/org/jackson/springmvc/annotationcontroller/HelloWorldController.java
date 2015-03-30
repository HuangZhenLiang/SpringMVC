package org.jackson.springmvc.annotationcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@ModelAttribute("message")
	public String getMessage(){
		return "hello";
	}
	
	@ModelAttribute("name")
	public String getName(){
		return "jackson";
	}
	
	@ModelAttribute("user")
	public User getUser()
	{
		User u=new User();
		u.setAge("18");
		return u;
	}
	
	@RequestMapping("/sayHello.do")
	public String sayHello(@ModelAttribute("user") User user){
		user.setUserName("jack");
		user.setAge("20");
		return "hello";
	}
	

	
	@RequestMapping("/sayHi.do")
	public String sayHi(ModelMap mp,Model m){
		mp.addAttribute("book","c++");
		return "hi";
	}
	
	@RequestMapping("/addUser.do")
	public String addUser(ModelMap mp,Model m){
		return "user";
	}
	
	@RequestMapping("/showUser.do")
	public String show(@RequestParam("user")User user){
		System.out.println(user.getUserName()+":"+user.getSalary());
		return "hello";
	}
}
