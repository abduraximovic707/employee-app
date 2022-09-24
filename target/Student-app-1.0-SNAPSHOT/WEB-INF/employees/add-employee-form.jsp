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
    <title>Add Employee</title>
</head>
<body>

<form action="/employees" method="post">
    <label for="fullName">Full Name: </label>
    <input name="fullName" type="text" id="fullName">
    <hr>
    <select name="levelId">
        <option selected disabled value="0">Select brand:</option>
    </select>
    <hr>
    <select name="langId">
        <option selected disabled value="0">Select brand:</option>
    </select>
    <hr>
    <button type="submit">Save</button>
</form>

</body>
</html>
