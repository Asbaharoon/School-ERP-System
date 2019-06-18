<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%@page import="jsp7.UserDao"%>  
<jsp:useBean id="u" class="jsp7.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
int i=UserDao.update(u);  
response.sendRedirect("viewuser.jsp");  
%>  


</body>
</html>