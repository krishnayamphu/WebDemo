<%@ page import="com.aptech.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<%
    String user = (String) request.getAttribute("user");
%>
<h1>Hello ! <%= user %>
</h1>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi corporis doloribus ea eligendi, reiciendis vitae. Accusamus beatae distinctio velit. Dicta
    doloremque dolores fugiat ipsum iure minus optio temporibus vitae voluptas.</p>

<%
    String[] employees = (String[]) request.getAttribute("employees");
    for (int i = 0; i < employees.length; i++) {
        out.print(employees[i] + ", ");
    }
%>

<hr>

<%
    List<Student> studentList = (List<Student>) request.getAttribute("stdList");
    for (Student s : studentList) {
        out.print(s.getName() + " " + s.getAge());
    }

%>
</body>
</html>
