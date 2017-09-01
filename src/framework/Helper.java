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
import org.testng.Assert;
import pageObjects.AuthorizationPage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.*;

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

    protected void sendKeys(By by,String keys){
        driver.findElement(by).sendKeys(keys);
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

    protected void writeToFile(String filePass, String data) throws IOException {

        FileWriter writer = new FileWriter(filePass, false);
        writer.write(data);
        writer.flush();

    }

    private void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    protected String readTXT(String fileName) throws FileNotFoundException {

        StringBuilder sb = new StringBuilder();
        exists(fileName);
        try {
            File file = new File(fileName);
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    protected boolean isElementPresent(By by){
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }

    protected void radioActive(By by){
        Assert.assertTrue(driver.findElement(by).getAttribute("class").contains("active"));
    }

    protected void textCorrect(By by, String s){
        String text1 = driver.findElement(by).getText();

        String text2 = s;

        try{
            Assert.assertTrue(text1.contains(text2));
        } catch (AssertionError ex){
            throw new RuntimeException(text1+"не то же самое что"+text2);
        }
    }
}
