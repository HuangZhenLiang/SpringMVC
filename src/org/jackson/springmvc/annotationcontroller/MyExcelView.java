package org.jackson.springmvc.annotationcontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import java.util.List;
import java.util.ArrayList;

public class MyExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> arg0,
			HSSFWorkbook arg1, HttpServletRequest arg2, HttpServletResponse arg3)
			throws Exception {
		// TODO Auto-generated method stub
		List<User> users=(List<User>)arg0.get("users");
		arg3.setHeader("Content-Disposition", "inline:filename=user list");
		HSSFSheet sheet=arg1.createSheet("user");
		HSSFRow header=sheet.createRow(0);
		header.createCell(0).setCellValue("username");
		header.createCell(1).setCellValue("age");
		header.createCell(2).setCellValue("birthday");
		header.createCell(3).setCellValue("salary");
		int rowNum=1;
		for(User user:users){
			HSSFRow row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(user.getUserName());
			row.createCell(1).setCellValue(user.getAge());
			row.createCell(2).setCellValue(user.getBirthday());
			row.createCell(3).setCellValue(user.getSalary());
		}
	}

}
