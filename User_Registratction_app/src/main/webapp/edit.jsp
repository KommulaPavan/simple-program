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
String fName=(String)request.getAttribute("fName");
UserBean ub=(UserBean)application.getAttribute("ubean");
out.println("Page belong to"+fName+"<br>");
%>
<form action="update" method="post">
Address:<input type="text" name="addr"
value=<%=ub.getAddr() %>><br>
Mailid:<input type="text" name="mid" value=<%=ub.getmId()
%>><br>
PhoneNo:<input type="text" name="phno"
value=<%=ub.getPhno() %>><br>
<input type="submit" value="UpdateProfile">
</form>
</body>
</html>