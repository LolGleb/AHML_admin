package tests;

import data.CommonData;
import framework.Configuration;
import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pageObjects.AuthorizationPage;
import pageObjects.ObjectsListPage;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestObjectsList extends Helper {

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

    @Test(description = "Прокликивание ссылок в хедере страницы")
    public void clickLinksInHeader() throws InterruptedException, IOException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage page = new ObjectsListPage();

        click(page.orders);

        waitBy(page.elementInOrdersList, 20);

        click(page.renters);

        waitBy(page.elementInRentersList, 20);

        click(page.objects);

        waitBy(auth.elementInObjectsList, 20);

        click(page.logOut);

        waitBy(page.submit, 20);

    }

    @Test(description = "Добавление объекта", priority = 1)
    public void addObject() throws InterruptedException, AWTException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage page = new ObjectsListPage();

        click(page.addNewObject);

        waitBy(page.elementInAddObjectForm, 20);

        sleep(2000);

        driver.findElement(page.apartNumber).sendKeys("1");

        driver.findElement(page.price).sendKeys("555000");

        driver.findElement(page.deposit).clear();
        driver.findElement(page.deposit).sendKeys("55");

        driver.findElement(page.minMonth).clear();
        driver.findElement(page.minMonth).sendKeys("12");
        click(page.noPets);
        click(page.noChildren);
        click(page.noSmoke);

        driver.findElement(page.floor).sendKeys("7");

        click(page.room0);
        click(page.room1);
        click(page.room3);
        click(page.room4);
        click(page.room5);
        click(page.room6);
        click(page.room7);
        click(page.room2);

        driver.findElement(page.areaTotal).sendKeys("9999");
        driver.findElement(page.areaKitchen).sendKeys("888");
        driver.findElement(page.areaLiving).sendKeys("77");
        driver.findElement(page.areaRooms1).sendKeys("6");
        driver.findElement(page.areaRooms2).sendKeys("5555.55");

        click(page.decorBeige);
        click(page.decorWhite);
        click(page.decorBeige);

        click(page.noFurniture);
        click(page.furNational);
        click(page.furIkea);
        click(page.furElite);

        click(page.repairNormal);
        click(page.repairRussian);
        click(page.repairEuro);
        click(page.repairElite);
        click(page.needRepair);

        click(page.noBalcony1);
        click(page.balcony1);
        click(page.loggia1);
        click(page.addBalcony);
        click(page.noBalcony2);
        click(page.loggia2);
        click(page.balcony2);
        click(page.addBalcony);
        click(page.delBalcony1);
        click(page.addBalcony);
        click(page.delBalcony2);
        click(page.addBalcony);
        click(page.delBalcony3);
        click(page.addBalcony);
        click(page.loggia1);
        click(page.balcony2);
        click(page.noBalcony3);
        click(page.addBalcony);

        click(page.wcsSeparate1);
        click(page.wcsComb1);
        click(page.addWcs);
        click(page.wcsSeparate2);
        click(page.wcsComb2);
        click(page.addWcs);
        click(page.delWcs1);
        click(page.addWcs);
        click(page.delWcs2);
        click(page.addWcs);
        click(page.delWcs3);
        click(page.addWcs);
        click(page.wcsSeparate2);

        click(page.windowComb);
        click(page.windowStreet);
        click(page.windowYard);

        click(page.conditioner);
        click(page.internet);
        click(page.phone);
        click(page.washer);
        click(page.fridge);
        click(page.appliances);
        click(page.tv);
        click(page.doubleGlazing);
        click(page.signaling);

        driver.findElement(page.passport).sendKeys("Автоматизированное тестирование программного " +
                "обеспечения (Software Automation Testing) - это процесс верификации программного обеспечения, при " +
                "котором основные функции и шаги теста, такие как запуск, инициализация, выполнение, анализ и выдача " +
                "результата, выполняются автоматически при помощи инструментов для автоматизированного тестирования.");

        driver.findElement(page.tour3d).sendKeys("https://agent.33slona.ru/");

        String filePath1 = System.getProperty("user.dir") + "\\files\\001.jpg";
        setClipboardData(filePath1);
        WebElement input1 = driver.findElement(By.xpath("//input[@type='file']"));
        input1.click();

        Robot robot1 = new Robot();
        robot1.delay(250);
        robot1.keyPress(KeyEvent.VK_CONTROL);
        robot1.keyPress(KeyEvent.VK_V);
        robot1.keyRelease(KeyEvent.VK_V);
        robot1.keyRelease(KeyEvent.VK_CONTROL);
        sleep(1000);
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);

        sleep(5000);

        String filePath2 = System.getProperty("user.dir") + "\\files\\002.jpg";
        setClipboardData(filePath2);
        WebElement input2 = driver.findElement(By.xpath("//input[@type='file']"));
        input2.click();

        Robot robot2 = new Robot();
        robot2.delay(250);
        robot2.keyPress(KeyEvent.VK_CONTROL);
        robot2.keyPress(KeyEvent.VK_V);
        robot2.keyRelease(KeyEvent.VK_V);
        robot2.keyRelease(KeyEvent.VK_CONTROL);
        sleep(1000);
        robot2.keyPress(KeyEvent.VK_ENTER);
        robot2.keyRelease(KeyEvent.VK_ENTER);

        sleep(5000);

        String filePath3 = System.getProperty("user.dir") + "\\files\\003.jpg";
        setClipboardData(filePath3);
        WebElement input3 = driver.findElement(By.xpath("//input[@type='file']"));
        input3.click();

        Robot robot3 = new Robot();
        robot3.delay(250);
        robot3.keyPress(KeyEvent.VK_CONTROL);
        robot3.keyPress(KeyEvent.VK_V);
        robot3.keyRelease(KeyEvent.VK_V);
        robot3.keyRelease(KeyEvent.VK_CONTROL);
        sleep(1000);
        robot3.keyPress(KeyEvent.VK_ENTER);
        robot3.keyRelease(KeyEvent.VK_ENTER);

        sleep(5000);

        click(page.dropDownPhoto);
        click(page.optionPhotoWindow);
        click(page.dropDownPhoto);
        //click(page.delPhoto3b); - надо доработать!

        click(page.addObject);

        waitBy(page.elementInObjectsList, 20);

    }

    @Test(description = "Редактирование объекта", priority = 2)
    public void editObject() throws InterruptedException, AWTException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage page = new ObjectsListPage();

        click(page.dropdown);

        click(page.editObject);

        waitBy(page.elementInEditObjectForm, 20);

        sleep(2000);

        driver.findElement(page.apartNumber).clear();
        driver.findElement(page.apartNumber).sendKeys("2");

        driver.findElement(page.price).clear();
        driver.findElement(page.price).sendKeys("777000");

        driver.findElement(page.deposit).clear();
        driver.findElement(page.deposit).sendKeys("10");

        driver.findElement(page.minMonth).clear();
        driver.findElement(page.minMonth).sendKeys("1");

        click(page.noPets);
        click(page.noChildren);
        click(page.noSmoke);

        driver.findElement(page.floor).clear();
        driver.findElement(page.floor).sendKeys("15");

        click(page.room1);

        driver.findElement(page.areaTotal).clear();
        driver.findElement(page.areaTotal).sendKeys("11.11");
        driver.findElement(page.areaKitchen).clear();
        driver.findElement(page.areaKitchen).sendKeys("333");
        driver.findElement(page.areaLiving).clear();
        driver.findElement(page.areaLiving).sendKeys("55");
        driver.findElement(page.areaRooms1).clear();
        driver.findElement(page.areaRooms1).sendKeys("7");

        click(page.decorWhite);

        click(page.noFurniture);

        click(page.repairRussian);

        click(page.balcony1);
        click(page.loggia2);

        click(page.wcsSeparate1);
        click(page.delWcs3);
        click(page.wcsComb2);

        click(page.windowComb);

        click(page.conditioner);
        click(page.internet);
        click(page.phone);
        click(page.washer);
        click(page.fridge);
        click(page.appliances);
        click(page.tv);
        click(page.doubleGlazing);
        click(page.signaling);

        driver.findElement(page.passport).clear();
        driver.findElement(page.passport).sendKeys("Инструмент для автоматизированного тестирования " +
                "(Automation Test Tool) - это программное обеспечение, посредством которого специалист по " +
                "автоматизированному тестированию осуществляет создание, отладку, выполнение и анализ результатов " +
                "прогона тест скриптов.");

        driver.findElement(page.tour3d).clear();
        driver.findElement(page.tour3d).sendKeys("https://33slona.ru/");

        String filePath = System.getProperty("user.dir") + "\\files\\004.jpg";
        setClipboardData(filePath);
        WebElement input = driver.findElement(By.xpath("//input[@type='file']"));
        input.click();

        Robot robot = new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        sleep(5000);

        click(page.dropDownPhoto);
        click(page.optionPhotoKitchen);
        click(page.dropDownPhoto);
        //click(page.delPhoto2); - надо доработать!

        click(page.saveObject);

        waitBy(page.elementInObjectsList, 20);

        // !!! уточнить о проверке чекбоксов !!!
        /*List<WebElement> selCheckboxes = driver.findElements(page.conditioner);

        for (WebElement as : selCheckboxes){
            Assert.assertTrue(as.isSelected());
        }*/

    }

    // Добавить проверку на добавленные фото, на отметки чекбоксов и удаление фото
    // Добавить метод открытия, перелистывания и закрытия фото

}
