<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		
		<form action="${pageContext.request.contextPath}/StudentServlet" method="post">
       		Enter a Name : <input type="text" name="studentName">
       		Enter your Id 	:<input type="text" name="studentId">
       		Enter your marks : <input type="text" name="marks">
       		<input type="submit">
       		
       </form>
       
       
		<c:if test="${isAdded}">
			Student added successfully
		</c:if>
		
		
</body>
</html>