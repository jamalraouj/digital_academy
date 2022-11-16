
<%@ page import="java.util.List" %>
<%@ page import="Entity.Activity" %><%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 11/14/2022
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Activity</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>
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

<div class="d-flex justify-content-center">
    <div class="d-flex justify-content-between py-5 w-75">
        <h1 class="text-primary ">Les activites :</h1>
        <a href="<%=request. getContextPath()%>/activity/add_activity"  class="btn btn-primary">Ajouter un activity</a>
    </div>
</div>


<div class="d-flex justify-content-center">
    <% List<Activity> a = ((List<Activity>) request.getAttribute("activities")); %>
    <table class="table w-75">
        <thead class="table-light">
        <th>Id</th>
        <th>Title</th>
        <th>Type</th>
        <th>Status</th>
        <th>Start date</th>
        <th>End date</th>
        </thead>
        <tbody>


        <% for( Activity act :  a) { %>
        <tr>
            <td><%= act.getId() %></td>
            <td><%= act.getTitle()%></td>
            <td><%= act.getType()%></td>
            <td><%= act.getStatus() %></td>
            <td><%= act.getStartDate() %></td>
            <td><%= act.getEndDate() %></td>
            <td>
                <a href="<%=request. getContextPath()%>/Activity/ActivityUpdate?id=<%=act.getId()%>"  class="btn btn-primary">Modifier</a>
            </td>
            <td>
                <a href="<%=request. getContextPath()%>/Activity/participation?id=<%=act.getId()%>"  class="btn btn-primary">Assignee des participation </a>
            </td>
        </tr>
        <%}%>

        <%--            <td>--%>
        <%--                <input type="button" value="Modifier" class="btn btn-primary">--%>
        <%--            </td>--%>
        </tbody>
    </table>
</div>


</body>
</html>
