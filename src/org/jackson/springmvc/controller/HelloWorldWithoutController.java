package org.jackson.springmvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;
import java.io.InputStream;
import java.io.OutputStream;
public class HelloWorldWithoutController extends AbstractController implements LastModified{
	private long lastModifed=0L;
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("/logo.jpg");
		//arg1.getWriter().write("<a href=''>this</a>");
		InputStream in=r.getInputStream();
		OutputStream out=arg1.getOutputStream();
		byte[] buf=new byte[1024];
		int len=0;
		while((len=in.read(buf,0,1024))!=0){
			out.write(buf,0,len);
		}
		in.close();
		out.close();
		return null;
	}

	@Override
	public long getLastModified(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		if(lastModifed==0L){
			lastModifed=System.currentTimeMillis();
		}
		return lastModifed;
	}

}
