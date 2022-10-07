<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SendEmail" method="post">
<table>
<tr>
<th>To</th>
<td><input type="text" name="To" value="${email}"/></td>
</tr>
<tr>
<th>Subject</th>
<td><input type="text" name="sub"/></td>
</tr>

Compose:
    <textarea  name="emailBody" rows="40" cols="50">
    </textarea>
    
    <tr>
    <td><input type="submit" value="Send"/>
    </tr>
</table>
</form>
</body>
</html>