//package config;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.aeonbits.owner.ConfigFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import com.codeborne.selenide.Browser;
//
//import java.util.function.Supplier;
//
//import static config.Browser.CHROME;
//import static config.Browser.FIREFOX;
//
//public class WebDriverProvider implements Supplier<WebDriver> {
//    private final WebConfig config;
//
//    public WebDriverProvider() {
//        this.config = ConfigFactory.create(WebConfig.class, System.getProperties());
//    }
//    @Override
//    public WebDriver get() {
//        WebDriver driver = createDriver();
//        driver.get(config.getBaseUrl());
//        return driver;
//    }
//    public WebDriver createDriver() {
//        case "CHROME": {
//            WebDriverManager.chromedriver().setup();
//            return new ChromeDriver();
//        }
//        case "FIREFOX": {
//            WebDriverManager.firefoxdriver().setup();
//            return new FirefoxDriver();
//        }
//    }
////        switch (config.getBrowser()) {
////            case Browser.CHROME: {
////                WebDriverManager.chromedriver().setup();
////                return new ChromeDriver();
////            }
////            case Browser.FIREFOX: {
////                WebDriverManager.firefoxdriver().setup();
////                return new FirefoxDriver();
////            }
////            default: {
////                throw new RuntimeException("No such driver");
////            }
////        }
////    }
//
//}
