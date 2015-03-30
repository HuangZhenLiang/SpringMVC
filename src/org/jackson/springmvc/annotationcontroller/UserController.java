package org.jackson.springmvc.annotationcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/addUser.do")
	public String addUser(ModelMap mp,Model m){
		return "user";
	}
	
	@RequestMapping("/showUser.do")
	public String show(User user){
		System.out.println(user.getUserName()+":"+user.getSalary());
		return "hello";
	}

}
