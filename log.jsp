<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="main" method="post">
		UserName : <input type="text" name="username">
		Password : <input type="password" name="password">
		<input type="submit" value="submit">
	</form>
	<div>
	<% 
	if(request.getAttribute("flag")!=null)
		if( (Integer)request.getAttribute("flag")==0){
	%>
		<h5>Invalid Username and Password </h5>
	<% 
	}
	%>
	</div>
</body>
</html>