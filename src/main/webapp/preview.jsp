<%--
  Created by IntelliJ IDEA.
  User: Krishna
  Date: 2/25/2020
  Time: 9:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Preview Image</title>
</head>
<body>

<form action="preview" method="post">
    <input type="hidden" name="selectedFile" value="${name}">
    <img style="max-width: 700px; max-height: 500px;" src="http://localhost:8080/webdemo/uploads/${name}" alt="">
    <br><br>
    <button>Delete</button>
</form>

</body>
</html>
