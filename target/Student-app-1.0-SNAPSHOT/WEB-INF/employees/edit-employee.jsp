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
    <title>Edit Employee</title>
</head>
<body>

<form action="/employees/edit">
  <input type="text" name="id" hidden value="${xodim.id}">
  <label for="fullName">FullName</label>
  <input type="text" id="fullName" value="${xodim.full_name}">
  <select name="levelId">
    <option selected disabled value="0">Select brand:</option>
  </select>
  <hr>
  <select name="langId">
    <option selected disabled value="0">Select brand:</option>
  </select>
  <hr>
  <button class="btn btn-outline-primary" type="submit">Save</button>
</form>

</body>
</html>
