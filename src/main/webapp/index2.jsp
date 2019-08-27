<%@page import="java.util.List" %>
<%@page import="model.*" %>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="index2.action">Type表</a>
<script type="text/javascript">
function del(id) {
	if(confirm("是否删除？")){
		send(id);
	}
}
function send(id) {
	var hr=new XMLHttpRequest();
	hr.open("POST","delete2.action",true);
	hr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	hr.send("id="+id);

}
</script>
<form action="index2.action">
<input name="txt2"><input type="submit" value="查询">
</form>
<a href="add2.action?">新增</a>

<table>
<tr><td>id</td><td>姓名</td><td>性别</td><td>类别</td><td>操作</td>
<c:forEach items="${list}" var="row">
<tr><td>${row.id}</td><td>${row.name }</td>
<td>${row.sexname}</td><td>${row.typename}</td>
<td><a href="javascript:del(${row.id }) " name="cmd" >
    	删除</a>
    	<a href="edit2.action?id=${row.id }" >修改</a>
    	</td>
</tr>
 
</c:forEach>

</table>
</body>
</html>