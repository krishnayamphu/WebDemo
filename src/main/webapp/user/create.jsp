<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new User</title>
</head>
<body>

<h2>Create New User</h2>

<form action="create" method="post">
    <input type="text" placeholder="Enter Username" name="username" required>
    <br><br>

    <input type="password" placeholder="Enter Password" name="password" required>
    <br><br>

    <button type="submit">Create</button>
</form>

</body>
</html>
