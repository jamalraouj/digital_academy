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
    <title>Title</title>
</head>
<body>
<form action="<%=request. getContextPath()%>/add_activity" method="post">
    <div class="form-group">
        <label >Title</label>
        <input type="text" name="title"  class="form-control" >
    </div>
    <div class="form-group">
        <label >Description</label>
        <input type="text" name="description"  class="form-control" >
    </div>
    <select name="type">
        <option >${Type.Formation}</option>
        <option >${Type.Evenement}</option>

    </select>
    <select name="responsable">


    <% List<Responsable> r = ((List<Responsable>) request.getAttribute("responsables")); %>

    <% for( Responsable res :  r) { %>
        <option value="<%= res.getId() %>"><%= res.getName() %></option>
<%--    <p><%= res.getName() %></p>--%>
    <%}%>
    </select>
<%--    <h1><% request.getAttribute("responsables"). %></h1>--%>
    <select name="status">
        <option >${Status.enCours}</option>
        <option >${Status.tetmine}</option>



    </select>
    <div class="form-group">
        <label >Start date</label>
        <input type="date" name="startDate"  class="form-control" >

    </div>
    <div class="form-group">
        <label >End date</label>
        <input type="date" name="endDate"  class="form-control" >
    </div>

    <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>
