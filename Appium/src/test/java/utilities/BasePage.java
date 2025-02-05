package utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    private final static int defaultTimeout = 5;
    protected final int timeOut;

    protected BasePage(int timeOut) {
        this.timeOut = timeOut;
    }

    public BasePage() {
        this(defaultTimeout);
    }

    protected AndroidDriver getDriver() {
        return new DriverProvider().get();
    }

    protected WebElement waitForDisplayed(By locator, int time) {
        final var wait = new WebDriverWait(getDriver(), Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement waitForDisplayed(By locator) {
        return waitForDisplayed(locator, defaultTimeout);
    }

    protected void waitPage(By locator, String pageName) {
        waitForDisplayed(locator, timeOut);
    }


    protected WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    protected List<WebElement> findAll(By locator) {
        return getDriver().findElements(locator);
    }

    public void pressBack() {
        getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
    }

    protected void sleep(int timeMS) {
        try {
            Thread.sleep(timeMS);
        } catch (InterruptedException e) {
            Logs.error("InterruptedException: %s", e.getLocalizedMessage());
        }

    }

    // Función para hacer scroll corto hacia abajo
    public void scrollDownShort() {
        TouchAction action = new TouchAction(getDriver());
        int startX = getDriver().manage().window().getSize().width / 2;
        int startY = (int) (getDriver().manage().window().getSize().height * 0.7);
        int endY = (int) (getDriver().manage().window().getSize().height * 0.5);

        action
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public abstract void waitPageToLoad();

    public abstract void verifyPage();
}