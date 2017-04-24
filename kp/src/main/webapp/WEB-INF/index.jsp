<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Employees List</title>
  <!-- Bootstrap CSS -->
  <%-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"> --%>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <style type="text/css">
    .myrow-container {
      margin: 20px;
    }
  </style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
  <div class="panel panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">
        <div align="left"><b>Users List</b> </div>
        <div align="right"><a href="createEmployee">Add New User</a></div>
      </h3>
    </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

  <%-- <script src="<c:url value="/resources/js/jquery-2.1.3.js"/>"></script>
  <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
   --%>

</body>
</html>

<!--%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ветеринарный центр</title>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>

    <script src="app.js"></script>
  </head>
  <body>
    <p>Hello, meow</p>
    <form id="editFlowers" name="editFlowers" class="form-horizontal" action="ShowServlet" method="post" style="padding: 15px;">
    <p>Login:</p>
    <input type="text" class="login-control" id="login" name="login" placeholder="Login" />
    <br>
    <p>Password:</p>
    <input type="password" class="password-control" id="password" name="password1" placeholder="Password" />
      <td>Confirm Password :</td>
      <td><input type="password" name="password2" size="30" /></td>
      <br>
    <p>Role:</p>
    <input type="text" class="id_role" id="id_role" name="id_role" placeholder="Role" />

    <input type="submit" id="add" class="btn btn-primary btn-sm" value="Add" />
    <input hidden type="text" name="command" value="Add" />
    </form>

    <br>
    <table>
      <tr>
        <td><input type="text" value="\${login}" /></td>
        <td><input type="text" value="\${password}" /></td>
      </tr>
    </table>

    <br>
 </body>
</html>-->
