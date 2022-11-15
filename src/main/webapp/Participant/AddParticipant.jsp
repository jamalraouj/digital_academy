<%--
  Created by IntelliJ IDEA.
  User: saida-barakat
  Date: 14/11/2022
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier un participant</title>
</head>
<body>
<h1>Update participant</h1>
<form action="" method="post">
    <div class="form-group">
        <label >Name</label>
        <input type="text" name="name"  class="form-control" >
    </div>
    <div class="form-group">
        <label >Phone</label>
        <input type="text" name="phone"  class="form-control" >
    </div>
    <div class="form-group">
        <label >Domaine</label>
        <input type="text" name="domaine"  class="form-control" >

    </div>
    <div class="form-group">
        <label >Structure</label>
        <input type="text" name="structure"  class="form-control" >
    </div>

    <button type="submit" class="btn btn-primary">Ajouter</button>
</form>
</body>
</html>
