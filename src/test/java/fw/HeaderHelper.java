package fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HeaderHelper extends BaseHelper {

    private static final String MENU_BTN_XPATH = "//android.view.ViewGroup[@content-desc='open menu']/android.widget.ImageView";

    public HeaderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnMenuBtn() {
        waitForElementToBeClickable(By.xpath(MENU_BTN_XPATH));
        tap(By.xpath(MENU_BTN_XPATH));

    }

    public void waitForMenuBtnToLoad() {
        waitForElementToBeClickable(By.xpath(MENU_BTN_XPATH));
    }

}
