package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {
    @Test
    public void addItemToShoppingCartPositive() {
        app.getItemContainerHelper().waitToLoad();
        app.getItemContainerHelper().clickOnItemCard(1);
        app.getItemPageHelper().waitToLoad();
        app.getItemPageHelper().addItemToCart();
        app.getHeaderHelper().waitForItemsCounterToAppear();
        Assert.assertEquals(app.getHeaderHelper().getItemsCounter(), "1", "Shopping cart items counter is : 1.");
    }
}
