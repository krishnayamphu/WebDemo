<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Authentication</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username.equals("admin") && password.equals("a123")) {
        out.print("Weleocme " + username);
    } else {
        String error = "Invalid username or password";
        response.sendRedirect("http://localhost:8080/webapp/login.jsp");
    }
%>

</body>
</html>
