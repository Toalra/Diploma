package config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebDriverConfig {
    private final WebConfig webConfig;

    public WebDriverConfig(WebConfig webConfig) {
        this.webConfig = webConfig;
    }

    public void applyWebConfig() {
        Configuration.baseUrl = webConfig.getBaseUrl();
        Configuration.browser = webConfig.getBrowser().toString();
        Configuration.browserVersion = webConfig.getBrowserVersion();
        Configuration.browserSize = webConfig.getBrowserSize();
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 10000;

        if (webConfig.isRemote()) {
            Configuration.remote = webConfig.getRemoteUrl();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
