package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import page.aliexpressHomePage;

class aliexpresstest {
    private WebDriver driver;

    @BeforeEach
    public void setup() {
       driver = getDriver();
    }
    private WebDriver getDriver() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        return new ChromeDriver(options);
    }

    @Test
    @DisplayName("Test: select items from page")
    void giftsForHerFromMenu() throws InterruptedException {
        aliexpressHomePage aliexpressPage =
                new aliexpressHomePage(driver).openPage()
                        .aliexpressButtonClick();
    }

    @AfterEach
    @DisplayName("Close Chrome Driver")
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
