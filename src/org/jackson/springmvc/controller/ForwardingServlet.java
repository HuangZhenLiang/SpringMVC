package org.jackson.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ForwardingServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest arg0,HttpServletResponse arg1) throws IOException{
		arg1.getWriter().write("This is a forward servlet");
	}
}
