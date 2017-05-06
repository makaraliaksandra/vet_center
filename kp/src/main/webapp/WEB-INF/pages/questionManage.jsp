<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="false"%>
<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/table.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>
    <script type="text/javascript" src="../../js/sort.js"></script>

</head>
<body>
<form action="searchServicetoAddtoBD">
    <div class="d7">
        <input type="text" name="searchName" placeholder="Искать здесь...">
        <button type="submit"></button>
    </div>
</form>
<br>
<h1>Все вопросы пользователей</h1>
<c:if test="${empty queList}">
    Вопросов в базе нет ;)
</c:if>
<c:if test="${not empty queList}">
<table bgcolor="white" id="keywords" cellspacing="0" cellpadding="0">
    <thead>
    <tr>
        <th><span>Пользователь</span></th>
        <th colspan="2"><span>Вопрос</span></th>
        <th colspan="2"><span>Ответ</span></th>
        <th><span>Действие</span></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${queList}" var="s">
        <tr>
            <th class="lalign"><c:out value="${s.login}"/></th>
            <td colspan="2"><c:out value="${s.textQuestion}"/></td>
            <c:if test="${empty s.answer}">
                <th colspan="2"><c:out value="-"/></th>
            </c:if>
            <c:if test="${not empty s.answer}">
                <th colspan="2"><c:out value="${s.answer}"/></th>
            </c:if>
            <c:if test="${s.status != 0}">
                <th><a href="<c:url value='/answer/${s.idQuestion}'/>">Изменить ответ</a></th>
            </c:if>
            <c:if test="${s.status == 0}">
                <th><a href="<c:url value='/answer/${s.idQuestion}'/>">Ответить</a></th>
            </c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>
</c:if>
<br>
<a href="bdServiceForm">Услуги</a>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>