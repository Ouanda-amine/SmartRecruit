<%--
  Created by IntelliJ IDEA.
  User: amine
  Date: 05/03/2025
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

</head>
<body>
<div class="container w-50 mt-5">
    <h1 class="text-center mb-4">Sign Up</h1>

    <form action="user" method="post">
        <div class="form-group mb-3">
            <label for="nom" class="form-label">Nom </label>
            <input
                    type="text"
                    class="form-control"
                    id="nom"
                    placeholder="Entez votre nom"
                    name="nom"
            />
        </div>
        <div class="form-group mb-3">
            <label for="email" class="form-label">Email</label>
            <input
                    type="text"
                    class="form-control"
                    id="email"
                    placeholder="Enter the description"
                    name="email"
            />
        </div>
        <div class="form-group mb-3">
            <label for="role" class="form-label">vous etes Recruteur ou Candidat</label>
            <input
                    type="text"
                    class="form-control"
                    id="role"
                    placeholder="Entez votre role"
                    name="role"
            />
        </div>

        <div class="form-group mb-3">
            <label for="password" class="form-label">Mot de Passe</label>
            <input
                    type="password"
                    class="form-control"
                    id="password"
                    placeholder="Entez un mot de passe"
                    name="password"
            />
        </div>



        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>

</body>
</html>
