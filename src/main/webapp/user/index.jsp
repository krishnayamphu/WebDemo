<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>

<h2>Manage Users</h2>
<hr>
<a href="http://localhost:8080/webdemo/dashboard">Dashboard</a> |
<a href="http://localhost:8080/webdemo/upload">Upload</a> |
<a href="user/create">Create User</a>
<hr>
<table border="1px">
    <tr>
        <th>#ID</th>
        <th style="width: 300px">Username</th>
        <th>Crated Date</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${allUsers}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.createdAt}</td>
            <td>
                <div style="display: flex;
            padding: 5px;
            width: 115px;
            ">
                    <a style="margin-right: 10px" href="http://localhost:8080/webdemo/user/edit?id=${user.id}">
                        <button>Edit</button>
                    </a>
                    <form action="user/delete" method="post">
                        <input type="hidden" name="id" value="${user.id}">
                        <button type="submit">Delete</button>
                    </form>
                </div>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
