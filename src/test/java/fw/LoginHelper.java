package fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginHelper extends BaseHelper {
    public static final String LOGIN_INPUT_FIELD_XPATH = "//android.widget.EditText[@content-desc='Username input field']";
    public static final String PWD_INPUT_FIELD_XPATH = "//android.widget.EditText[@content-desc='Password input field']";
    private static final String LOGIN_BTN_XPATH = "//android.view.ViewGroup[@content-desc='Login button']/android.widget.TextView";

    public LoginHelper(AppiumDriver driver) {
        super(driver);
    }

    public void login(String login, String pwd) {
        // wait till Login Screen is loaded
        // check login field is there and clickable
        waitToBeClickable(By.xpath(LOGIN_INPUT_FIELD_XPATH));
        // tap there, enter login, hide keyboard
        tap(By.xpath(LOGIN_INPUT_FIELD_XPATH));
        //option 1 (older io.appium:java-client):
        //        type(By.xpath(LOGIN_INPUT_FIELD_XPATH),login);
        //        hideKeyboard();
        //option 2 (older io.appium:java-client):
        typeAndTapEnter(By.xpath(LOGIN_INPUT_FIELD_XPATH), login);
        // check pwd field is there and clickable
        waitToBeClickable(By.xpath(PWD_INPUT_FIELD_XPATH));
        // tap there, enter login, hide keyboard
        tap(By.xpath(PWD_INPUT_FIELD_XPATH));
        //option 1 (older io.appium:java-client):
        // type(By.xpath(PWD_INPUT_FIELD_XPATH),login);
        // hideKeyboard();
        //option 2 (older io.appium:java-client):
        typeAndTapEnter(By.xpath(PWD_INPUT_FIELD_XPATH), pwd);
        // check Login Btn is there and clickable
        waitToBeClickable(By.xpath(LOGIN_BTN_XPATH));
        // click on Login
        tap(By.xpath(LOGIN_BTN_XPATH));
    }
}
