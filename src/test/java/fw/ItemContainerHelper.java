package fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemContainerHelper extends BaseHelper {
    public static final String ITEMS_CONTAINER_XPATH = "//android.view.ViewGroup[@content-desc='products screen']/android.widget.ScrollView/android.view.ViewGroup";

    public ItemContainerHelper(AppiumDriver driver) {
        super(driver);
    }

    public WebElement waitToLoad() {
        return waitForElementToLoad(By.xpath(ITEMS_CONTAINER_XPATH));
    }

    public boolean isItemContainer() {
        return isElementPresent(By.xpath(ITEMS_CONTAINER_XPATH));
    }

}
