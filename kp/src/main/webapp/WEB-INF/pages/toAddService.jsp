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
<form action="searchServicetoAdd">
    <div class="d7">
        <input type="text" name="searchName" placeholder="Искать здесь...">
        <button type="submit"></button>
    </div>
</form>
<br>
<div id="wrapper">
    <h1>Выберите необходимую услугу</h1>

    <table id="keywords" cellspacing="0" cellpadding="0">
        <thead>
        <tr>
            <th><span>Название</span></th>
            <th colspan="2"><span>Описание</span></th>
            <th><span>Стоимость</span></th>
            <th><span>Скидка</span></th>
            <th><span>Выбор</span></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${servList}" var="s">
            <tr>
                <th class="lalign"><c:out value="${s.name}"/></th>
                <td colspan="2"><c:out value="${s.description}"/></td>
                <th><c:out value="${s.cost}"/></th>
                <th><c:out value="${s.sale}"/></th>
                <th><a href="<c:url value='/makeChoice/${s.name}'/>">Заказать</a></th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>