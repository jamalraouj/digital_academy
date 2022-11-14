<%--
  Created by IntelliJ IDEA.
  User: saida-barakat
  Date: 04/11/2022
  Time: 09:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Participant</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<%-- Start NavBar--%>
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav w-100 d-flex justify-content-end">

        <li class="nav-item px-5 mx-2">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item px-5 mx-2">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item px-5 mx-2 ">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item bg-gradient px-5 ms-2s">
          <a class="nav-link" href="login">Logout</a>
        </li>

      </ul>
    </div>
  </div>
</nav>
<%-- End NavBar --%>
<h1 class="text"-primary ms-5">Les activités :</h1>
<div class="mt-4 d-flex justify-content-center">
    <table class="table w-75">
        <thead class="table-light">
            <th>Titre</th>
            <th>Description</th>
            <th>Type</th>
            <th>Date de début</th>
            <th>Date de fin</th>
            <th>Status</th>
            <th>Responsable</th>
            <th>Action</th>
        </thead>
        <tbody>
            <td>1</td>
            <td>2</td>
            <td>3</td>
            <td>4</td>
            <td>5</td>
            <td>6</td>
            <td>7</td>
            <td>
                <input type="button" value="Modifier" class="btn btn-primary">
            </td>
        </tbody>
    </table>
</div>


</body>
</html>
