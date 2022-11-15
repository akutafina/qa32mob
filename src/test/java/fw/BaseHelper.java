package fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseHelper {
    AppiumDriver driver;

    public BaseHelper(AppiumDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitToBeClickable(By locator) {
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void sleep(int seconds) {
        //implicit wait
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    protected void hideKeyboard() {
        driver.hideKeyboard();
    }

    public void tap(By locator) {
        driver.findElement(locator);
    }

    public void type (By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }
}
