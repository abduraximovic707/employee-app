<%--
  Created by IntelliJ IDEA.
  User: Abduraximovich
  Date: 24.09.2022
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Level</title>
</head>
<body>

<form action="/levels/edit">
  <input type="text" name="id" hidden value="${daraja.id}">
  <label for="name">Level</label>
  <input type="text" id="name" value="${daraja.lang_id}">
  <button class="btn btn-outline-primary" type="submit">Save</button>
</form>

</body>
</html>
