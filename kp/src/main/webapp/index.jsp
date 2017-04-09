<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <input type="text" class="password-control" id="password" name="password" placeholder="Password" />

    <input type="submit" id="add" class="btn btn-primary btn-sm" value="Add" />
    <input hidden type="text" name="command" value="Add" />
    </form>

    <br>
    <table>
      <tr>
        <td><input type="text" value="${login}" /></td>
        <td><input type="text" value="${password}" /></td>
      </tr>
    </table>

    <br>
 </body>
</html>
