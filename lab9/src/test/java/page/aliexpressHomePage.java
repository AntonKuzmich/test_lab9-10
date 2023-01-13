package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class aliexpressHomePage extends BasePage{
    private static final String HOMEPAGE_URL = "https://aliexpress.ru/";

    @FindBy(xpath = "/html/body/div/div/div[6]/div/div/div/div[1]/div/ul/li[4]/a")
    private WebElement aliexpressButton;

    public aliexpressHomePage(WebDriver driver) {
        super(driver);
    }

    public aliexpressHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public aliexpressHomePage aliexpressButtonClick() throws InterruptedException {
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.elementToBeClickable(aliexpressButton))
                    .click();
        return this;
    }

}
