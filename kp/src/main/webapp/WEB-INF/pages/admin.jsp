<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<form class="auth" action="${pageContext.request.contextPath}/j_security_check" method='POST'>
    <fieldset>
        <legend>Авторизация администратора</legend>
        <p>Логин:</p>
        <input type="text" class="login-control" id="login" name="login" placeholder="Login" />
        <p>Пароль:</p>
        <input type="password" class="password-control" id="password" name="password" placeholder="Password" />
        <br>
        <c:if test="${param.error == 'true'}">
            <div style="color:red;margin:10px 0px;">
                <b>Ошибка авторизации</b><br />
            </div>
        </c:if>
        <input type="submit" value="Авторизация" class="button"/>
        <input type="reset" value="Очистить форму" class="button"/>
        <input hidden type="text" name="command" value="Add" />
    </fieldset>
</form>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>

</body>
</html>
