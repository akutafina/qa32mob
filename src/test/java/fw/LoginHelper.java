package fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginHelper extends BaseHelper {
    private static final String LOGIN_INPUT_FIELD_ID = "log_email_input";
    private static final String PWD_INPUT_FIELD_ID = "log_password_input";
    private static final String LOGIN_BTN_ID = "login_btn";

    public LoginHelper(AppiumDriver driver) {
        super(driver);
    }

    public void login(String mylogin, String pwd) {
        //login impelementation
        waitToBeClickable(By.id(LOGIN_INPUT_FIELD_ID));
        tap(By.id(LOGIN_INPUT_FIELD_ID));
        type(By.id(LOGIN_INPUT_FIELD_ID), mylogin);

        tap(By.id(PWD_INPUT_FIELD_ID));
        type(By.id(PWD_INPUT_FIELD_ID), mylogin);

        hideKeyboard();

        sleep(5);

        tap(By.id(LOGIN_BTN_ID));

//        driver.findElement(By.id("splash_logo_img"));
//        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Logo\"]"));
    }
}
