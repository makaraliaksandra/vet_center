<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="false"%>
<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/table.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>
    <script type="text/javascript" src="../../js/sort.js"></script>

</head>
<body>

    <div class="d7">
        <input type="text" name="searchName" placeholder="Искать здесь...">
        <button type="submit"></button>
    </div>

<br>
    <h1>Все предоставляемые услуги</h1>

    <table bgcolor="white" id="keywords" cellspacing="0" cellpadding="0">
        <thead>
        <tr>
            <th><span>Название</span></th>
            <th colspan="2"><span>Описание</span></th>
            <th><span>Стоимость</span></th>
            <th><span>Скидка</span></th>
            <th><span>Итоговая цена</span></th>
            <th><span>Новая скидка</span></th>
            <th><span>Добавить скидку</span></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${servList}" var="s">
            <tr>
                <th class="lalign"><c:out value="${s.name}"/></th>
                <td colspan="2"><c:out value="${s.description}"/></td>
                <th><c:out value="${s.cost}"/></th>
                <th><c:out value="${s.sale}"/></th>
                <th><c:out value="${s.cost-(s.sale/100)*s.cost}"/></th>
                <th><input type="text" placeholder="5%" name="newSale"/></th>
                <th><a href="<c:url value='/makeSale/${s.name}'/>">Изменить</a></th>
            </tr>
        </c:forEach>
        </tbody>
    </table>

<br>
<a href="bdServiceForm" class="button">Добавить</a>
<br><br><br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>