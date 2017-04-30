<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form id="registration"  modelAttribute="userInfo" method="post" action="saveUser">
    <fieldset>
        <legend>Форма регистрации</legend>
        <div class="main">
            <div class="field">
                <label for="surname">Фамилия: </label>
                <input type="text" name="surname" id="surname" placeholder="Surname" maxlength="15" value="${userObject.surname}"/>
            </div>
            <div class="field">
                <label for="init">Инициалы:</label>
                <input type="text" name="init" id="init" placeholder="Initials" maxlength="2" value="${userObject.name}"/>
            </div>
            <div class="field">
                <label for="pass">Паспорт:</label>
                <input type="text" name="pass" id="pass" placeholder="Passport" maxlength="9" value="${userObject.numberPassport}"/>
            </div>
            <div class="field">
                <label for="init">Телефон:</label>
                <input type="text" name="tel" id="tel" placeholder="Telephone" maxlength="9" value="${userObject.telephone}"/>
            </div>
            <div class="field">
                <label for="init">Email:</label>
                <input type="text" name="tel" id="mail" placeholder="Email" maxlength="10" value="${userObject.email}"/>
            </div>
            <br>
            <div class="serv-but">
                <input type="submit" value="Отправить" class="button" value="saveInfo" onclick="return submitUserForm();"/>
                <input type="submit" value="Очистить форму" class="button"/>
                <input hidden type="text" name="command" value="Add" />
            </div>
        </div>
    </fieldset>
</form>

<br>
</body>
</html>
