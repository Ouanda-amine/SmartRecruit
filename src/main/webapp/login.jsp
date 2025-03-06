<%--
  Created by IntelliJ IDEA.
  User: amine
  Date: 05/03/2025
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
    <div class="container">
        <a class="navbar-brand" href="#">SmartRecruit</a>
        <a class="btn btn-success" href="userform.jsp">Sign Up</a>
    </div>
</nav>
<h1 style="color: green ; text-align: center" > Bienvenu a SmartRcruit  </h1>
<h2 style="color: grey ; text-align: center" >l' Espace parfait pour trouver des offres et des employés</h2>
<div class="container w-50 mt-5" style="background-color: rgba(2,99,21,0.38) ; padding: 40px ; border-radius: 15px;" >
    <div class="card-body">
        <h2 class="card-title text-center mb-4">Connect to your Account</h2>
        <form action="login" method="post">
            <label for="username" class="form-label">User Name</label>
            <input type="text" class="form-control" id="username" name="username">
            <label for="password" class="form-label">PassWord</label>
            <input type="password" class="form-control" id="password" name="password" style="margin-bottom: 30px">
            <button type="submit" class="btn btn-success" style="float: right ; margin-bottom: 40px">Login</button>
        </form>
    </div>
</div>

</body>
</html>
