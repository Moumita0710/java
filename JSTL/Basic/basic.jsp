<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="testing java tag library"></c:out>
<br>
<h3>testing set</h3>
<c:set var="course" value="java"/>
course=<c:out value="${course}"></c:out>
<h3>testing remove</h3>
<c:remove var="course"/>
course=<c:out value="${course}"></c:out><br><br>
<c:out value="${5/4}"></c:out>
<h1>Display Blog</h1>
<c:import url="https://www.blogger.com/about/?bpli=1"/>
<c:catch var="exp">
<c:import url="https://www.god.com/book.html"/>
</c:catch>
<b>exp</b>
<c:out value="${exp}"></c:out>
<br><br>
<c:if test="${not empty exp}">
Sorry, unable to import the book from url, got exception
<c:out value="${exp}"></c:out>
</c:if>
</body>
</html>