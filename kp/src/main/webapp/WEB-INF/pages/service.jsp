<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>

    <script src="js/app.js"></script>
</head>
<body>
<div class="two"><h1>VetProfi</h1></div>
<form>

    <fieldset>
        <legend>Форма заказа услуги</legend>
        <div class="main">
            <div class="field">
                <label for="surname">Фамилия: </label>
                <input type="text" name="surname" id="surname" placeholder="Surname" />
            </div>
            <div class="field">
                <label for="init">Инициалы:</label>
                <input type="text" name="init" id="init" placeholder="Initials" />
            </div>
            <div class="field">
                <label for="service">Услуга:</label>
                <select name="service" id="service">
                    <option>Service</option>
                    <option value="Услуга1">Услуга1</option>
                    <option value="Услуга2">Услуга2</option>
                    <option value="Услуга3">Услуга3</option>
                </select>
            </div>
            <div class="field">
                <label for="date">Дата:</label>
                <input type="date" id="date" name="date" placeholder="mm/dd/yyyy"/>
            </div>
            <div class="field">
                <label for="time">Время:</label>
                <input type="time" id="time" name="time" placeholder="hh:mm"/>
            </div>
            <br>
            <div align="center">
                <input type="submit" value="Отправить" class="button"/>
                <input type="reset" value="Очистить форму" class="button"/>
                <input hidden type="text" name="command" value="Add" />
            </div>
        </div>
    </fieldset>
</form>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>
