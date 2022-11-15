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

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("deviceName","qa32mob");
        capabilities.setCapability("appPackage","com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity",".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("app", "/Users/akutafina/Documents/Tools/v.0.0.3.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        loginHelper = new LoginHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public LoginHelper getLoginHelper() {
        return null;
    }
}
