package org.jackson.springmvc.annotationcontroller;

import org.springframework.core.convert.converter.Converter;

public class StringToUserConvert implements Converter<String,User> {

	@Override
	public User convert(String arg0) {
		// TODO Auto-generated method stub
		
		if(arg0!=null){
			User u=new User();
			u.setUserName(arg0.split(",")[0]);
			u.setAge(arg0.split(",")[1]);
			return u;
		}
		return null;
	}

}
