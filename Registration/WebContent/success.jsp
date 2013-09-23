
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="reg.pkg.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success.jsp</title>
</head>
<body bgcolor="yellow">
<h3>USER Succcesfully registered!!</h3>
<%User user=(User)request.getAttribute("ser");%>
<h3>hello</h3> <%=user.getUsername()%>!!
</html>