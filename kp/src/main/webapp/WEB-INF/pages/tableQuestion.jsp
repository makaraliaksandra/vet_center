<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table questions</title>
    <link rel="stylesheet" type="text/css" href="../../css/tableQuestion.css">
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
    <link rel="stylesheet" type="text/css" href="../../css/main.css">
</head>
<body>
<header>
    <div class="container">
        <nav>
            <ul>
                <li>
                    <form action="//google.com/search" target="_blank">
                        <input name="q" />
                        <input type="image" src="//google.com/favicon.ico" />
                    </form>
                </li>
                <li><a href="table">Услуги</a></li>
                <li><a href="tableAd">Объявления</a></li>
                <li><a href="tableQuestion">Вопросы</a></li>
                <li><a href="autorization">Личный кабинет</a></li>
                <li><a href="service">Заказ услуги</a></li>
            </ul>
        </nav>

    </div>
</header>

<a href="autorization"class="button" >Задать вопрос</a>
<br><br>
<div class="forums">


    <table cellspacing="0">
        <thead>
        <tr>
            <th scope="col" class="name">Вопрос</th>
            <th scope="col">Ответ</th>
            <th scope="col">Вопрос задан</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${questionList}" var="q">
            <tr>
                <th><c:out value="${q.textQuestion}"/></th>
                <th><c:out value="${q.answer}"/></th>
                <th><c:out value="${q.login}"/></th>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</div>
<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
</body>
</html>
