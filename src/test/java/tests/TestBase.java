package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.tutu.ru/";
        Configuration.browserSize = "1920x1200";
        Configuration.pageLoadStrategy="eager";
    }

    @AfterEach
    void addAttachments() {
        closeWebDriver();
    }
}
