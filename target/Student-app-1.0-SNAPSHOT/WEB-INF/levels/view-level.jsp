    <%--
  Created by IntelliJ IDEA.
  User: Abduraximovich
  Date: 24.09.2022
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Level</title>
</head>
<body>
<a href="/levels/get-form">>Add Level</a>
<c:forEach items="${darajalar}" var="daraja" varStatus="loop">
    <h1>${daraja.name}</h1>
    <a href="/level/edit/${daraja.id}">Edit</a>
    <a href="/level/delete/${daraja.id}">Delete</a>
    <hr>
</c:forEach>

</body>
</html>
