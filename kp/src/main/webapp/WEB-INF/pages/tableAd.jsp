<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table ads</title>
    <link rel="stylesheet" type="text/css" href="../../css/tableAd.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
</head>
<body>
<a href="autorization" class="button" >Разместить объявление</a>
<br><br>
<c:if test="${adList.size()==3}">
<div class="container">
    <div class="row">

        <div class="column1">
            <p>
            <c:out value="${adList.get(0).textAd}"/></p>
        </div>
        <div class="column2">
            <p><c:out value="${adList.get(1).textAd}"/></p>
        </div>
        <div class="column3">
            <p><c:out value="${adList.get(2).textAd}"/></p>
        </div>

    </div>
</div>
</c:if>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>
