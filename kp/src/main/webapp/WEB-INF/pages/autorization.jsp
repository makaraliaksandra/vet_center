<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>

    <script src="app.js"></script>
</head>
<body>
<div class="two"><h1>VetProfi</h1></div>
<form class="auth">
    <fieldset>
        <p>Логин:</p>
        <input type="text" class="login-control" id="login" name="login" placeholder="Login" />
        <br>
        <p>Пароль:</p>
        <input type="text" class="password-control" id="password" name="password" placeholder="Password" />
        <br><br>
        <input type="submit" value="Авторизация" class="button"/>
        <a href="registration" class="button" >Регистрация</a>
        <input type="submit" value="Очистить форму" class="button"/>
        <input hidden type="text" name="command" value="Add" />
    </fieldset>
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
