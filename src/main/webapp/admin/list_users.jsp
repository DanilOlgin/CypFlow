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
<h3 align="center"><a href="create_user_form.jsp">Create New User</a></h3>
<div align="center">
    <table border ="1" cellpadding="5">
        <tr>
            <th>Index</th>
            <th>Id</th>
            <th>User Name</th>
            <th>Email</th>
            <th>Full Name</th>
            <th>Actions</th>
        </tr>
        

        <c:forEach var="users" items="${listUsers}" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${users.userId}</td>
                <td>${users.userName}</td>
                <td>${users.email}</td>
                <td>${users.fullName}</td>
                <td>&nbsp;<a href="actions">Edit</a> &nbsp;
                    <a href="actions">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


<jsp:directive.include file="footer.jsp"/>
</body>
</html>
