package org.jackson.springmvc.annotationcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/excel")
public class MyExcelController {
	@RequestMapping("/showUser.do")
	public String showUser(ModelMap model) throws ParseException{
		User u1=new User();
		u1.setUserName("jackson");
		u1.setAge("18");
		u1.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("2012-01-01"));
		u1.setSalary(45000L);
		List<User> list=new ArrayList<User>();
		list.add(u1);
		model.addAttribute("users", list);
		return "userExcelView";
	}
}
