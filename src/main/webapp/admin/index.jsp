
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Admin panel</title>
</head>
<body>
<jsp:directive.include file="header.jsp"/>
<hr width="60%"/>
<h2 align="center">Admin Dashboard</h2>
<div align="center">
  <a href="users">USERS</a> |
  <a href="categories">CATEGORIES</a> |
  <a href="photos">PHOTOS</a> |
  <a href="customers">CUSTOMERS</a> |
  <a href="comments">COMMENTS</a> |
  <a href="orders">ORDERS</a>
</div>
<hr width="60%"/>
<div align="center">
  <h2>RECENT SALES:</h2>
</div>

<hr width="60%"/>
<div align="center">
  <h2>STATISTICS:</h2>
</div>

<jsp:directive.include file="footer.jsp"/>
</body>
</html>
