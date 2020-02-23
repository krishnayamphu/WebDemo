<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>

<h2>User Login</h2>
<form action="auth.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username">
    <br><br>

    <label for="password">Password:</label>
    <input type="password" name="password" id="password">
    <br><br>

    <button type="submit">Login</button>
</form>

</body>
</html>
