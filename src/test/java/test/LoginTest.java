package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLoginPositive() {
        String validEmail = "bob@example.com";
        String validPwd = "10203040";

        // wait for welcome screen to self-close
        // check that the main items container is loaded
        // check the hamburger menu is clickable
        // click on hamburger menu
        app.getHeaderHelper().waitForMenuBtnToLoad();
        app.getHeaderHelper().clickOnMenuBtn();
        // wait till menu overlay is loaded
        // check that Log In option is there and clickable
        app.getMenuHelper().waitForMenuToLoad();
        // click on Log in
        app.getMenuHelper().clickOnLogin();
        // wait till Login Screen is loaded
        // login
        app.getLoginHelper().login(validEmail, validPwd);

        // option 1
        // wait till the item container is loaded
        // app.getItemContainerHelper().waitToLoad();
        // assert that current page is loaded item container
        // Assert.assertTrue(app.getItemContainerHelper().isItemContainer(),"Item Container view is loaded.");
        //option 2
        Assert.assertNotNull(app.getItemContainerHelper().waitToLoad(), "Item Container view is loaded.");
    }
}
