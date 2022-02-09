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
    <h1>Photo Store Administration</h1>
    <h2>Admin Login</h2>

    <form id="formLogin" action="Login" method="post">
        <table>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" size="20"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" size="20"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button type="submit">Login</button>
                </td>
            </tr>
        </table>
    </form>
</div>



<jsp:directive.include file="footer.jsp"/>
</body>

</html>
