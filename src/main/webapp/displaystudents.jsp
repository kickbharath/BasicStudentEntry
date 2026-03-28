<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

       <c:forEach items="${ students}" var="s">
       <br>
       		<c:out value="${s.id }"></c:out> : <c:out value="${s.name }"></c:out> : <c:out value="${s.marks }"></c:out>
       </c:forEach>

</body>
</html>