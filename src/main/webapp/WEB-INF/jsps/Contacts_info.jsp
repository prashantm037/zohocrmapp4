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
<h2>contact Information</h2>

contact Id:${contact.id}<br/>
FirstName:${contact.firstName}<br/>
LastName:${contact.lastName}<br/>
Email:${contact.email}<br/>
Mobile:${contact.mobile}<br/>
Source:${contact.source}<br/>

<form action=ComposeEmail  method="post">
<input type="hidden" name="email" value="${contact.email}"/>
<input type="submit" value="Send Email"/>
</form>



</body>
</html>