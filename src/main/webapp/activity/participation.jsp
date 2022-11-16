<%@ page import="Entity.Participant" %>
<%@ page import="java.util.List" %>
<%@ page import="Entity.Activity" %><%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 11/16/2022
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>
<div class="d-flex justify-content-center">
    <table class="table w-75">
        <thead class="table-light">
        <th>Id</th>
        <th>Nom Complet</th>
        <th>Phone</th>
        <th>Domaine</th>
        <th>Structure</th>
        <th>Action</th>
        </thead>
        <tbody>

        <% List<Participant> p = (List<Participant>) request.getAttribute("participants"); %>
<form method="post" action="<%=request. getContextPath()%>/Activity/participation?id=<%=request.getParameter("id") %>">
        <% for( Participant part :  p) { %>
        <tr>

            <td>
                <input class="form-check-input" name="part" type="checkbox" id="checkboxNoLabel" value="<%= part.getId() %>">
            </td>
            <td><%= part.getId() %></td>
            <td><%= part.getName() %></td>
            <td><%= part.getPhone() %></td>
            <td><%= part.getDomaine() %></td>
            <td><%= part.getStructure() %></td>
        </tr>
        <%}%>
    <input type="submit">
</form>

        <%--            <td>--%>
        <%--                <input type="button" value="Modifier" class="btn btn-primary">--%>
        <%--            </td>--%>
        </tbody>
    </table>
</div>

</body>
</html>
