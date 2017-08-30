package pageObjects;

import org.openqa.selenium.By;

public class AuthorizationPage {

    //public String pageURL = "http://localhost:8100/auth/login";
    public String pageURL = "http://dev-arenda.ahml.ru/admin/auth/login";

    public By userEmail = By.name("username qa-login");

    public By userPassword = By.name("password qa-password");

    public By submit = By.name("qa-login-btn");

    public By elementInObjectsList = By.xpath("//div[@class='page-header']");

}
