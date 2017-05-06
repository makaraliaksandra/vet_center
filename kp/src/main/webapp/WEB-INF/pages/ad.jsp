<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="false"%>
<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <link rel="stylesheet" type="text/css" href="../../css/table.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>
</head>
<body>
<div class="two"><h1>VetProfi</h1></div>
<form action="saveAd"  modelAttribute="newAd">
    <fieldset>
        <legend>Введите текст объявления</legend>
            <div class="field">
                <label >Объявление:</label>
                <textarea id="textAd" cols="30" rows="10" name="textAd" placeholder="Ответ..."></textarea>
                <br> <br>
                <div align="center" style="margin-left: 26%">
                    <input type="submit" value="Отправить" class="button"/>
                    <input hidden type="text" name="command" value="Add" />
                </div>
            </div>
    </fieldset></form>
<br>
<a href="index" >Вернуться назад<span class="arrow">&rarr;</span></a>
<br><br>
</body>
</html>
