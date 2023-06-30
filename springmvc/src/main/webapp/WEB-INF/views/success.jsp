<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Registration Form</title>
</head>
<body>
   <div class="container mt-5">
   
   <h1 class="text-center">Learn Coding With Rohan</h1>
   <p class="text-center">${desc}</p>
   <h3 class="text-center">${fill}</h3>
   
   </div>
<h1 style="color: green">${msg }</h1>
 
<hr>
<h1>My email is : ${user.useremail}</h1><hr>
<h1>My name is : ${user.username}</h1>
<hr>
<h1>My password is : ${user.password}</h1>
 <hr>

</body>
</html>