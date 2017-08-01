package pageObjects;

import org.openqa.selenium.By;

public class AuthorizationPage {

    public String pageURL = "http://dev-arenda-cp.ahml.ru/auth/login";

    public By userEmail = By.xpath("//input[@name='username']");

    public By userPassword = By.xpath("//input[@name='password']");

    public By submit = By.xpath("//button");

    public By elementInObjectsList = By.xpath("//div[@class='page-header']");

}
