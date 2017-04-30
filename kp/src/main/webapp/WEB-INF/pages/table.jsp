<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ветеринарный центр</title>
    <link rel="stylesheet" type="text/css" href="../../css/table.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.2/js/jquery.dataTables.js"></script>

    <script src="app.js"></script>
</head>
<body>
<div class="wrap">
<div class="table">
<ul>

<li>
  <div class="top">
    <h1>STARTER</h1>
    <div class="circle">$19</div>
  </div>
  <div class="bottom">
    <p><span>5</span> users</p>
    <p><span>10</span> projects</p>
    <p><span>10GB</span> amount of space</p>
    <p><span>5</span> e-mail accounts</p>
  </div>
</li>

<li>
  <div class="top">
    <h1>BASIC</h1>
    <div class="circle">$29</div>
  </div>
    <div class="bottom">
    <p><span>10</span> users</p>
    <p><span>50</span> projects</p>
    <p><span>50GB</span> amount of space</p>
    <p><span>10</span> e-mail accounts</p>
  </div>
</li>

<li>
  <div class="top">
    <h1>PRO</h1>
    <div class="circle pink">$49</div>
  </div>
    <div class="bottom">
    <p><span>100</span> users</p>
    <p><span>Unlimited</span> projects</p>
    <p><span>1TB</span> amount of space</p>
    <p><span>100</span> e-mail accounts</p>
  </div>
</li>

<li>
  <div class="top">
    <h1>ULTRA</h1>
    <div class="circle">$99</div>
  </div>
    <div class="bottom">
    <p><span>Unlimited</span> users</p>
    <p><span>Unlimited</span> projects</p>
    <p><span>Unlimited</span> amount of space</p>
    <p><span>Unlimited</span> e-mail accounts</p>
  </div>
</li>
</ul>
</div>
</div>

 <div id="wrapper">
  <h1>Sortable Table of Search Queries</h1>

  <table id="keywords" cellspacing="0" cellpadding="0">
    <thead>
      <tr>
        <th><span>Keywords</span></th>
        <th><span>Impressions</span></th>
        <th><span>Clicks</span></th>
        <th><span>CTR</span></th>
        <th><span>Rank</span></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td class="lalign">silly tshirts</td>
        <td>6,000</td>
        <td>110</td>
        <td>1.8%</td>
        <td>22.2</td>
      </tr>
      <tr>
        <td class="lalign">desktop workspace photos</td>
        <td>2,200</td>
        <td>500</td>
        <td>22%</td>
        <td>8.9</td>
      </tr>
      <tr>
        <td class="lalign">arrested development quotes</td>
        <td>13,500</td>
        <td>900</td>
        <td>6.7%</td>
        <td>12.0</td>
      </tr>
      <tr>
        <td class="lalign">popular web series</td>
        <td>8,700</td>
        <td>350</td>
        <td>4%</td>
        <td>7.0</td>
      </tr>
      <tr>
        <td class="lalign">2013 webapps</td>
        <td>9,900</td>
        <td>460</td>
        <td>4.6%</td>
        <td>11.5</td>
      </tr>
      <tr>
        <td class="lalign">ring bananaphone</td>
        <td>10,500</td>
        <td>748</td>
        <td>7.1%</td>
        <td>17.3</td>
      </tr>
    </tbody>
  </table>
 </div>


</body>
</html>