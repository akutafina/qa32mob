package fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
    AppiumDriver driver;
    DesiredCapabilities capabilities;

    LoginHelper loginHelper;
    private HeaderHelper headerHelper;
    private MenuHelper menuHelper;
    private ItemContainerHelper itemContainerHelper;
    private ItemPageHelper itemPageHelper;

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("deviceName", "qa32mob");
        capabilities.setCapability("appPackage", "com.saucelabs.mydemoapp.rn");
        capabilities.setCapability("appActivity", "com.saucelabs.mydemoapp.rn.MainActivity");
        capabilities.setCapability("app", "/Users/akutafina/Documents/Tools/Demo244.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        loginHelper = new LoginHelper(driver);
        headerHelper = new HeaderHelper(driver);
        menuHelper = new MenuHelper(driver);
        itemContainerHelper = new ItemContainerHelper(driver);
        itemPageHelper = new ItemPageHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public HeaderHelper getHeaderHelper() {
        return headerHelper;
    }

    public MenuHelper getMenuHelper() {
        return menuHelper;
    }

    public ItemContainerHelper getItemContainerHelper() {
        return itemContainerHelper;
    }

    public ItemPageHelper getItemPageHelper() {
        return itemPageHelper;
    }
}
