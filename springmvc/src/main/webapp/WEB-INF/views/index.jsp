<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	
	
	<%
		String name=(String)request.getAttribute("name");
		Integer i=(Integer)request.getAttribute("id");
	/* 	ArrayList<String> fri=(ArrayList<String>)request.getAttribute("f");  */
	%>
	<h1>This is home page</h1>
	
	<h1>My name is <%=name %>.And my id is <%=i %> 
		<%=	name %> has many friends
        some of them are</h1>
        
      <%--   <%
        for (String s  :fri){
               out.println(s);        
        	
      		  }
        %> --%>
        
       
        
	
</body>
</html>