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
<form action="submitAnswer/${queList.idQuestion}"  modelAttribute="que">
    <fieldset>
        <legend>Дайте ответ на вопрос пользователя</legend>
        <c item="${queList}">
        <table>
            <div class="main">
                <tbody align="right">

                    <div class="field">
                        <tr>
                            <th><label for="name" style="font-weight: normal">Пользователь:</label></th>
                            <th id="name" name="name" style="font-weight: normal;"><c:out value="${queList.login}"/></th>
                        </tr>

                        <div class="field">
                            <tr>
                                <th><label for="textQuestion" style="font-weight: normal;">Вопрос:</label></th>
                                <th id="textQuestion" name="textQuestion" style="font-weight: normal;"><c:out value="${queList.textQuestion}"/></th>
                            </tr></div>
                    </div>

                </tbody>
            </div>
        </table>


            <div class="field">
                <label >Ответ:</label>
                <textarea id="answer" cols="30" rows="10" name="answer"placeholder="Ответ..."></textarea>
                <br> <br>
                <div align="center" style="margin-left: 26%">
                    <input type="submit" value="Отправить" class="button"/>
                    <input hidden type="text" name="command" value="Add" />
                </div>
            </div>

        </c>
    </fieldset></form>
<br>
<a href="index" >Вернуться назад<span class="arrow">&rarr;</span></a>
<br><br>
</body>
</html>
