package properties;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {

    @Test
    @Tag("property")
    void systemPropertiesOperaTest() {
        String browser = System.getProperty("browser", "opera");
    }
    @Test
    @Tag("property")
    void systemBrowserSizeTest() {
        String browserSizes = System.getProperty("browserSize", "1920x1080");
        Configuration.browserSize = browserSizes;

    }

    @Test
    @Tag("property")
    void systemBrowserVersionTest() {
        String browserVersion = System.getProperty("browserVersion", "61.0");
        Configuration.browserVersion = browserVersion;
    }
}
