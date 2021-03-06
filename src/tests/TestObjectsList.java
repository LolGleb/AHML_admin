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
import pageObjects.ObjectsCardPage;
import pageObjects.ObjectsListPage;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestObjectsList extends Helper {

    @BeforeMethod
    public void setUp(){

        driver = getDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(10000, TimeUnit.MILLISECONDS);
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

        String apartNumberFromTxt = readTXT("apartNumber.txt").trim();
        int y = Integer.parseInt(apartNumberFromTxt);
        String price = "555 000";
        String deposit = "55";
        String minMonth = "12";
        String floor = "7";
        String areaTotal = "333.33";
        String areaKitchen = "44.44";
        String areaLiving = "55.5";
        String areaRooms1 = "66.6";
        String areaRooms2 = "77";
        String passportRu = "Автоматизированное тестирование программного " +
                "обеспечения (Software Automation Testing) - это процесс верификации программного обеспечения, при " +
                "котором основные функции и шаги теста, такие как запуск, инициализация, выполнение, анализ и выдача " +
                "результата, выполняются автоматически при помощи инструментов для автоматизированного тестирования.";
        String passportEn = "Automated software testing" +
                "Software Automation Testing is a process of software verification, with" +
                "What are the basic functions and steps of the test, such as starting, initializing, executing, analyzing and issuing" +
                "The result is done automatically using tools for automated testing.";
        String descriptionRu = "Очень хорошее описание апартамента на русском языке";
        String descriptionEn = "Very good description of the apartment in English";
        String tour = "https://agent.33slona.ru/";


        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage list = new ObjectsListPage();

        ObjectsAddPage add = new ObjectsAddPage();

        ObjectsCardPage card = new ObjectsCardPage();

        // </Добавление объекта
        click(list.addNewObject);

        waitBy(add.elementInAddObjectForm, 20);

        sleep(2000);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
        driver.findElements(By.xpath("//input[@type='checkbox']")).stream().parallel().forEach(WebElement::click);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement a : checkboxes){
            Assert.assertTrue(a.isSelected());
        }

        sendKeys(add.price, price);

        driver.findElement(add.deposit).clear();
        sendKeys(add.deposit, deposit);

        driver.findElement(add.minMonth).clear();
        sendKeys(add.minMonth, minMonth);

        sendKeys(add.floor, floor);

        click(add.room0);
        radioActive(add.room0);
        click(add.room1);
        radioActive(add.room1);
        click(add.room3);
        radioActive(add.room3);
        click(add.room4);
        radioActive(add.room4);
        click(add.room5);
        radioActive(add.room5);
        click(add.room6);
        radioActive(add.room6);
        click(add.room7);
        radioActive(add.room7);
        click(add.room2);
        radioActive(add.room2);

        sendKeys(add.areaTotal, areaTotal);
        sendKeys(add.areaKitchen, areaKitchen);
        sendKeys(add.areaLiving, areaLiving);
        sendKeys(add.areaRooms1, areaRooms1);
        sendKeys(add.areaRooms2, areaRooms2);

        click(add.decorBeige);
        radioActive(add.decorBeige);
        click(add.decorWhite);
        radioActive(add.decorWhite);
        click(add.decorBeige);
        radioActive(add.decorBeige);

        click(add.noFurniture);
        radioActive(add.noFurniture);
        click(add.furNational);
        radioActive(add.furNational);
        click(add.furIkea);
        radioActive(add.furIkea);
        click(add.furElite);
        radioActive(add.furElite);

        click(add.repairNormal);
        radioActive(add.repairNormal);
        click(add.repairRussian);
        radioActive(add.repairRussian);
        click(add.repairEuro);
        radioActive(add.repairEuro);
        click(add.repairElite);
        radioActive(add.repairElite);
        click(add.needRepair);
        radioActive(add.needRepair);

        click(add.noBalcony1);
        radioActive(add.noBalcony1);
        click(add.balcony1);
        radioActive(add.balcony1);
        click(add.loggia1);
        radioActive(add.loggia1);
        click(add.addBalcony);
        click(add.noBalcony2);
        radioActive(add.noBalcony2);
        click(add.loggia2);
        radioActive(add.loggia2);
        click(add.balcony2);
        radioActive(add.balcony2);
        click(add.addBalcony);
        click(add.delBalcony1);
        click(add.addBalcony);
        click(add.delBalcony2);
        click(add.addBalcony);
        click(add.delBalcony3);
        click(add.addBalcony);
        click(add.loggia1);
        radioActive(add.loggia1);
        click(add.balcony2);
        radioActive(add.balcony2);
        click(add.noBalcony3);
        radioActive(add.noBalcony3);
        click(add.addBalcony);

        click(add.wcsSeparate1);
        radioActive(add.wcsSeparate1);
        click(add.wcsComb1);
        radioActive(add.wcsComb1);
        click(add.addWcs);
        click(add.wcsSeparate2);
        radioActive(add.wcsSeparate2);
        click(add.wcsComb2);
        radioActive(add.wcsComb2);
        click(add.addWcs);
        click(add.delWcs1);
        click(add.addWcs);
        click(add.delWcs2);
        click(add.addWcs);
        click(add.delWcs3);
        click(add.addWcs);
        click(add.wcsSeparate2);
        radioActive(add.wcsSeparate2);

        click(add.windowComb);
        radioActive(add.windowComb);
        click(add.windowStreet);
        radioActive(add.windowStreet);
        click(add.windowYard);
        radioActive(add.windowYard);

        sendKeys(add.passportRu, passportRu);
        click(add.passportSwitchToEng);
        sendKeys(add.passportEn, passportEn);
        click(add.passportSwitchToRu);

        sendKeys(add.descriptionRu, descriptionRu);
        click(add.descriptionSwitchToEng);
        sendKeys(add.descriptionEn, descriptionEn);
        click(add.descriptionSwitchToRu);

        sendKeys(add.tour3d, tour);

        String filePath1 = System.getProperty("user.dir") + "\\files\\001.png";
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

        sleep(7000);

        click(add.photo);
        hover(add.nextPhoto);
        click(add.nextPhoto);
        sleep(3000);
        click(add.nextPhoto);
        sleep(3000);
        click(add.prevPhoto);
        sleep(3000);
        click(add.closePhoto);

        click(add.dropDownPhoto);
        click(add.optionPhotoWindow);
        click(add.delPhoto2);

        // </ Подбор номера апарта
        for(;;){

            String ss = String.valueOf(y);

            driver.findElement(add.apartNumber).clear();
            driver.findElement(add.apartNumber).sendKeys(ss);

            click(add.saveObject);

            sleep(5000);

            if(isElementPresent(By.cssSelector("div.text-danger"))){

                y++;

            } else {

                writeToFile("apartNumber.txt", ss);

                break;

            }

        }
        // Подбор номера апарта>

        // Добавление объекта>

        // </Проверка карточки
        waitBy(card.toastSuccess, 20);
        waitBy(card.elementInObjectCard, 20);

        apartNumberFromTxt = readTXT("apartNumber.txt").trim();

        textCorrect(card.apartNumber, apartNumberFromTxt);
        textCorrect(card.price, price);
        textCorrect(card.deposit, deposit);
        textCorrect(card.minRent, minMonth);
        textCorrect(card.restrictions, "Без животных\n" +
                "Нельзя курить\n" +
                "Без детей");
        textCorrect(card.floor, floor);
        textCorrect(card.rooms, "2");
        textCorrect(card.areaTotal, areaTotal);
        textCorrect(card.areaKitchen, areaKitchen);
        textCorrect(card.areaLiving, areaLiving);
        textCorrect(card.livingRoom1, areaRooms1);
        textCorrect(card.livingRoom2, areaRooms2);
        textCorrect(card.decor, "Бежевый");
        textCorrect(card.furniture, "Элитная");
        textCorrect(card.repair, "Требует ремонта");
        textCorrect(card.balcony, "2 балкона и Лоджия");
        textCorrect(card.wc,"2 совмещенных и Раздельный");
        textCorrect(card.view, "Во двор");
        textCorrect(card.facilities, "Телевидение\n" +
                "Холодильник\n" +
                "Стиральная машина\n" +
                "Интернет\n" +
                "Посудомоечная машина\n" +
                "Бытовая техника\n" +
                "Кондиционер\n" +
                "Панорамное остекление");
        textCorrect(card.passport, passportRu);
        textCorrect(card.description, descriptionRu);
        textCorrect(card.tour, tour);
        waitBy(card.photo1, 20);
        waitBy(card.photo2, 20);
        click(card.photo1);
        hover(card.nextPhoto);
        click(card.nextPhoto);
        sleep(3000);
        click(card.nextPhoto);
        sleep(3000);
        click(card.prevPhoto);
        sleep(3000);
        click(card.closePhoto);
        textCorrect(card.dropdown1, "Вид из окна");
        textCorrect(card.dropdown2, "Не определен");
        // Проверка карточки>
    }

    @Test(description = "Редактирование объекта", priority = 2)
    public void editObject() throws InterruptedException, AWTException, FileNotFoundException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage list = new ObjectsListPage();

        ObjectsAddPage add = new ObjectsAddPage();

        ObjectsCardPage card = new ObjectsCardPage();

        String apartNumberFromTxt = readTXT("apartNumber.txt").trim();
        String price = "777 000";
        String deposit = "10";
        String minMonth = "1";
        String floor = "15";
        String areaTotal = "11.11";
        String areaKitchen = "333.33";
        String areaLiving = "55";
        String areaRooms1 = "7";
        String passportRu = "Инструмент для автоматизированного тестирования " +
                "(Automation Test Tool) - это программное обеспечение, посредством которого специалист по " +
                "автоматизированному тестированию осуществляет создание, отладку, выполнение и анализ результатов " +
                "прогона тест скриптов.";
        String passportEn = "The Automation Test Tool is a software by which an automated testing expert performs the " +
                "creation, debugging, execution and analysis of the results of a run of test scripts";
        String descriptionRu = "Я ОТРЕДАКТИРОВАЛ ЭТО АВТОТЕСТАМИ";
        String descriptionEn = "I HAVE EDITED THIS WITH THE HELP OF AUTOMATION";
        String tour = "https://33slona.ru/";

        // </Редактирование объекта
        sendKeys(list.filterSearch, apartNumberFromTxt);

        waitBy(list.dropdown, 20);

        click(list.dropdown);

        click(list.editObject);

        waitBy(add.elementInAddObjectForm, 20);

        sleep(2000);

        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
        driver.findElements(By.xpath("//input[@type='checkbox']")).stream().parallel().forEach(WebElement::click);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement a : checkboxes){
            Assert.assertFalse(a.isSelected());
        }

        valueCorrect(add.apartNumber, apartNumberFromTxt);

        clear(add.price);
        sendKeys(add.price, price);

        clear(add.deposit);
        sendKeys(add.deposit ,deposit);

        clear(add.minMonth);
        sendKeys(add.minMonth, minMonth);

        clear(add.floor);
        sendKeys(add.floor ,floor);

        click(add.room1);
        radioActive(add.room1);

        clear(add.areaTotal);
        sendKeys(add.areaTotal, areaTotal);
        clear(add.areaKitchen);
        sendKeys(add.areaKitchen, areaKitchen);
        clear(add.areaLiving);
        sendKeys(add.areaLiving, areaLiving);
        clear(add.areaRooms1);
        sendKeys(add.areaRooms1 ,areaRooms1);

        click(add.decorWhite);
        radioActive(add.decorWhite);

        click(add.noFurniture);
        radioActive(add.noFurniture);

        click(add.repairRussian);
        radioActive(add.repairRussian);

        click(add.balcony1);
        radioActive(add.balcony1);
        click(add.loggia2);
        radioActive(add.loggia2);

        click(add.wcsSeparate1);
        radioActive(add.wcsSeparate1);
        click(add.delWcs3);
        click(add.wcsComb2);
        radioActive(add.wcsComb2);

        click(add.windowComb);
        radioActive(add.windowComb);

        clear(add.passportRu);
        sendKeys(add.passportRu, passportRu);
        click(add.passportSwitchToEng);
        clear(add.passportEn);
        sendKeys(add.passportEn, passportEn);
        click(add.passportSwitchToRu);

        clear(add.descriptionRu);
        sendKeys(add.descriptionRu, descriptionRu);
        click(add.descriptionSwitchToEng);
        clear(add.descriptionEn);
        sendKeys(add.descriptionEn, descriptionEn);
        click(add.descriptionSwitchToRu);

        clear(add.tour3d);
        sendKeys(add.tour3d, tour);

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

        click(add.photo);
        hover(add.nextPhoto);
        click(add.nextPhoto);
        sleep(3000);
        click(add.nextPhoto);
        sleep(3000);
        click(add.prevPhoto);
        sleep(3000);
        click(add.closePhoto);

        click(add.dropDownPhoto);
        click(add.optionPhotoKitchen);
        click(add.dropDownPhoto);
        click(add.delPhoto2);

        click(add.saveObject);
        // Редактирование объекта>

        // </Проверка карточки
        waitBy(card.toastSuccess, 20);
        waitBy(card.elementInObjectCard, 20);

        textCorrect(card.apartNumber, apartNumberFromTxt);
        textCorrect(card.price, price);
        textCorrect(card.deposit, deposit);
        textCorrect(card.minRent, minMonth);
        textCorrect(card.floor, floor);
        textCorrect(card.rooms, "1");
        textCorrect(card.areaTotal, areaTotal);
        textCorrect(card.areaKitchen, areaKitchen);
        textCorrect(card.areaLiving, areaLiving);
        textCorrect(card.livingRoom1, areaRooms1);
        textCorrect(card.decor, "Белый");
        textCorrect(card.furniture, "Без мебели");
        textCorrect(card.repair, "Советский");
        textCorrect(card.balcony, "2 балкона и Лоджия");
        textCorrect(card.wc,"Совмещённый и Раздельный");
        textCorrect(card.view, "На улицу и двор");
        textCorrect(card.passport, passportRu);
        textCorrect(card.description, descriptionRu);
        textCorrect(card.tour, tour);
        waitBy(card.photo1, 20);
        waitBy(card.photo2, 20);
        click(card.photo1);
        hover(card.nextPhoto);
        click(card.nextPhoto);
        sleep(3000);
        click(card.nextPhoto);
        sleep(3000);
        click(card.prevPhoto);
        sleep(3000);
        click(card.closePhoto);
        textCorrect(card.dropdown1, "Кухня");
        textCorrect(card.dropdown2, "Не определен");
        // Проверка карточки>
    }

    @Test(description = "Проверка фильтров", priority = 3)
    public void checkFilters() throws InterruptedException, AWTException, FileNotFoundException {

        // </Авторизация
        AuthorizationPage auth = new AuthorizationPage();
        CommonData user = new CommonData();
        autorizationAs(user.userEmail, user.userPass);
        waitBy(auth.elementInObjectsList, 20);
        // Авторизация>

        ObjectsListPage list = new ObjectsListPage();

        String apartNumber = "25";
        String tel = "+7 903 306-31-36";
        String renter = "Съёмщиков Глебушка Сергеевич";
        String floor = "7";
        String roomCount = "Студия";

        sendKeys(list.filterSearch, apartNumber);
        waitBy(By.xpath("//a[text()='"+apartNumber+"']"), 20);
        clear(list.filterSearch);
        sleep(2000);

        sendKeys(list.filterSearch, "+79033063136");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "79033063136");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "89033063136");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "9033063136");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "+7 (903) 306-31-36");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "3136");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "903 36");
        sleep(2000);
        waitBy(list.phoneNumber, 20);
        textCorrect(list.phoneNumber, tel);
        clear(list.filterSearch);
        sleep(2000);

        sendKeys(list.filterSearch, "Глебушка");
        sleep(2000);
        waitBy(list.renter, 20);
        textCorrect(list.renter, renter);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "бушка");
        sleep(2000);
        waitBy(list.renter, 20);
        textCorrect(list.renter, renter);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "Съёмщиков Сергеевич");
        sleep(2000);
        waitBy(list.renter, 20);
        textCorrect(list.renter, renter);
        clear(list.filterSearch);
        sleep(2000);
        sendKeys(list.filterSearch, "ГЛЕ ЕВИЧ");
        sleep(2000);
        waitBy(list.renter, 20);
        textCorrect(list.renter, renter);
        clear(list.filterSearch);
        sleep(2000);

        sendKeys(list.filterFloor, floor);
        sleep(2000);
        waitBy(list.allFloors, 20);
        List<WebElement> floors = driver.findElements(list.allFloors);
        for (WebElement a : floors){
            Assert.assertTrue(a.getText().contains(floor));
        }
        sendKeys(list.filterFloor, "Все этажи");
        sleep(2000);

        sendKeys(list.filterRoom, roomCount);
        sleep(2000);
        waitBy(list.allRooms, 20);
        List<WebElement> rooms = driver.findElements(list.allRooms);
        for (WebElement a : rooms){
            Assert.assertTrue(a.getText().contains(roomCount));
        }
        sendKeys(list.filterRoom, "Все апартаменты");
        sleep(2000);
    }
}
