package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class SettlementSystemsTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка заголовка на главной странице")
    void checkTitle() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.openMainPage();
        });

        step("Проверить заголовок", () -> {
            mainPage.textHeadings("Пионеры в своём деле");
        });
    }

    @Test
    @DisplayName("Переключение кнопок в шапке сайта")
    void homePage() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.openMainPage();
        });

        step("Нажать Проекты", () -> {
            mainPage.mainProjects();
        });

        step("Нажать - Контакты", () -> {
            mainPage.mainContacts();
        });

        step("Нажать - Вакансии", () -> {
            mainPage.mainVacancy();
        });

        step("Нажать - Решения", () -> {
            mainPage.mainDecisions();
        });

        step("проверить текс", () -> {
            mainPage.textSearch("Расчетные системы");
        });
    }

    @Test
    @DisplayName("На вкладке Проекты проверить кнопку Offline")
    void projectsOfflineName() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.openMainPage();
        });

        step("Перейти на вкладку Проекты", () -> {
            mainPage.mainProjects();
        });

        step("Нажать кнопку Offline", () -> {
            mainPage.offlineClick();
        });

        step("Проверить название Offline проекта", () -> {
            mainPage.projectsOfflineName("Система оплаты штрафов ГИБДД в «АРМ сотрудника ДПС»");
        });
    }

    @Test
    @DisplayName("Проверка адреса на вкладке Контакты")
    void address() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.openMainPage();
        });

        step("Нажать - Контакты", () -> {
            mainPage.mainContacts();
        });

        step("Проверить адрес", () -> {
            mainPage.address("ул. Радищева, д.39, офис 402");;
        });
    }

    @Test
    @DisplayName("Проверка появления поп-апа Напишите нам")
    void popUp() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.openMainPage();
        });

        step("Нажать - Вакансии", () -> {
            mainPage.mainVacancy();
        });

        step("Нажать отправить резюме", () -> {
            mainPage.resumeButton();
        });

        step("Проверка появления поп-апа Напишите нам", () -> {
            mainPage.checkText("Напишите нам");
        });
    }
}
