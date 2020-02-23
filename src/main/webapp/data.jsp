<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data</title>
</head>
<body>
<%
    String name = request.getParameter("studentName");
%>

<p>
    Student's name: <%= name %>
</p>
</body>
</html>
