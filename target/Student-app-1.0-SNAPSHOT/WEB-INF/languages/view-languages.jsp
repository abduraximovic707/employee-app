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
    <title>View Language</title>
</head>
<body>
<a href="/languages/get-form">>Add Languages</a>
<c:forEach items="${tillar}" var="til" varStatus="loop">
    <h1>${til.name}</h1>
    <p>${til.description}</p>
    <a href="/languages/edit/${til.id}">Edit</a>
    <a href="/languages/delete/${til.id}">Delete</a>
    <hr>
</c:forEach>

</body>
</html>
