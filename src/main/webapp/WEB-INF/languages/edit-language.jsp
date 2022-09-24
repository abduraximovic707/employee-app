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
    <title>Edit Language</title>
</head>
<body>

<form action="/languages/edit">
  <input type="text" name="id" hidden value="${til.id}">
  <label for="name">language</label>
  <input type="text" id="name" value="${til.lang_id}">
  <label for="description">Description</label>
  <input type="text" id="description" value="${til.description}">
  <button class="btn btn-outline-primary" type="submit">Save</button>
</form>

</body>
</html>
