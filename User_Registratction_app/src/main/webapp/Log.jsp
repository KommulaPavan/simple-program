<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("Welcome user:"+ub.getfName()+"<br>");
%>
<a href="view">ViewProfile</a>
<a href="edit">EditProfile</a>
<a href="logout">LogOut</a>
</body>
</html>