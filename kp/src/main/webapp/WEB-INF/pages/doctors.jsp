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
    <h1>Назначение врача и времени операции</h1>

    <table id="keywords" cellspacing="0" cellpadding="0">
        <thead>
        <tr>
            <th><span>Фамилия</span></th>
            <th colspan="2"><span>Должность</span></th>
            <th><span>Место</span></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${doctors}" var="s">
            <tr>
                <th class="lalign"><c:out value="${s.surname}"/>
                    <c:out value="${s.initials}"/></th>
                <td colspan="2"><c:out value="${s.position}"/></td>
                <th>
                    <input type="time" modelattribute="time" id="time" name="time" placeholder="hh:mm"/>
                </th>
                <th><a href="<c:url value='/doctorChoice/${s.idDoctor}'/>">Назначить</a></th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>