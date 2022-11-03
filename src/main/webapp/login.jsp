<%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 11/2/2022
  Time: 12:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<%--  <link href="./assets/bootstrap.min.css" rel="stylesheet">--%>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<%--  <%@include file="bootstrap/css/bootstrap.css" %>--%>
</head>
<body>
<form action="<%=request. getContextPath()%>/login" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="userEmail"  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="userPass" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>

  <input type="submit" class="btn btn-primary" value="Login">
</form>
<%--<form action="<%=request. getContextPath()%>/login" method="post">--%>

<%--  Email Id:<input type="text" name="userEmail"/><br/>--%>
<%--  Password:<input type="password" name="userPass"/><br/><br/>--%>
<%--  <br/><br/>--%>
<%--  <input type="submit" value="login"/>--%>

<%--</form>--%>
</body>
</html>