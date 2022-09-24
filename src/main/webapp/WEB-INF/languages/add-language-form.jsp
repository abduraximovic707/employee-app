<%--
  Created by IntelliJ IDEA.
  User: Abduraximovich
  Date: 24.09.2022
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Language</title>
</head>
<body>

<form action="/languages" method="post">
    <label for="name">Name: </label>
    <input name="name" type="text" id="name">
    <hr>
    <label for="description">Description: </label>
    <input name="description" type="text" id="description">
    <hr>
    <button type="submit">Save</button>
</form>

</body>
</html>
