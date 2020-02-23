<%@ page import="com.aptech.Account" %>
<%@ page import="com.aptech.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User(20, "Ram");
%>

<p>User Name:<%= user.getName() %>
</p>
<p>User Age: <%= user.getAge() %>
</p>

<h2>My total balance= <%= Account.balance() %>
</h2>
</body>
</html>
