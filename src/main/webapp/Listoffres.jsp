<%@ page import="org.example.smartrecruit.bean.Offre" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: amine
  Date: 05/03/2025
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous" />

    <title>Title</title>
</head>
<body>

<ul>
    <%
        List<Offre> offreList = (List<Offre>) request.getAttribute("offrelist");

        for (Offre offre : offreList) {
    %>
    <li >
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title"> <%= offre.getTitre() %> </h5>
                <p class="card-text"><%= offre.getDescription() %></p>
                <p class="card-text"><%= offre.getDateoffre() %></p>

                <a ></a>


            </div>
        </div>

    </li>
    <%
        }
    %>


</ul>

</body>
</html>
