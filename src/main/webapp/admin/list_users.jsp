<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Manage Users</title>
</head>
<body>
<jsp:directive.include file="header.jsp"/>
<hr width="60%"/>
<h2 align="center">Users Management</h2>
<h3><a href="">Create New User</a></h3>
<div align="center">
    <table border ="1">
        <tr>
            <th>Index</th>
            <th>Id</th>
            <th>User Name</th>
            <th>Email</th>
            <th>Full Name</th>
            <th>Actions</th>
        </tr>
        
        <%--@elvariable id="listUsers" type="com.photostore.service.UsersService"--%>
        <c:forEach var="user" items="${listUsers}" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td></td>
                <td></td>
            </tr>
        </c:forEach>
    </table>
</div>


<jsp:directive.include file="footer.jsp"/>
</body>
</html>
