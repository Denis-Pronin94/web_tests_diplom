package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.TestsConfig;
import helps.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class TestBase {

    static String browser = System.getProperty("browser");
    static String browserSize = System.getProperty("browserSize");
    static String selenoidUrl = System.getProperty("selenoidServer");
    static String browserVersion = System.getProperty("browserVersion");

    @BeforeAll
    static void setUp() {

        TestsConfig config = ConfigFactory.create(TestsConfig.class);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = browser;
        Configuration.browserSize = browserSize;
        Configuration.browserVersion = browserVersion;
        Configuration.remote = "https://" + config.login() + ":" + config.password() + "@" + selenoidUrl;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        sleep(5000);
        closeWebDriver();
    }
}
