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
<form id="registration" method="post" action="saveUser">
    <fieldset>
        <legend>Сервис</legend>
        <div class="field">
            <label>Описание:</label>
            <textarea rows="10" cols="18" name="que" id="que" placeholder="Description" maxlength="40" modelAttribute="userInfo"/></textarea>
        </div>
        <div class="field">
            <label for="name">Название:</label>
            <input type="text" id="name" name="name" placeholder="Name"/>
        </div>
        <div class="field">
            <label for="cost">Цена:</label>
            <input type="text" id="cost" name="cost" placeholder="Cost"/>
        </div>

        <br>
        <div align="center">
            <input type="submit" value="Отправить" class="button" value="saveInfo" onclick="return submitUserForm();"/>
            <input type="submit" value="Очистить форму" class="button"/>
            <input hidden type="text" name="command" value="Add" />
        </div>

    </fieldset>
</form>

<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>
