package tests;

import com.codeborne.selenide.Configuration;
import config.CredentialsConfig;
import helps.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    @BeforeAll
    static void setUp() {
        CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class, System.getProperties());

        String browserName = String.valueOf(config.browser());
        String browserVersion = config.version();
        String browserResolution = config.resolution();

        Configuration.browser = browserName;
        Configuration.browserVersion = browserVersion;
        Configuration.baseUrl = config.baseUrl();
        Configuration.browserSize = browserResolution;

        if (config.remote()) {
            String Login = config.login(),
                   Password = config.password();

            Configuration.remote = String.format("https://%s:%s@selenoid.autotests.cloud/wd/hub",
                    Login, Password);

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }

        Attach.attachAsText("Browser: ", browserName);
        Attach.attachAsText("Version: ", browserVersion);
        Attach.attachAsText("Remote: ", String.valueOf(config.remote()));
        Attach.attachAsText("Login: ", config.login());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
