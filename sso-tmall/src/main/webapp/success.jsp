<%--
  Created by IntelliJ IDEA.
  User: Jinhua
  Date: 2022/4/2
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Tmall login success</title>
</head>
<body>
<h1>Tmall Login Success</h1>
<h3>name: ${sessionScope.userAttr}</h3>
<h3>password: ${sessionScope.passwordAttr}</h3>

<a href="logout">logout</a>
</body>
</html>
