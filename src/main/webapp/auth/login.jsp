<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>

<h2>User Login</h2>
<%
    String msg = (String) request.getAttribute("errMsg");

    if (msg != null) {
        out.print(msg);
    }
%>
<form action="login" method="post">
    <lable>Username</lable>
    <input type="text" name="username" placeholder="Username">
    <br><br>

    <lable>Password</lable>
    <input type="password" name="password" placeholder="Password">
    <br><br>

    <button type="submit">Login</button>
</form>

</body>
</html>
