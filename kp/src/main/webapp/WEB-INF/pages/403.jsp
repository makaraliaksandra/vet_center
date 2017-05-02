<%@ page contentType="text/html;charset=UTF-8" language="java" session="false"%>
<html>
<head>
    <title>Access Denied</title>
    <link rel="stylesheet" type="text/css" href="../../css/style.css">
</head>
<body>
<br><br>
<h3 align="center" style="color:red;">${message}</h3>
<br>
<form action="index" >
    <div class="cat">
        <img src="../../img/error403.jpg" alt="Жулик, не жульничай!"/>
        <br><br>
        <input class="button" type="submit" value="Вернуться на главную"/>
    </div>
</form>
</body>
</html>