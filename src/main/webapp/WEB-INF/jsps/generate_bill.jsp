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
<form action="SaveBill" method="post">
<table>
 <tr>
 <th>FirstName</th>
 <td><input type="text" name="firstName"  value="${contact.firstName}"/></td>
 </tr>
 
 <tr>
 <th>LastName</th>
 <td><input type="text" name="lastName" value="${contact.lastName}"/></td>
 </tr>
 
 <tr>
 <th>Email</th>
 <td><input type="text" name="email"  value="${contact.email}"/></td>
 </tr>
 
 <tr>
 <th>Mobile</th>
 <td><input type="text" name="mobile" value="${contact.mobile}"/></td>
 </tr>
 
 <tr>
 <th>Product</th>
 <td><input type="text" name="product" /></td>
 </tr>
 
 <tr>
 <th>Amount</th>
 <td><input type="text" name="amount" /></td>
 </tr>
 
 <tr>
 <td><input type="submit" name="Generate"/></td>
 </tr>
</table>

</form>
</body>
</html>