<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Личный кабинет</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <style type="text/css">
        .myrow-container {
            margin: 20px;
        }
    </style>
</head>
<body class=".container-fluid">
<div class="container myrow-container">
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Ваши заказы:</b> </div>
                <div align="right"><a href="service">Заказ услуги</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty services}">
                Услуги пока не заказаны ;)
            </c:if>
            <c:if test="${not empty services}">

                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>Id</th>
                        <th>Название</th>
                        <th>Стоимость</th>
                        <th>Дата</th>
                        <th>Время</th>
                        <th>Доктор</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${services}" var="s">
                        <tr>
                            <th><c:out value="${s.id_service}"/></th>
                            <th><c:out value="${s.name}"/></th>
                            <th><c:out value="${s.cost}"/></th>
                            <th><c:out value="${s.date}"/></th>
                            <th><c:out value="${s.time}"/></th>
                            <th><c:out value="${s.id_doctor}"/></th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>