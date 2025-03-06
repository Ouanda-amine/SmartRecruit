<%--
  Created by IntelliJ IDEA.
  User: amine
  Date: 06/03/2025
  Time: 10:39
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
    <form action="offre" method="post">
        <div class="form-group mb-3">
            <label for="titre" class="form-label">Titre de l'offre </label>
            <input
                    type="text"
                    class="form-control"
                    id="titre"
                    placeholder="Entez le titre de l'offre"
                    name="titre"
            />
        </div>
        <div class="form-group mb-3">
            <label for="description" class="form-label">Description</label>
            <input
                    type="text"
                    class="form-control"
                    id="description"
                    placeholder="Enter the description"
                    name="description"
            />
        </div>
        <div class="form-group mb-3">
            <label for="date" class="form-label">entrez la date</label>
            <input
                    type="date"
                    class="form-control"
                    id="date"
                    placeholder="Entez votre role"
                    name="date"
            />
        </div>





        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

</div>


</body>
</html>
