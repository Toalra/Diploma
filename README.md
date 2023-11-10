<h1>Автотестирование сайта tutu.ru <img src="https://github.com/Toalra/Diploma/blob/master/src/test/resources/logoTutu.png" wight="35" height="35"/> </h1>
<h2>Содержание</h2>
<li><a href="#-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%81%D1%82%D1%80%D1%83%D0%BC%D0%B5%D0%BD%D1%82%D1%8B">Использованные инструменты</a></li>
<li><a href="#-%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B8">Реализованные проверки</a></li>
<li><a href="#%EF%B8%8F-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D0%B0%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2">Запуск автотестов</a></li>
<li><a href="#--%D1%81%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D0%B2-jenkins">Сборка в Jenkins</a></li>
<li><a href="#--%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D1%81-allure-testops-">Интеграция с Allure TestOps</a></li>
<li><a href="#--%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D1%81-jira">Интеграция с Jira</a></li>
<li><a href="#--%D0%BA%D1%80%D0%B0%D1%82%D0%BA%D0%B8%D0%B9-%D0%BE%D1%82%D1%87%D0%B5%D1%82-%D0%B2-telegram">Краткий отчет в Telegram</a></li>
<li><a href="#%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE--%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80%D0%BE%D0%BC-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA%D0%B0">Видео  примером запуска</a></li>

<h2 tabindex="-1" id="user-content-computer-использованный-стек-технологий" dir="auto">💻 Использованные инструменты</h2>
  <a class="heading-link" href="#computer-использованный-стек-технологий"></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/AllureTestOps.svg"><img  src="https://github.com/Toalra/Diploma/blob/master/media/logs/AllureTestOps.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Allure_Report.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Allure_Report.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/GitHub.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/GitHub.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Gradle.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Gradle.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Intelij_IDEA.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Intelij_IDEA.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/JUnit5.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/JUnit5.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Java.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Java.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Jenkins.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Jenkins.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Selenide.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Selenide.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Selenoid.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Selenoid.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Telegram.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Telegram.svg" wight="40" height="40"/></a>
<a target="_blank" rel="noopener noreferrer" href="https://github.com/Toalra/Diploma/blob/master/media/logs/Jira.svg"><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Jira.svg" wight="40" height="40"/></a>

* Проект автотестов для компаниия Dats Team написан на языке `Java` с применением фреймворка для автотестирования `Selenide` и `JUnit 5`.
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

* 

<h2>▶️ Запуск автотестов</h2>
<h3>Запуск автотестов из терминала</h3>
При выполнении команды в терминале IntelliJ IDEA, тесты запустятся в удаленном браузере в `Selenoid`

```
gradle clean diploma_test
```

<h3>Запуск тестов на удаленном барузере</h3>
Автотеты можно запустить также в терминале на удаленном браузере

```
gradle clean test -Denv=main
```

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

<h2><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Jenkins.svg" wight="30" height="30"/><a>Сборка в </a>
  <a href="https://jenkins.autotests.cloud/job/dats.team_autotesting_tokareva_aliya"> Jenkins</a></h2>
<a title="jenkinsReport"><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/jenkinsReport.png" wight="500" height="500"/></a>
<h3><a>Overwies в </a>
<a href="https://jenkins.autotests.cloud/job/dats.team_autotesting_tokareva_aliya/43/allure/">Allure Report</a></h3>
<a href=""><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/resultAllure.png" wight="500" height="450"/></a>

<h3>Результат выполнения теста</h3>
<a title="allureResults"><img  src="https://github.com/Toalra/Diploma/blob/master/media/results/jenkinsAllure_diploma_fail.png" wight=800" height="300"/></a>

В случае, если тест упал, то в `Jenkins Allure` сразу отобразится код ошибки, видео падения теста в интерфейсе, последний скриншот, Page source и другие attachmends

<h2><img  src="https://github.com/Toalra/Diploma/blob/master/media/logs/AllureTestOps.svg" wight="30" height="30"/><a>Интеграция с </a>
  <a href="https://allure.autotests.cloud/launch/30429/tree/485930?treeId=0">Allure TestOps </a></h2>

Сборка имеет интеграцию `Jenkins` с `Allure TestOps`. Результат выполнения автотестов отображается в `Allure TestOps` на `Dashboard` в `Allure TestOps` отображена статистика пройденных тестов.
<img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/testOpsReults.png" wight="900" height="550"/>


<h2><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Jira.svg" wight="30" height="30"/><a>Интеграция</a>
  <a href="https://github.com/Toalra/Diploma/blob/master/media/results/jira_diploma.png">с Jira</a></h2>

Выполнена интеграция `Allure TestOps` с `Jira`, в тикете отображается список автотестов и результаты их прогода.
<img  src="https://github.com/Toalra/Diploma/blob/master/media/results/testOps_diploma.png" wight="900" height="500"/>

<h2><img src="https://github.com/Toalra/Diploma/blob/master/media/logs/Telegram.svg" wight="30" height="30"/>  Краткий отчет в Telegram</h2>

После прогона их `Jenkins` в `Telegram` отправляется уведомление с кратким отчетом результатов пройденного тестирования.
<a><img  src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/results/tgResults.png" wight="500" height="500"/></a>

<h2><img src="https://github.com/Toalra/DatsTeam_autotesting_tokareva_aliya/blob/master/media/logs/Selenoid.svg" wight="30" height="30"/>Видео  примером запуска</h2>

С помощью видео в `Allure Jenkins` можно увидеть прохождение автотеста 
<img  src="https://github.com/Toalra/Diploma/blob/master/media/video/searchChildTickets.gif" wight="500" height="500"/>
<img  src="https://github.com/Toalra/Diploma/blob/master/media/video/searchTicketWithFlight.gif" wight="500" height="500"/>
