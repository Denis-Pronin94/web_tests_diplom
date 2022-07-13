package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config {
    String login();
    String password();

    @DefaultValue("CHROME")
    String browser();

    @DefaultValue("100.0")
    String version();

    @DefaultValue("https://vkusvill.ru")
    String baseUrl();

    @DefaultValue("1920x1080")
    String resolution();

    @DefaultValue("false")
    boolean remote();
}
