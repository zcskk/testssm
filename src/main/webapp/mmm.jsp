


<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" isErrorPage="false"%>
    
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>



<c:if test="${info==null }">
<form action="insert.action" method="post">
<input type="hidden" name="cmd" value="insert">
</c:if>
<c:if test="${info !=null }">
<form action="update.action" method="post">
<input type="hidden" name="cmd" value="update">
<input type="hidden" name="id" value="${info.id }">
</c:if>
<input name="name" value="${info.name }">

<input type="submit">
</form>


</body>
</html>