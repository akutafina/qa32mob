package test;

import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testLoginPositive(){
        app.getLoginHelper().login("mylogin","pwd");
    }
}
