package tests;

import data.CommonData;
import framework.Configuration;
import framework.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pageObjects.AuthorizationPage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestAuthPage extends Helper {

    @BeforeMethod
    public void setUp(){

        driver = getDriver();

        driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(50000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(50000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();

    }

    @Test(description = "Тест на авторизацию")
    public void authorizationTest() throws InterruptedException, IOException {

        AuthorizationPage page = new AuthorizationPage();

        CommonData user = new CommonData();

        autorizationAs(user.userEmail, user.userPass);

        waitBy(page.elementInObjectsList, 20);

    }

}