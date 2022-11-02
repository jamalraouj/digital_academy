<%--
  Created by IntelliJ IDEA.
  User: Jamal Raouj
  Date: 11/2/2022
  Time: 12:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<form action="<%=request. getContextPath()%>/login" method="post">

  Email Id:<input type="text" name="userEmail"/><br/>
  Password:<input type="password" name="userPass"/><br/><br/>
  <br/><br/>
  <input type="submit" value="login"/>

</form>
</body>
</html>