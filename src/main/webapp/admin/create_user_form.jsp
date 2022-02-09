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
    <h2>Create New User</h2>
</div>
<div>
    <form action="create_user_form" method="post" onsubmit="return validateFormInput()">
        <table align="center">
            <tr>
                <td align="right">User Name</td>
                <td><input type="text" id = "userName" name="userName" size="20"/></td>
            </tr>
            <tr>
                <td align="right">Email</td>
                <td><input type="text" name="email" id="email" size="20"/></td>
            </tr>
            <tr>
                <td align="right">Full Name</td>
                <td><input type="text" name="fullName" id="fullName" size="20"/></td>
            </tr>
            <tr>
                <td align="right">Password</td>
                <td><input type="password" name="password" size="20"/></td>
            </tr>
            <tr>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="button" value="Cancel"/>
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>


<jsp:directive.include file="footer.jsp"/>
</body>
<script type="text/javascript">
    function validateFormInput() {
        var fieldEmail = document.getElementById("email");
        var fieldUserName = document.getElementById("userName");
        v

        if (fieldEmail.value.length === 0) {
            alert("Email is required");
            fieldEmail.focus();
            return false;
        }
        if (fieldUserName.value.length === 0) {
            alert("User name is required");
            fieldEmail.focus();
            return false;
        }
    }
</script>
</html>
