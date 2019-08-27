


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
<form action="insert2.action" method="post">
<input type="hidden" name="cmd" value="insert2">
</c:if>
<c:if test="${info !=null }">
<form action="update2.action" method="post">
<input type="hidden" name="cmd" value="update2">
<input type="hidden" name="id" value="${info.id}">
</c:if>
<input name="name" value="${info.name }">
<select name="sex"  >
<c:forEach items="${sexs }" var="r" varStatus="v">
<c:if test="${info.sex==v.index }">
<option value="${v.index }" selected="selected">${r}</option>
</c:if>
<c:if test="${info.sex !=v.index }">
<option value="${v.index }">${r}</option>
</c:if>
</c:forEach>
</select>
<select name="typeid">
<c:forEach items="${typelist }" var="cls"  >
<c:if test="${cls.id==info.typeid }">
<option value="${info.typeid }" selected="selected">${cls.name }</option>
</c:if>
<c:if test="${cls.id !=info.typeid }">
<option value="${cls.id }">${cls.name }</option>
</c:if>
</c:forEach>
</select>
<input type="submit">
</form>


</body>
</html>