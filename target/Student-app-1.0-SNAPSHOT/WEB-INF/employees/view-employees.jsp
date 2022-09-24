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
    <title>View Employees</title>
</head>
<body>
<a href="/employees/get-form">>Add Employee</a>
<c:forEach items="${xodimlar}" var="xodim" varStatus="loop">
    <h1>${xodim.full_name}</h1>
    <p>${xodim.program_lang_id}</p>
    <p>${xodim.level_id}</p>
    <a href="/employees/edit/${xodim.id}">Edit</a>
    <a href="/employees/delete/${xodim.id}">Delete</a>
    <hr>
</c:forEach>

</body>
</html>
