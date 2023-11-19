package config;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;

import static org.openqa.selenium.logging.LogType.BROWSER;
import static org.openqa.selenium.remote.CapabilityType.BROWSER_VERSION;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue(BROWSER)
    Browser getBrowser();

    @Key("browserVersion")
    @DefaultValue(BROWSER_VERSION)
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1200")
    String getBrowserSize();

    @Key("baseUrl")
    @DefaultValue("https://www.tutu.ru/")
    String getBaseUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteUrl")
    String getRemoteUrl();
}
