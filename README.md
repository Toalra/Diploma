<h1><a>Автотестирование сайта</a><a href="https://www.tutu.ru/"> tutu.ru </a><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/logoTutu.png" wight="35" height="35"/> </h1>
<h2>Содержание</h2>
<li><a href="#-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B">Использованные инструменты</a></li>
<li><a href="#-%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B8">Реализованные проверки</a></li>
<li><a href="#%EF%B8%8F-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D0%B0%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2">Запуск автотестов</a></li>
<li><a href="#%D1%81%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D0%B2-jenkins-">Сборка в Jenkins</a></li>
<li><a href="#%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D1%81---allure-testops-">Интеграция с Allure TestOps</a></li>
<li><a href="#%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D1%8F--%D1%81-jira">Интеграция с Jira</a></li>
<li><a href="#--%D0%BA%D1%80%D0%B0%D1%82%D0%BA%D0%B8%D0%B9-%D0%BE%D1%82%D1%87%D0%B5%D1%82-%D0%B2-telegram">Краткий отчет в Telegram</a></li>
<li><a href="#%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE--%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80%D0%BE%D0%BC-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA%D0%B0">Видео  примером запуска</a></li>

<h2 tabindex="-1" id="user-content-computer-использованный-стек-технологий" dir="auto">💻 Использованные инструменты</h2>
  <a class="heading-link" href="#computer-использованный-стек-технологий"></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/AllureTestOps.svg"><img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/AllureTestOps.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Allure_Report.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Allure_Report.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/GitHub.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/GitHub.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Gradle.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Gradle.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Intelij_IDEA.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Intelij_IDEA.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/JUnit5.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/JUnit5.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Java.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Java.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Jenkins.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Jenkins.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Selenide.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Selenide.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Selenoid.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Selenoid.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Telegram.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Telegram.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Jira.svg"><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Jira.svg" wight="40" height="40"/></a>

* Проект автотестов для компании Tutu написан на языке `Java` с применением фреймворка для автотестирования `Selenide` и `JUnit 5`.
* В качестве сборщика проекта использовался `Gradle`.
* Удаленный запуск происходит в docker-контейнерах на базе `Selenoid`.
* Для реадизации удаленного запуска применялся `Jenkins` с формированием отчета в `Allure`.
* Краткие отчеты с результатами тестирования отправлятся в `Telegram` с использованием бота.
* Применена интеграция с `Allure TestOps` и `Jira`

В отчет `Allure` входит:
* Описанные шаги тестов;
* Скриншот страницы результата на последнем шаге;
* Page Source;
* Логи консоли браузера;
* Видео с выполнением автотеста.

<h2>🏁 Реализованные проверки</h2>

* Проверка найденных билетов на самолет за указанный промежуток времени
* Проверка билетов на самолет с перелетом
* Проверка билетов на самолет с городами из примера
* Проверка поиска билета на поезд
* Проверка билетов на поезд из примера
* Проверка найденных билетов на автобус
* Проверка найденных билетов на автобус из примера

<h2>▶️ Запуск автотестов</h2>
<h3>Запуск автотестов из терминала</h3>
При выполнении команды в терминале IntelliJ IDEA, тесты запустятся в удаленном браузере в `Selenoid`

```
gradle clean diploma_test
```

<h3>Запуск тестов на удаленном браузере</h3>
Запуск автотестов при переопределенных параметров запуска

```
clean
main -DremoteUrl=${SELENOID_URL}
-DbaseUrl=${BASE_URL}
-DbrowserSize=${BROWSER_SIZE}
-Dbrowser=${BROWSER_NAME}
-Dbrowser_version="${BROWSER_VERSION}"
```

Запуск автотестов с использованием уведомления в `Telegram`

```
java "-DconfigFile=notifications/config.json" -jar notifications/allure-notifications-4.3.0.jar
```

<h3>Параметры сборок</h3>

* `BROWSER_NAME` – браузер для выполнения автотестов. По-умолчанию - chrome.
* `BROWSER_VERSION` – версия браузера для выполнения автотестов. По-умолчанию - 100.0.
* `BROWSER_SIZE` – размер окна браузера. По-умолчанию - 1920x1200.
* `BASE_URL` – web-адрес тестируемого приложения.
* `REMOTE_BROWSER_URL`  – адрес удаленного сервера для запуска автотестов.

<h2><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Jenkins.svg" wight="30" height="30"/><a>Сборка в </a><a href="https://jenkins.autotests.cloud/job/diploma_tokareva">Jenkins </a></h2>
<a title="jenkinsReport"><img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/results/jenkinsCommonResults.png" style="max-width: 100%;"/></a>
<h3><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Allure_Report.svg" wight="30" height="30"/> <a>Отчет</a><a href="https://jenkins.autotests.cloud/job/diploma_tokareva/39/allure/"> в Allure</a></h3>
<a href=""><img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/results/jenkinsAllure_diploma.png" style="max-width: 100%;"/></a>

<h3><a href="https://jenkins.autotests.cloud/job/diploma_tokareva/39/allure/#suites">Результат выполнения теста</a></h3>
<a title="allureResults"><img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/results/jenkinsAllure_diploma_pased.png" wight=700" height="500"/></a>

<h2><img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/AllureTestOps.svg" wight="30" height="30"/><a>Интеграция с </a>
  <a href="https://allure.autotests.cloud/launch/31814">Allure TestOps </a></h2>

Сборка имеет интеграцию `Jenkins` с `Allure TestOps`. Результат выполнения автотестов отображается в `Allure TestOps` на `Dashboard` в `Allure TestOps` отображена статистика пройденных тестов.
<img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/results/testOpsStatistics.png" style="max-width: 100%;"/>

<h2><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Jira.svg" wight="30" height="30"/><a>Интеграция</a>
  <a href="https://jira.autotests.cloud/browse/HOMEWORK-947">с Jira</a></h2>

Выполнена интеграция `Allure TestOps` с `Jira`, в тикете отображается список автотестов и результаты их прогона.
<img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/results/jira_diploma.png" style="max-width: 100%;"/>

<h2><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Telegram.svg" wight="30" height="30"/>  Краткий отчет в Telegram</h2>

После прогона их `Jenkins` в `Telegram` отправляется уведомление с кратким отчетом результатов пройденного тестирования.
<a><img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/results/telegramResults.png" style="max-width: 100%;"/></a>

<h2><img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/logs/Selenoid.svg" wight="30" height="30"/>Видео  примером запуска</h2>

С помощью видео в `Allure Jenkins` можно увидеть прохождение автотеста 
<img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/video/searchTicketOnTrain.gif" style="max-width: 100%;"/>
<img  src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/media/video/searchTicketWithFlight.gif" style="max-width: 100%;"/>
