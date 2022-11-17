<%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 11/3/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Entity.Type" %>
<%@ page import="Entity.Status" %>
<%@ page import="Entity.Responsable" %>
<%@ page import="java.util.PriorityQueue" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Activity</title>
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

<div class="d-flex flex-column flex-md-row">
    <div class="w-100 d-flex justify-content-center">
        <div class="w-50 mt-5">
            <h1>Ajouter une activité</h1>
            <form action="<%=request. getContextPath()%>/activity/add_activity" method="post">
                <div class="form-group mt-5">
                    <label >Title</label>
                    <input type="text" name="title"  class="form-control" >
                </div>
                <div class="form-group mt-3">
                    <label >Description</label>
                    <input type="text" name="description"  class="form-control" >
                </div>
                <div class="form-group mt-3 d-flex flex-column">
                    <label >Type d'activité</label>
                    <select name="type" class="form-control" >
                        <option >${Type.Formation}</option>
                        <option >${Type.Evenement}</option>
                    </select>
                </div>
                <div class="form-group mt-3 d-flex flex-column">
                    <label >Les responsables</label>
                    <select name="responsable" class="form-control" >


                    <% List<Responsable> r = ((List<Responsable>) request.getAttribute("responsables")); %>

                    <% for( Responsable res :  r) { %>
                        <option value="<%= res.getId() %>"><%= res.getName() %></option>
                    <%}%>
                    </select>
                </div>
                <div class="form-group mt-3 d-flex flex-column">
                    <label >Status d'activité</label>
                    <select name="status" class="form-control">
                        <option >${Status.enCours}</option>
                        <option >${Status.tetmine}</option>
                    </select>
                </div>
                <div class="form-group mt-3">
                    <label >Start date</label>
                    <input type="date" name="startDate"  class="form-control" >

                </div>
                <div class="form-group mt-3">
                    <label >End date</label>
                    <input type="date" name="endDate"  class="form-control" >
                </div>
                <div class="w-100 d-flex justify-content-center">
                <button type="submit" class="btn btn-primary mt-3 w-50 w-md-100">Ajouter</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
