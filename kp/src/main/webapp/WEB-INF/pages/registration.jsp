<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true"%>

<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>

    <script src="js/check.js"></script>
    <script src="js/app.js"></script>
</head>
<body>
<div class="two"><h1>VetProfi</h1></div>
<form id="registration" method="post" action="saveUser">
    <fieldset>
        <legend>Форма регистрации</legend>

        <div class="field">
            <label for="surname">Фамилия: </label>
            <input type="text" name="surname" id="surname" placeholder="Surname" maxlength="15" modelAttribute="userInfo" value="${userObject.surname}"/>
        </div>
        <div class="field">
            <label for="name">Инициалы:</label>
            <input type="text" name="name" id="name" placeholder="Initials" maxlength="2" modelAttribute="userInfo" value="${userObject.name}"/>
        </div>
        <div class="field">
            <label>Паспорт:</label>
            <input type="text" name="number_passport" id="number_passport" placeholder="Passport" maxlength="9" modelAttribute="userInfo" value="${userObject.numberPassport}"/>
        </div>
        <div class="field">
            <label>Телефон:</label>
            <input type="text" name="telephone" id="telephone" placeholder="Telephone" maxlength="9" modelAttribute="userInfo" value="${userObject.telephone}"/>
        </div>
        <div class="field">
            <label>Email:</label>
            <input type="text" name="email" id="email" placeholder="Email" maxlength="30" modelAttribute="userInfo" value="${userObject.email}"/>
        </div>
        <div class="field">
            <label>Логин:</label>
            <input type="text" class="login-control" id="login" name="login" placeholder="Login" modelAttribute="user" value="${userObj.login}" />
        </div>
        <div class="field">
            <label>Пароль:</label>
            <input type="hidden" id="idUserInfo" modelAttribute="userInfo" value="${userObject.id}"/>
            <input type="password" class="password-control" id="password" name="password" placeholder="Password" modelAttribute="user" value="${userObj.password}"/>
        </div>
        <br>
        <div align="center">
            <input type="submit" value="Отправить" class="button" value="saveInfo" onclick="return submitUserForm();"/>
            <input type="reset" value="Очистить форму" class="button"/>
            <input hidden type="text" name="command" value="Add" />
        </div>

    </fieldset>
</form>

<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>

</body>
</html>
