package example;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
public class PlayTechBaseTest {

        @BeforeEach
        public void setUp() {

            // Configure Allure Selenide to attach screenshots and page source
            SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(true));

            // Open the browser with desired options
            open("https://playtech.ee");
        }

        @AfterEach
        public void tearDown() {
            // Close the browser
            closeWebDriver();
        }
    }

