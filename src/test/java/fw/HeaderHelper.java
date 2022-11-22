package fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HeaderHelper extends BaseHelper {

    public static final String CART_BADGE_TEXT_XPATH = "//android.view.ViewGroup[@content-desc='cart badge']/android.widget.TextView";
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

    public void waitForItemsCounterToAppear() {
        waitForElementToLoad(By.xpath(CART_BADGE_TEXT_XPATH));
    }

    public String getItemsCounter() {
        return getText(By.xpath(CART_BADGE_TEXT_XPATH));
    }

}
