package framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.AuthorizationPage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;

public class Helper {

    // Вызов драйвера
    protected WebDriver driver;

    // Выбор драйвера и браузера
    protected WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver.exe");

        return new ChromeDriver();
    }

    // Сообщение об ошибке
    protected void afterExeptionMessage(String message) {

        throw new RuntimeException("\n" + message);

    }

    // Таймаут по заданному времени
    protected void sleep(int time) throws InterruptedException {

        Thread.sleep(time);

    }

    // Клик на элемент
    protected void click(By by) {

        waitBy(by, 10);
        driver.findElement(by).click();

    }

    // Таймаут по поиску элемента
    protected void waitBy(By by, int time) {

        new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(by));

    }

    // Прокрутка вниз (хз как работает)
    protected void scrollDown() {

        ((JavascriptExecutor) driver).executeScript("window.scroll(0, window.innerHeight);");

    }

    // Сделать скриншот
    protected void takeScreenshot(String filename) throws IOException {

        File problemNumbers = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(problemNumbers, new File(filename));

    }

    // Поиск элемента по ховеру
    protected void mouseMoveTo(WebElement element) {

        Locatable hoverItem = (Locatable) element;
        Mouse mouse = ((HasInputDevices) driver).getMouse();
        mouse.mouseMove(hoverItem.getCoordinates());

    }

    // Авторизация
    protected void autorizationAs(String username, String password) throws InterruptedException {

        AuthorizationPage auth = new AuthorizationPage();

        driver.get(auth.pageURL);

        driver.manage().window().maximize();

        waitBy(auth.submit, 20);

        driver.findElement(auth.userEmail).clear();
        driver.findElement(auth.userEmail).sendKeys(username);

        driver.findElement(auth.userPassword).clear();
        driver.findElement(auth.userPassword).sendKeys(password);

        click(auth.submit);

    }

    // Добавление файла
    protected void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

}