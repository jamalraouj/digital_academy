<%@ page import="Entity.Responsable" %>
<%@ page import="Entity.TypeResponsable" %><%--
  Created by IntelliJ IDEA.
  User: saida-barakat
  Date: 14/11/2022
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Responsable</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>
<%-- Start NavBar--%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Pole Digital Academy</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav w-100 d-flex justify-content-end">

                <li class="nav-item px-5 mx-2">
                    <a class="nav-link active" aria-current="page" href="<%=request. getContextPath()%>/Participant">Participants</a>
                </li>
                <li class="nav-item px-5 mx-2">
                    <a class="nav-link" href="<%=request. getContextPath()%>/Responsable">Responsables</a>
                </li>
                <li class="nav-item px-5 mx-2 ">
                    <a class="nav-link" href="<%=request. getContextPath()%>/activity">Activités</a>
                </li>
                <li class="nav-item bg-gradient px-5 ms-2s">
                    <a class="nav-link" href="<%=request. getContextPath()%>/LogoutServlet">Logout</a>
                </li>

            </ul>
        </div>
    </div>
</nav>
<%-- End NavBar --%>

<% Responsable res= ((Responsable) request.getAttribute("responsableToEdit"));%>

<div class="d-flex flex-column">
    <div class="w-100 d-flex justify-content-center">
        <div class="w-50 mt-5">
            <h1>Modifier un Responsable</h1>
            <form action="" method="post">
                <div class="form-group mt-5">
                    <label >Nom complet</label>
                    <input type="text" name="name"  class="form-control" value="<%=res.getName()%>" >
                </div>
                <div class="form-group mt-3">
                    <label >Téléphone</label>
                    <input type="text" name="phone"  class="form-control" value="<%=res.getPhone()%>">
                </div>
                <div class="form-group mt-3 d-flex flex-column">
                    <label >Type de responsabilité</label>
                    <select name="typeResp" class="form-control">
    <%--                    <% if(res.getTypeResp()== TypeResponsable.Formateur) { %>--%>
                        <option >${TypeResponsable.Formateur}</option>
                        <option >${TypeResponsable.Intervenant}</option
                    </select>
                </div>
                <input type="hidden">
                <div class="form-group mt-3">
                    <label >Domaine</label>
                    <input type="text" name="domaine"  class="form-control" value="<%=res.getDomaine()%>">
                </div>

                <div class="w-100 d-flex justify-content-center">
                    <button type="submit" class="btn btn-primary mt-3 w-50 w-md-100">Update</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
