<%--
  Created by IntelliJ IDEA.
  User: saida-barakat
  Date: 14/11/2022
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Entity.TypeResponsable" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter Responsable</title>
</head>
<body>
<h1>Ajouter un responsable</h1>
<form action="<%=request. getContextPath()%>/AddResponsable" method="post" class="d-flex flex-row">
    <div class="form-group">
        <label >Name</label>
        <input type="text" name="name"  class="form-control" >
    </div>
    <div class="form-group">
        <label >Phone</label>
        <input type="text" name="phone"  class="form-control" >
    </div>
    <div class="form-group">
        <label >Type de responsabilité</label>
        <select name="typeResp">
            <option >${TypeResponsable.Formateur}</option>
            <option >${TypeResponsable.Intervenant}</option
        </select>
    </div>
    <div class="form-group">
        <label >Domaine</label>
        <input type="text" name="domaine"  class="form-control" >
    </div>


    <button type="submit" class="btn btn-primary">Ajouter</button>
</form>
</body>
</html>
