<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

<h2>Manage Users</h2>
<a href="user/create">Create User</a>
<table border="1px">
    <tr>
        <th>#ID</th>
        <th>Username</th>
        <th>Crated Date</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${allUsers}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.createdAt}</td>
            <td><a href="#">Edit</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
