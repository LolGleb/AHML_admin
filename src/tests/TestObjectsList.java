package tests;

import data.CommonData;
import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.AuthorizationPage;
import pageObjects.ObjectsAddPage;
import pageObjects.ObjectsListPage;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
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

        click(page.reports);

        waitBy(page.elementInReportsList, 20);

        click(page.objects);

        waitBy(page.elementInObjectsList, 20);

        click(page.orders);

        waitBy(page.elementInOrdersList, 20);

        click(page.renters);

        waitBy(page.elementInRentersList, 20);

        click(page.invoices);

        waitBy(page.elementInInvoicesList, 20);

        click(page.allServices);

        click(page.services);

        waitBy(page.elementInServicesList, 20);

        click(page.allServices);

        click(page.passes);

        waitBy(page.elementInPassesList, 20);

        click(page.ads);

        waitBy(page.elementInAdsList, 20);

        click(page.promos);

        waitBy(page.elementInPromosList, 20);

        click(page.logOut);

        waitBy(auth.submit, 20);

    }

    @Test(description = "Добавление объекта", priority = 1)
    public void addObject() throws InterruptedException, AWTException, IOException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage list = new ObjectsListPage();

        ObjectsAddPage add = new ObjectsAddPage();

        click(list.addNewObject);

        waitBy(add.elementInAddObjectForm, 20);

        sleep(2000);

        String s = readTXT("apartNumber.txt").trim();
        int y = Integer.parseInt(s);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
        driver.findElements(By.xpath("//input[@type='checkbox']")).stream().parallel().forEach(WebElement::click);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement a : checkboxes){
            Assert.assertTrue(a.isSelected());
        }

        driver.findElement(add.price).sendKeys("555000");

        driver.findElement(add.deposit).clear();
        driver.findElement(add.deposit).sendKeys("55");

        driver.findElement(add.minMonth).clear();
        driver.findElement(add.minMonth).sendKeys("12");

        driver.findElement(add.floor).sendKeys("7");

        click(add.room0);
        Assert.assertTrue(driver.findElement(add.room0).getAttribute("class").contains("active"));
        click(add.room1);
        Assert.assertTrue(driver.findElement(add.room1).getAttribute("class").contains("active"));
        click(add.room3);
        Assert.assertTrue(driver.findElement(add.room3).getAttribute("class").contains("active"));
        click(add.room4);
        Assert.assertTrue(driver.findElement(add.room4).getAttribute("class").contains("active"));
        click(add.room5);
        Assert.assertTrue(driver.findElement(add.room5).getAttribute("class").contains("active"));
        click(add.room6);
        Assert.assertTrue(driver.findElement(add.room6).getAttribute("class").contains("active"));
        click(add.room7);
        Assert.assertTrue(driver.findElement(add.room7).getAttribute("class").contains("active"));
        click(add.room2);
        Assert.assertTrue(driver.findElement(add.room2).getAttribute("class").contains("active"));

        driver.findElement(add.areaTotal).sendKeys("333,33");
        driver.findElement(add.areaKitchen).sendKeys("44.44");
        driver.findElement(add.areaLiving).sendKeys("55,5");
        driver.findElement(add.areaRooms1).sendKeys("66.6");
        driver.findElement(add.areaRooms2).sendKeys("77");

        click(add.decorBeige);
        Assert.assertTrue(driver.findElement(add.decorBeige).getAttribute("class").contains("active"));
        click(add.decorWhite);
        Assert.assertTrue(driver.findElement(add.decorWhite).getAttribute("class").contains("active"));
        click(add.decorBeige);
        Assert.assertTrue(driver.findElement(add.decorBeige).getAttribute("class").contains("active"));

        click(add.noFurniture);
        Assert.assertTrue(driver.findElement(add.noFurniture).getAttribute("class").contains("active"));
        click(add.furNational);
        Assert.assertTrue(driver.findElement(add.furNational).getAttribute("class").contains("active"));
        click(add.furIkea);
        Assert.assertTrue(driver.findElement(add.furIkea).getAttribute("class").contains("active"));
        click(add.furElite);
        Assert.assertTrue(driver.findElement(add.furElite).getAttribute("class").contains("active"));

        click(add.repairNormal);
        Assert.assertTrue(driver.findElement(add.repairNormal).getAttribute("class").contains("active"));
        click(add.repairRussian);
        Assert.assertTrue(driver.findElement(add.repairRussian).getAttribute("class").contains("active"));
        click(add.repairEuro);
        Assert.assertTrue(driver.findElement(add.repairEuro).getAttribute("class").contains("active"));
        click(add.repairElite);
        Assert.assertTrue(driver.findElement(add.repairElite).getAttribute("class").contains("active"));
        click(add.needRepair);
        Assert.assertTrue(driver.findElement(add.needRepair).getAttribute("class").contains("active"));

        click(add.noBalcony1);
        Assert.assertTrue(driver.findElement(add.noBalcony1).getAttribute("class").contains("active"));
        click(add.balcony1);
        Assert.assertTrue(driver.findElement(add.balcony1).getAttribute("class").contains("active"));
        click(add.loggia1);
        Assert.assertTrue(driver.findElement(add.loggia1).getAttribute("class").contains("active"));
        click(add.addBalcony);
        click(add.noBalcony2);
        Assert.assertTrue(driver.findElement(add.noBalcony2).getAttribute("class").contains("active"));
        click(add.loggia2);
        Assert.assertTrue(driver.findElement(add.loggia2).getAttribute("class").contains("active"));
        click(add.balcony2);
        Assert.assertTrue(driver.findElement(add.balcony2).getAttribute("class").contains("active"));
        click(add.addBalcony);
        click(add.delBalcony1);
        click(add.addBalcony);
        click(add.delBalcony2);
        click(add.addBalcony);
        click(add.delBalcony3);
        click(add.addBalcony);
        click(add.loggia1);
        Assert.assertTrue(driver.findElement(add.loggia1).getAttribute("class").contains("active"));
        click(add.balcony2);
        Assert.assertTrue(driver.findElement(add.balcony2).getAttribute("class").contains("active"));
        click(add.noBalcony3);
        Assert.assertTrue(driver.findElement(add.noBalcony3).getAttribute("class").contains("active"));
        click(add.addBalcony);

        click(add.wcsSeparate1);
        Assert.assertTrue(driver.findElement(add.wcsSeparate1).getAttribute("class").contains("active"));
        click(add.wcsComb1);
        Assert.assertTrue(driver.findElement(add.wcsComb1).getAttribute("class").contains("active"));
        click(add.addWcs);
        click(add.wcsSeparate2);
        Assert.assertTrue(driver.findElement(add.wcsSeparate2).getAttribute("class").contains("active"));
        click(add.wcsComb2);
        Assert.assertTrue(driver.findElement(add.wcsComb2).getAttribute("class").contains("active"));
        click(add.addWcs);
        click(add.delWcs1);
        click(add.addWcs);
        click(add.delWcs2);
        click(add.addWcs);
        click(add.delWcs3);
        click(add.addWcs);
        click(add.wcsSeparate2);
        Assert.assertTrue(driver.findElement(add.wcsSeparate2).getAttribute("class").contains("active"));

        click(add.windowComb);
        click(add.windowStreet);
        click(add.windowYard);

        driver.findElement(add.passport).sendKeys("Автоматизированное тестирование программного " +
                "обеспечения (Software Automation Testing) - это процесс верификации программного обеспечения, при " +
                "котором основные функции и шаги теста, такие как запуск, инициализация, выполнение, анализ и выдача " +
                "результата, выполняются автоматически при помощи инструментов для автоматизированного тестирования.");
        click(add.passportSwitchToEng);
        driver.findElement(add.passport).sendKeys("Automated software testing" +
                "Software Automation Testing is a process of software verification, with" +
                "What are the basic functions and steps of the test, such as starting, initializing, executing, analyzing and issuing" +
                "The result is done automatically using tools for automated testing.");
        click(add.passportSwitchToRu);

        driver.findElement(add.description).sendKeys("Очень хорошее описание апартамента на русском языке");
        click(add.descriptionSwitchToEng);
        driver.findElement(add.description).sendKeys("Very good description of the apartment in English");
        click(add.descriptionSwitchToRu);

        driver.findElement(add.tour3d).sendKeys("https://agent.33slona.ru/");

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

        click(add.dropDownPhoto);
        click(add.optionPhotoWindow);
        click(add.dropDownPhoto);
        click(add.delPhoto3b);

        for(;;){

            String ss = String.valueOf(y);

            driver.findElement(add.apartNumber).clear();
            driver.findElement(add.apartNumber).sendKeys(ss);

            click(add.saveObject);

            sleep(3000);

            if(isElementPresent(By.cssSelector("div.text-danger"))){

                y++;

            } else {

                writeToFile("apartNumber.txt", ss);

                break;

            }

        }

        waitBy((By.xpath("//div{text()='Объект создан'}")), 20);

    }

    @Test(description = "Редактирование объекта", priority = 2)
    public void editObject() throws InterruptedException, AWTException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage list = new ObjectsListPage();

        ObjectsAddPage add = new ObjectsAddPage();

        click(list.dropdown);

        click(list.editObject);

        waitBy(add.elementInAddObjectForm, 20);

        sleep(2000);

        driver.findElement(add.apartNumber).clear();
        driver.findElement(add.apartNumber).sendKeys("2");

        driver.findElement(add.price).clear();
        driver.findElement(add.price).sendKeys("777000");

        driver.findElement(add.deposit).clear();
        driver.findElement(add.deposit).sendKeys("10");

        driver.findElement(add.minMonth).clear();
        driver.findElement(add.minMonth).sendKeys("1");

        click(add.noPets);
        click(add.noChildren);
        click(add.noSmoke);

        driver.findElement(add.floor).clear();
        driver.findElement(add.floor).sendKeys("15");

        click(add.room1);

        driver.findElement(add.areaTotal).clear();
        driver.findElement(add.areaTotal).sendKeys("11.11");
        driver.findElement(add.areaKitchen).clear();
        driver.findElement(add.areaKitchen).sendKeys("333");
        driver.findElement(add.areaLiving).clear();
        driver.findElement(add.areaLiving).sendKeys("55");
        driver.findElement(add.areaRooms1).clear();
        driver.findElement(add.areaRooms1).sendKeys("7");

        click(add.decorWhite);

        click(add.noFurniture);

        click(add.repairRussian);

        click(add.balcony1);
        click(add.loggia2);

        click(add.wcsSeparate1);
        click(add.delWcs3);
        click(add.wcsComb2);

        click(add.windowComb);

        click(add.conditioner);
        click(add.internet);
        click(add.washer);
        click(add.fridge);
        click(add.appliances);
        click(add.tv);
        click(add.doubleGlazing);
        click(add.signaling);

        driver.findElement(add.passport).clear();
        driver.findElement(add.passport).sendKeys("Инструмент для автоматизированного тестирования " +
                "(Automation Test Tool) - это программное обеспечение, посредством которого специалист по " +
                "автоматизированному тестированию осуществляет создание, отладку, выполнение и анализ результатов " +
                "прогона тест скриптов.");

        driver.findElement(add.tour3d).clear();
        driver.findElement(add.tour3d).sendKeys("https://33slona.ru/");

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

        click(add.dropDownPhoto);
        click(add.optionPhotoKitchen);
        click(add.dropDownPhoto);
        //click(add.delPhoto2); - надо доработать!

        click(add.saveObject);

        waitBy(list.elementInObjectsList, 20);

        // !!! уточнить о проверке чекбоксов !!!
        /*List<WebElement> selCheckboxes = driver.findElements(page.conditioner);

        for (WebElement as : selCheckboxes){
            Assert.assertTrue(as.isSelected());
        }*/

    }

    // Добавить проверку на добавленные фото, на отметки чекбоксов и удаление фото
    // Добавить метод открытия, перелистывания и закрытия фото

}
