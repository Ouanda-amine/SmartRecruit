<%@ page import="org.example.smartrecruit.bean.Users" %><%--
  Created by IntelliJ IDEA.
  User: amine
  Date: 06/03/2025
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

</head>
<style>
    .form-group{
        margin-bottom: 40px;
    }
</style>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Update User</h2>

    <%
        Users users = (Users) request.getAttribute("users");
    %>

    <form action="user" method="post">
        <input type="hidden" name="id" value="<%= users.getId() %>"/>
        <input type="hidden" name="action" value="update"/>

        <div class="form-group">
            <input type="text" class="form-control" name="nom" value="<%=users.getNom()%>" required />
        </div>

        <div class="form-group">
            <input type="text" class="form-control" name="email" value="<%=users.getEmail()%>" required />
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="role" value="<%=users.getRole() %>" required />
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="password" value="<%=users.getPassword()%>" required />
        </div>

        <button type="submit" class="btn btn-primary btn-block">Update</button>
    </form>


    <br>
</div>

</body>
</html>
