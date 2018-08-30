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
		HttpSession ht = request.getSession();
		if(ht!=null)
		{
	%>
			<a href="newEmployee.jsp">Create new Employee</a><br>
			<a href="showAllEmployee.jsp">Show all Employee</a><br>
	<%
		}
	%>
</body>
</html>