<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>VetProfi</title>
    <meta charset="utf-8">

    <link rel="stylesheet" type="text/css" href="../../css/reset.css">
    <link rel="stylesheet" type="text/css" href="../../css/animate.css">
    <link rel="stylesheet" type="text/css" href="../../css/main.css">

    <script type="text/javascript" src="../../js/jquery.js"></script>
    <script type="text/javascript" src="../../js/slider.js"></script>
    <script type="text/javascript" src="../../js/wow.js"></script>
    <script type="text/javascript" src="../../js/main.js"></script>
</head>
<body>

<header>
    <div class="container">

        <!-- <a href="#" class="logo">
           <img src="img/logo.png" alt="Heros"/>
         </a> -->

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


<section class="slider_wrapper">

    <div id="slides">

        <div class="slide">
            <img src="../../img/pic_3.jpg" alt=""/>
            <h3 class="caption">Забота</h3>
        </div>

        <div class="slide">
            <img src="../../img/pic_1.jpg" alt=""/>
            <h3 class="caption">Ветеринарные услуги</h3>
        </div>

        <div class="slide">
            <img src="../../img/pic_2.jpg" alt=""/>
            <h3 class="caption">Всё для здоровья</h3>
        </div>

    </div>

</section>

<section class="services container clearfix">

    <div class="section_title animated wow fadeInUp">
        <h2>Любителям животных</h2>
    </div>

    <div class="services_list">
        <ul>
            <li class="animated wow fadeInRight" data-wow-delay=".2s">
                <h3>Почему у кошки депрессия?</h3>
                <p>Ваша кошка перестала радоваться жизни? Она угрюма и задумчива? Решение простое, ...</p>
                <a href="#">читать далее<span class="arrow">&rarr;</span></a>
            </li>
            <li class="animated wow fadeInRight" data-wow-delay=".3s">
                <h3>100 причин завести собаку</h3>
                <p>Собачки-милашки, особенно большие, хочу собаку, купите мне пса.</p>
                <a href="#">читать далее<span class="arrow">&rarr;</span></a>
            </li>
            <li class="animated wow fadeInRight" data-wow-delay=".4s">
                <h3>Как уговорить парня завести животное</h3>
                <p>Все очень очень сложно</p>
                <a href="#">читать далее<span class="arrow">&rarr;</span></a>
            </li>
        </ul>
    </div>

</section><

<section class="projects container clearfix">

    <div class="section_title animated wow fadeInUp">
        <h2>Отзывы клиентов</h2>
        <a href="" class="details">Все отзывы<span class="arrow">&rarr;</span></a>
    </div>

    <div class="projects_list clearfix">
        <ul>
            <li class="animated wow fadeInRight" data-wow-delay=".2s">
                <a href="../../img/1client.jpg"> <span class="p_logo1"></span> </a>
            </li>
            <li class="animated wow fadeInRight" data-wow-delay=".3s">
                <a href="../../img/2client.jpg"> <span class="p_logo2"></span> </a>
            </li>
        </ul>
    </div>

</section>

<section class="clients container">

    <div class="section_title animated wow fadeInUp">
        <h2>Наша команда</h2>
    </div>

    <div class="client_list clearfix">
        <ul>
            <li class="animated wow fadeInRight" data-wow-delay=".2s">
                <img src="../../img/vet1.jpg" width="141" height="90" alt="Client 1" />
            </li>
            <li class="animated wow fadeInRight" data-wow-delay=".3s">
                <img src="../../img/vet2.jpg" width="141" height="90" alt="Client 1" />
            </li>
            <li class="animated wow fadeInRight" data-wow-delay=".4s">
                <img src="../../img/vet3.jpg" width="141" height="90" alt="Client 1" />
            </li>
            <li class="animated wow fadeInRight" data-wow-delay=".5s">
                <img src="../../img/vet4.jpg" width="141" height="90" alt="Client 1" />
            </li>
        </ul>
    </div>

</section>

<!--<section class="cta">
  <div class="container animated wow fadeInUp">

    <h3 class="cta_title">Ready To Start Your Project?</h3>
    <a href="#" class="cta_button">yes we are ready &rarr;</a>

  </div>
</section> end cta(call to action) -->

<footer class="clearfix">
    <div class="container">

        <div class="copyright animated wow fadeInUp">
            <p>© 2017 copyright </p>
        </div>

        <div class="footer_links">

            <div class="sm columns animated wow fadeInRight" data-wow-delay=".2s">
                <h3 class="columns_title">Находите нас в</h3>
                <ul>
                    <li>
                        <a class="facebook" href="#">Facebook</a>
                    </li>
                    <li>
                        <a class="twitter" href="#">Twitter</a>
                    </li>
                    <li>
                        <a class="google" href="#">Google Plus</a>
                    </li>
                </ul>
            </div>


        </div>

    </div>

</footer>

</body>
</html>