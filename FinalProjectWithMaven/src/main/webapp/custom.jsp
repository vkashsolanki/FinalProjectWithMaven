<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib prefix="surya"  uri="/WEB-INF/maths.tld" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n1=request.getParameter("n1");
String n2=request.getParameter("n2");

%>
 <surya:sum  num1="<%=n1%>" num2="<%=n2%>"><br>
this is body...
</surya:sum><br>
this is rest part of jsp....

</body>
</html>