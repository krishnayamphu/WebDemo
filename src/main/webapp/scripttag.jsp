<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>
<h2>Scriptlet Tag</h2>
<p><% out.println("Hello World !"); %></p>
<p><% out.println(5 + 6); %></p>

<%
    int age = 16;
%>

<h2>Expression Tag</h2>
<p>Age: <%= age %>
</p>
<p>Current Date: <%= new Date() %>
</p>

<h2>Declaration Tag</h2>
<%!
    int getAge(int age) {
        return age;
    }
%>

<p>Your age is <%= getAge(16) %>
</p>
<p>Your age is <%= getAge(40) %>
</p>

</body>
</html>
