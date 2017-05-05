<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Ветеринарный центр</title>
  <link rel="stylesheet" type="text/css" href="../../css/table.css">
  <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>
  <script type="text/javascript" src="../../js/sort.js"></script>

</head>
<body>
<form action="searchService">
  <div class="d7">
    <input type="text" name="searchName" placeholder="Искать здесь...">
    <button type="submit"></button>
  </div>
</form>
<br>
<div class="wrap">
  <div class="table">
    <ul>

      <li>
        <div class="top">
          <h1>Осмотр</h1>
          <div class="circle">$19</div>
        </div>
        <br>
        <div class="bottom">
          <p><span>5</span> users</p>
          <p><span>10</span> projects</p>
          <p><span>10GB</span> amount of space</p>
          <p><span>5</span> e-mail accounts</p>
          <br>
          <img src="../../img/osmotr.jpg" width="165" height="115" alt="Client 1" />
        </div>
      </li>

      <li>
        <div class="top">
          <h1>Прививка</h1>
          <div class="circle">$29</div>
        </div>
        <br>
        <div class="bottom">
          <p><span>10</span> users</p>
          <p><span>50</span> projects</p>
          <p><span>50GB</span> amount of space</p>
          <p><span>10</span> e-mail accounts</p>
          <br>
          <img src="../../img/priv.jpg" width="165" height="115" alt="Client 1" />
        </div>
      </li>

      <li>
        <div class="top">
          <h1>Груминг</h1>
          <div class="circle pink">$49</div>
        </div>
        <br>
        <div class="bottom">
          <p><span>100</span> users</p>
          <p><span>Unlimited</span> projects</p>
          <p><span>1TB</span> amount of space</p>
          <p><span>100</span> e-mail accounts</p>
          <br>
          <img src="../../img/groom.jpg" width="165" height="115" alt="Client 1" />
        </div>
      </li>

      <li>
        <div class="top">
          <h1>Массаж</h1>
          <div class="circle">$99</div>
        </div>
        <br>
        <div class="bottom">
          <p><span>Unlimited</span> users</p>
          <p><span>Unlimited</span> projects</p>
          <p><span>Unlimited</span> amount of space</p>
          <p><span>Unlimited</span> e-mail accounts</p>
          <br>
          <img src="../../img/massag.jpg" width="165" height="115" alt="Client 1" />
        </div>
      </li>
    </ul>
  </div>
</div>
<br><br>
<div id="wrapper">
  <h1>Услуги ветеринарного центра</h1>

  <table id="keywords" cellspacing="0" cellpadding="0">
    <thead>
    <tr>
      <th><span>Название</span></th>
      <th colspan="2"><span>Описание</span></th>
      <th><span>Стоимость</span></th>
      <th><span>Скидка</span></th>
      <th><span>Итоговая стоимость</span></th>
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
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

<br>
<a href="index">Вернуться назад<span class="arrow">&rarr;</span></a>
<br><br><br>
</body>
</html>