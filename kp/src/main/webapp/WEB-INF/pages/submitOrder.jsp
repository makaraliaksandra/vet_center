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
    <script type="text/javascript" src="../../js/sort.js"></script>
    <script src="js/app.js"></script>
</head>
<body>
<div class="two"><h1>VetProfi</h1></div>
<form action="submitOrder/${servList.name}"  modelAttribute="dateInput">
<fieldset>
        <legend>Выберите предпочитаемую дату</legend>

            <table>
                <div class="main">
                <tbody align="right">
                <c item="${servList}">
                    <div class="field">
                    <tr>
                        <th><label for="name" style="font-weight: normal">Наименование услуги:</label></th>
                        <th id="name" name="name" style="font-weight: normal;"><c:out value="${servList.name}"/></th>
                    </tr>

                    <div class="field">
                    <tr>
                        <th><label for="cost" style="font-weight: normal;">Стоимость:</label></th>
                        <th id="cost" name="cost" style="font-weight: normal;"><c:out value="${servList.cost}"/></th>
                    </tr></div>
                    <div class="field">
                    <tr>
                        <th><label for="sale" style="font-weight: normal;">Скидка:</label><br>

                        </th>
                        <th id="sale" name="sale" style="font-weight: normal;"><c:out value="${servList.sale}"/><span>%</span></th>
                    </tr>
                    </div></div>
                </c>
                </tbody>
                </div>
            </table>


        <div class="field">
            <label for="date">Дата:</label>
            <input type="date" id="date" name="date" placeholder="mm/dd/yyyy"/>
        <br> <br>
            <div align="center" style="margin-left: 26%">
                <input type="submit" value="Заказать" class="button"/>
                <input hidden type="text" name="command" value="Add" />
            </div>
        </div>

</fieldset>
</form>
<br>
<a href="index" >Вернуться назад<span class="arrow">&rarr;</span></a>
<br><br>
</body>
</html>
