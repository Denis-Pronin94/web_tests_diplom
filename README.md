## Тестирование UI сайта компании "Расчетные системы"
#### российский разработчик и интегратор, входит в Группу Т1
> <a target="_blank" href="https://tprs.ru/">Ссылка на главную страницу сайта</a>


###  Содержание:

- [Технологии и инструменты](#techno-технологии-и-инструменты)
- [Реализованные проверки](#control-Реализованные-проверки)
- [Сборка в Jenkins](#jenkins-Jenkins-job)
- [Запуск из терминала](#terminal-Запуск-тестов-из-терминала)
- [Allure отчет](#report-Allure-отчет)
- [Отчет в Telegram](#telegram-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

<a name="techno-технологии-и-инструменты"></a>
###  Технологический стек

<p align="center">
<img width="8%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="8%" title="Java" src="images/logo/Java.svg">
<img width="8%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="8%" title="Selenide" src="images/logo/Selenide.svg">
<img width="8%" title="Gradle" src="images/logo/Gradle.svg">
<img width="8%" title="GitHub" src="images/logo/GitHub.svg">
<img width="8%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="8%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="8%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="8%" title="Telegram" src="images/logo/Telegram.svg">
</p>

```mermaid        
    stateDiagram-v2
        State1: START
        State2: Java & IntelliJ IDEA
        State3: Selenide & JUnit5
        State4: Gradle
        State5: GitHub
        State6: Jenkins
        State7: Selenoid
        State8: Allure Report
        State9: Telegram
        State10: STOP
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State7 --> State8
        State8 --> State9
        State9 --> State10
        note right of State2 : Работа с кодом
        note left of State3 : Фреймворки
        note right of State4 : Сборка проекта
        note left of State5 : Система контроля версий и хостинг проекта
        note right of State6 : Параметризация и запуск сборки
        note left of State7 : Контейнеризация
        note right of State8 : Отчётность
        note left of State9 : Уведомления
```

<a name="control-Реализованные-проверки"></a>
###  Список проверок, реализованных в автотестах
- [x] Проверка заголовка на главной странице
- [x] Переключение кнопок в шапке сайта
- [x] На вкладке "Проекты" проверка кнопки "Offline"
- [x] Проверка адреса на вкладке "Контакты"
- [x] Проверка появления поп-апа "Напишите нам"

<a name="jenkins-Jenkins-job"></a>
###   Сборка в Jenkins
### <img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/Test-vacancy/)
*Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать с параметрами*</strong></code> и указать значения параметров.*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="900">
</p>

### Удаленный запуск тестов

```bash
gradle clean test 
-Dbrowser=${BROWSER} 
-DbrowserVersion=${BROWSER_VERSION} 
-DbrowserSize=${BROWSER_SIZE} 
-DselenoidServer=${SELENOID_SERVER}
```

### Параметры сборки

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
>
> <code>BROWSER_SIZE</code> – разрешени окна браузера, в котором будут выполняться тесты.
>
> <code>SELENOID_SERVER</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>

<a name="terminal-Запуск-тестов-из-терминала"></a>
### :terminal: Запуск из терминала
```bash
gradle clean test
```

<a name="report-Allure-отчет"></a>
### :report:  Allure Reports отчет
### <img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/Test-vacancy/)
<p align="center">
  <img src="images/screens/AllureTestOps.png" alt="job" width="900">
</p>

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="job" width="900">
</p>

<a name="telegram-Уведомление-в-Telegram-при-помощи-бота"></a>
### :telegram: Отчет в Telegram

<p align="center">
  <img src="images/screens/telegram.png" alt="job" width="600">
</p>

<a name="earth_africa-Примеры-видео-о-прохождении-тестов"></a>
### Видео прохождения тестов

> К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/screens/tprs.gif" >
</p>


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>