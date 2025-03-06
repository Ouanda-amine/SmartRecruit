<%@ page import="org.example.smartrecruit.bean.Users" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: amine
  Date: 06/03/2025
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <title>Title</title>
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">users List</h2>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>NOM</th>
            <th>email</th>
            <th>role</th>
            <th>password</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Users> usersList = (List<Users>) request.getAttribute("userslist");

            for (Users users : usersList) {
        %>
        <tr>
            <td><%= users.getId() %></td>
            <td><%= users.getNom() %></td>
            <td><%= users.getEmail()%></td>
            <td><%= users.getRole() %></td>
            <td><%= users.getPassword() %></td>
            <td>
                <a href="user?action=edit&id=<%= users.getId() %>" class="btn btn-warning btn-sm">Edit</a>
                <a href="user?action=delete&id=<%= users.getId() %>" class="btn btn-danger btn-sm">Delete</a>





            </td>
        </tr>
        <%

            }
        %>
        </tbody>
    </table>

    <a href="userform.jsp" class="btn btn-success">Add new user</a>
</div>

</body>
</html>
