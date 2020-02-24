<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Edit</title>
</head>
<body>

<h2>User Details</h2>

<form action="edit" method="post">
    <c:forEach items="${singleUser}" var="user">
        <input type="hidden" name="id" value="${user.id}">

        <label>Username:</label>
        <input type="text" value="${user.username}" placeholder="Enter Username" name="username" required>
        <br><br>

        <label>Password:</label>
        <input type="password" value="${user.password}" placeholder="Enter Password" name="password" required>
        <br><br>

        <button type="submit">Update</button>
    </c:forEach>
</form>

</body>
</html>
