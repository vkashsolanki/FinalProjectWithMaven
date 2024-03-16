<%@page import="dao.RegisterDao"%>
<%@page import="dto.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

String name=request.getParameter("name");
	String email=request.getParameter("email");
	String mobile=request.getParameter("mobile");
	String pass=request.getParameter("password");
	 
	Register bean=new Register();
	bean.setName(name);
	bean.setEmail(email);
	bean.setMobile(mobile);
	bean.setPassword(pass);
	
	
	RegisterDao dao=new RegisterDao();
	String msg=dao.userRegister(bean);
	
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