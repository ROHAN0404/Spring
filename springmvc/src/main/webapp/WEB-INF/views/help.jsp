<%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false"%>

 <%-- <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"  %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is help page</title>
</head>
<body>
 <%--     <%
     String name=(String)request.getAttribute("name");
     Integer i=(Integer)request.getAttribute("id");
     LocalDateTime now1=(LocalDateTime)request.getAttribute("now1");
     %> --%>
     <h1>My name is ${name} </h1>
     <h1> My Roll no is  ${id}</h1>
      <h1>Time is= ${now1} </h1> 
     <hr>
 <%--     <c:forEach var="item" items=${m }>
     
     <c:out value="${item }"></c:out>
     </c:forEach> --%>
    
  
</body>
</html>