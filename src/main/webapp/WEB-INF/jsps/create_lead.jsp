<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>
<form action="Savelead" method="post">
<table>
 <tr>
 <th>FirstName</th>
 <td><input type="text" name="firstName"/></td>
 </tr>
 
 <tr>
 <th>LastName</th>
 <td><input type="text" name="lastName"/></td>
 </tr>
 
 <tr>
 <th>Email</th>
 <td><input type="text" name="email"/></td>
 </tr>
 
 <tr>
 <th>Mobile</th>
 <td><input type="text" name="mobile"/></td>
 </tr>
 
 Source:
     <select name="source" >
  <option value="news paper">NewsPaper</option>
  <option value="tv commercial">TV Commercial</option>
  <option value="online">Online</option>
  <option value="seminar">Seminar</option>
   </select>
 
 <tr>
 <td><input type="submit" name="save"/></td>
 </tr>
</table>
</form>
</body>
</html>