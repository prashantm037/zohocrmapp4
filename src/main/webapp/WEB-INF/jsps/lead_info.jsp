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
<h2>Lead Information</h2>

Lead Id:${lead.id}<br/>
FirstName:${lead.firstName}<br/>
LastName:${lead.lastName}<br/>
Email:${lead.email}<br/>
Mobile:${lead.mobile}<br/>
Source:${lead.source}<br/>

<form action=ComposeEmail  method="post">
<input type="hidden" name="email" value="${lead.email}"/>
<input type="submit" value="Send Email"/>
</form>

<form  action="ConvertLead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit"  value="Convert"/>
</form>

</body>
</html>