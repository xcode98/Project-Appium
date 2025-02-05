package pages;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utilities.BasePage;
import utilities.Logs;

public class LoginPage extends BasePage {

    private final By closeButton = AppiumBy.accessibilityId("Navigate up");

    private final By homePage = AppiumBy.accessibilityId("Sign in");

    @Override
    public void waitPageToLoad() {
        waitPage(closeButton, this.getClass().getSimpleName());
    }

    public void clickCloseLogin() {
        find(closeButton).click();
    }

    @Override
    public void verifyPage() {
        Logs.info("Verificando la pagina de login");


        Assertions.assertAll(
                () -> Assertions.assertTrue(find(homePage).isDisplayed())
        );
    }

}
