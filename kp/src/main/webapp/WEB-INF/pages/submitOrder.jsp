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
<div id="wrapper">
        <h1>Выберите предпочитаемую дату</h1>

            <table id="keywords" cellspacing="0" cellpadding="0">
                <thead>
                    <tr><th colspan="2">Ваша заявка:</th></tr>
                </thead>
                <tbody>
                <c item="${servList}">
                    <tr>
                        <th bgcolor="#deb887"><span>Наименование услуги:</span></th>
                        <th class="lalign"><c:out value="${servList.name}"/></th>
                    </tr>
                    <tr>
                        <th bgcolor="#deb887"><span>Описание:</span></th>
                        <td colspan="2"><c:out value="${servList.description}"/>
                        </td>
                    </tr>
                    <tr>
                        <th bgcolor="#deb887"><span>Стоимость:</span></th>
                        <th><c:out value="${servList.cost}"/></th></tr>
                    <tr>
                        <th bgcolor="#deb887"><span>Скидка:</span><br>
                            <p >*Скидка может быть изменена, проверяйте "Личный кабинет"</p>
                        </th>
                        <th><c:out value="${servList.sale}"/></th>

                    </tr>
                </c>
                </tbody>
            </table>
    <form action="submitOrder/${servList.name}"  modelAttribute="dateInput">
        <div class="field">
            <label for="date">Дата:</label>
            <input type="date" id="date" name="date" placeholder="mm/dd/yyyy"/>
        <br>
            <div align="center">
                <input type="submit" value="Заказать" class="button"/>
                <input hidden type="text" name="command" value="Add" />
            </div>
        </div>
    </form>
</div>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
<br><br>
</body>
</html>
