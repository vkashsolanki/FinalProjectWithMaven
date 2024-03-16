<%@page import="dao.RegisterDao"%>
<%@page import="dto.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rbean" class="dto.Register">
</jsp:useBean>
<jsp:useBean id="dao" class="dao.RegisterDao"></jsp:useBean>

<jsp:setProperty property="*" name="rbean"/>

<% 

	String msg=dao.userRegister(rbean);
	
	switch (msg) 
	{
case "success":
out.println("user register successffllyyy");	
break;

case "exist":
	out.println("user existttt...");	

	break;

	
case "fail":
	out.println("kuch issue hai");	

	break;
	

default:
	break;
}
	
	

%>


</body>
</html>