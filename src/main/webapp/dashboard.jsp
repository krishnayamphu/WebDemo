<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<%
    HttpSession httpSession = request.getSession(false);
    String user = (String) httpSession.getAttribute("user");
%>
<form action="logout" method="post">
    <button type="submit">Logout</button>
</form>
<hr>
<a href="http://localhost:8080/webdemo/users">Users</a> |
<a href="http://localhost:8080/webdemo/upload">Upload</a>
<hr>

<h1>Welcome to Dashboard !</h1>
<h3><%= user %>
</h3>

</body>
</html>
