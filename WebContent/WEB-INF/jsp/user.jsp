<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Hello World</title>  
</head>  
<body>
<form action="showUser.do" method="post">
<table align="center">
	<tr>
		<td>Name:<input type="text" name="userName"/></td>
	</tr>
	<tr>
		<td>age:<input type="text" name="age"/></td>
	</tr>
	<tr>
		<td>birthday:<input type="text" name="birthday"/></td>
	</tr>
	<tr>
		<td>salary:<input type="text" name="salary"/></td>
	</tr>
	<tr align="center">
		<td><input type="submit" value="submit"/><input type="reset" value="reset" /></td>
	</tr>
</table>
</form>
</body>  
</html> 