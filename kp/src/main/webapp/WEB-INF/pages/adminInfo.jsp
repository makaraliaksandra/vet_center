<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Страница администратора</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script type="text/javascript" src="../../js/check.js"></script>
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
</head>
<body style=" background-color: #E4E5D2; align-content: center">
<div >
    <div >
        <div >
            <h3 >
                <div align="left"><b>Панель администратора:</b> </div>
                <div align="right" ><a href="allServices"class="button">  Наши услуги  </a></div> <br>
                <div align="right" ><a href="adManage" class="button">Объявления</a></div> <br>
                <div align="right" ><a href="questionManage" class="button">  Вопросы</a></div><br>

            </h3>
        </div>
        <div >
            <c:if test="${empty services}">
                Услуги пока не заказаны ;)
            </c:if>
            <c:if test="${not empty services}">
                <div align="right" > <a id="toggler" href="#" class="button">Статистика</a></div><br>
                <div id="box" style="display: none;">
                    <img src="../../img/pieChart.png" usemap="#chart" alt=""/>
                </div>

                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>Пользователь</th>
                        <th>Название</th>
                        <th>Стоимость</th>
                        <th>Дата</th>
                        <th>Время</th>
                        <th>Статус</th>
                        <th>Операция</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${services}" var="s">
                        <tr>
                            <th><c:out value="${s.login}"/></th>
                            <th><c:out value="${s.name}"/></th>
                            <th><c:out value="${s.cost}"/></th>
                            <th><c:out value="${s.date}"/></th>
                            <th><c:out value="${s.time}"/></th>
                            <c:if test="${s.idDoctor != 0}">
                                <th><c:out value="Подтверждено"/></th>
                                <th><a href="<c:url value='/deleteService/${s.idService}'/>">Удалить</a></th>
                            </c:if>
                            <c:if test="${s.idDoctor == 0}">
                                <th><c:out value="В обработке"/></th>
                                <th><a href="<c:url value='/acceptService/${s.idService}'/>">Подтвердить</a></th>
                            </c:if>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</div>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>

</body>
</html>