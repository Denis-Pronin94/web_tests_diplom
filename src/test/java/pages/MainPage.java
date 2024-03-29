package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private SelenideElement
            textHeading = $(".timeline__title"),
            textSearch = $(".page-header__logo"),
            mainProjects = $(".main-nav").$(byText("Проекты")),
            mainContacts = $(".main-nav").$(byText("Контакты")),
            mainVacancy = $(".main-nav").$(byText("Вакансии")),
            mainDecisions = $(".main-nav").$(byText("Решения")),
            offlineClick = $(".projects__tabs-button--offline"),
            address = $(".contacts__address"),
            projectsOfflineName = $(".projects__item--gibdd"),
            resumeRutton = $(".vacancies__search-button"),
            checkText = $(".modal__title");

    public void openMainPage() {
        open("https://tprs.ru");
        textSearch.shouldHave(text("Расчетные системы"));
    }

    public void checkHeader(String text) {
        textHeading.shouldHave(text(text));
    }

    public void openMainProjects() {
        mainProjects.click();
    }

    public void clickMainContacts() {
        mainContacts.click();
    }

    public void clickMainVacancy() {
        mainVacancy.click();
    }

    public void clickMainDecisions() {
        mainDecisions.click();
    }

    public void checkHeader1(String text) {
        textSearch.shouldHave(text(text));
    }

    public void clickOfflineClick() {
        offlineClick.click();
    }

    public void checkProjectsOfflineName(String text) {
        projectsOfflineName.shouldHave(text(text));
    }

    public void checkAddress(String text) {
        address.shouldHave(text(text));
    }

    public void clickResumeButton() {
        resumeRutton.click();
    }

    public void checkText(String text) {
        checkText.shouldHave(text(text));
    }
}
