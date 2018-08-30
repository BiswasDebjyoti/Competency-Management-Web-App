<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="project.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	HttpSession hs = request.getSession();
	if(hs!=null)
	{
		Employee employee = (Employee)hs.getAttribute("employee");
		String printEmployee = employee.toString();
%>
		<%=printEmployee%>
<%
	}
%>
</body>
</html>