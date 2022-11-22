package fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ItemPageHelper extends BaseHelper {
    private static final String ADD_TO_CART_BTN_XPATH = "//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]";
    private static final String ITEM_IMG_XPATH = "//android.widget.ScrollView[@content-desc='product screen']/android.view.ViewGroup/android.widget.ImageView";

    public ItemPageHelper(AppiumDriver driver) {
        super(driver);
    }

    public void addItemToCart() {
        //Option 1:
        swipeScreen(Direction.UP);
        //https://appium.io/docs/en/writing-running-appium/tutorial/swipe/simple-screen/
        //Option 2:
        // swipeDown();
        waitForElementToBeClickable(By.xpath(ADD_TO_CART_BTN_XPATH));
        tap(By.xpath(ADD_TO_CART_BTN_XPATH));
    }

    protected void swipeDown() {
        //android.view.ViewGroup[@content-desc="Add To Cart button"]/android.widget.TextView
        String scrollableList = "product screen";
        String elementClassName = "android.widget.TextView";
        String anyText = "Add To Cart";
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().description(\"" + scrollableList + "\")).getChildByText("
                        + "new UiSelector().className(\"" + elementClassName + "\"), \"" + anyText + "\")"));
    }

    public void waitToLoad() {
        waitForElementToLoad(By.xpath(ITEM_IMG_XPATH));
    }
}
