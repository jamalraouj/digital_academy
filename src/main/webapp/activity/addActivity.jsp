<%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 11/3/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="Entity.Type" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request. getContextPath()%>/login" method="post">
    <div class="form-group">
        <label >Title</label>
        <input type="text" name="title"  class="form-control" >
    </div>
    <div class="form-group">
        <label >Title</label>
        <input type="text" name="title"  class="form-control" >
    </div>
    <select>
        <option >${Type.Formation}</option>
        <option >${Type.Evenement}</option>
        <option >${Type.Talk}</option>
    </select>
    <div class="form-group">
        <label >Description</label>
        <input type="text" name="description"  class="form-control" >

    </div>

    <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>
