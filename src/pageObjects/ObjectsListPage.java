package pageObjects;

import org.openqa.selenium.By;

public class ObjectsListPage {

    //HEADER

    public By reports = By.name("qa-head-reports");

    public By objects = By.name("qa-head-objects");

    public By orders = By.name("qa-head-orders");

    public By renters = By.name("qa-head-renters");

    public By invoices = By.name("qa-head-invoices");

    public By allServices = By.name("qa-head-all-services");

    public By services = By.name("qa-head-services");

    public By passes = By.name("qa-head-passes");

    public By ads = By.name("qa-head-ads");

    public By promos = By.name("qa-head-promos");

    public By logOut = By.name("qa-logout");

    //H1

    public By elementInReportsList = By.name("qa-h1-reports");

    public By elementInObjectsList = By.name("qa-h1-objects");

    public By elementInOrdersList = By.name("qa-h1-orders");

    public By elementInRentersList = By.name("qa-h1-renters");

    public By elementInInvoicesList = By.name("qa-h1-invoices");

    public By elementInServicesList = By.name("qa-h1-services");

    public By elementInPassesList = By.name("qa-h1-passes");

    public By elementInAdsList = By.name("qa-h1-ads");

    public By elementInPromosList = By.name("qa-h1-promos");



    public By addNewObject = By.xpath("//a[@ui-sref='dashboard.realtyAdd']");

    public By elementInAddObjectForm = By.xpath("//h1[@class='ng-binding'][text()='Добавление объекта']");

    public By addObject = By.xpath("//button[@type='submit'][contains(text(), 'Добавить')]");

    public By saveObject = By.xpath("//button[@type='submit'][contains(text(), 'Сохранить')]");

    public By dropdown = By.xpath("//tr[1]//a[@data-toggle='dropdown']");

    public By editObject = By.xpath("//tr[1]//a[text()='Редактировать...']");

    public By elementInEditObjectForm = By.xpath("//h1[@class='ng-binding'][text()='Редактирование объекта']");

    // </Параметры объекта
        public By apartNumber = By.xpath("//input[@name='number']");
        public By price = By.xpath("//input[@name='price']");
        public By deposit = By.xpath("//input[@name='deposit']");
        public By minMonth = By.xpath("//input[@name='lease']");

        public By noPets = By.xpath("//input[@ng-model='obj.requirements.noPets ']");
        public By noChildren = By.xpath("//input[@ng-model='obj.requirements.noChildren']");
        public By noSmoke = By.xpath("//input[@ng-model='obj.requirements.noSmoke']");

        public By floor = By.xpath("//input[@name='floor']");

        public By room0 = By.xpath("//div[@class='btn-group']/label[1]");
        public By room1 = By.xpath("//div[@class='btn-group']/label[2]");
        public By room2 = By.xpath("//div[@class='btn-group']/label[3]");
        public By room3 = By.xpath("//div[@class='btn-group']/label[4]");
        public By room4 = By.xpath("//div[@class='btn-group']/label[5]");
        public By room5 = By.xpath("//div[@class='btn-group']/label[6]");
        public By room6 = By.xpath("//div[@class='btn-group']/label[7]");
        public By room7 = By.xpath("//div[@class='btn-group']/label[8]");

        public By areaTotal = By.xpath("//input[@name='areaTotal']");
        public By areaKitchen = By.xpath("//input[@name='areaKitchen']");
        public By areaLiving = By.xpath("//input[@name='areaLiving']");
        public By areaRooms1 = By.xpath("//div[@class='col-sm-11']/span[1]/input[@name='areaRooms']");
        public By areaRooms2 = By.xpath("//div[@class='col-sm-11']/span[2]/input[@name='areaRooms']");

        public By decorWhite = By.xpath("//label[@ng-model='obj.decoration '][text()='Белый']");
        public By decorBeige = By.xpath("//label[@ng-model='obj.decoration '][text()='Бежевый']");

        public By noFurniture = By.xpath("//label[@ng-model='obj.furniture '][contains(text(), 'мебели')]");
        public By furNational = By.xpath("//label[@ng-model='obj.furniture '][text()='Отечественная']");
        public By furIkea = By.xpath("//label[@ng-model='obj.furniture '][text()='Икеа']");
        public By furElite = By.xpath("//label[@ng-model='obj.furniture '][text()='Элитная']");

        public By repairNormal = By.xpath("//label[@ng-model='obj.repair '][text()='Обычный']");
        public By repairRussian = By.xpath("//label[@ng-model='obj.repair '][text()='Советский']");
        public By repairEuro = By.xpath("//label[@ng-model='obj.repair '][text()='Евроремонт']");
        public By repairElite = By.xpath("//label[@ng-model='obj.repair '][text()='Элитный']");
        public By needRepair = By.xpath("//label[@ng-model='obj.repair '][contains(text(), 'ремонта')]");

        public By balcony1 = By.xpath("//div[@class='btn-toolbar']/div[1]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Балкон']");
        public By loggia1 = By.xpath("//div[@class='btn-toolbar']/div[1]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Лоджия']");
        public By noBalcony1 = By.xpath("//div[@class='btn-toolbar']/div[1]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Нет']");
        public By addBalcony = By.xpath("//div[14]//a[@type='button'][text()='Добавить']");
        public By delBalcony1 = By.xpath("//div[14]//div[1]/a[@type='button'][text()='Удалить']");
        public By delBalcony2 = By.xpath("//div[14]//div[2]/a[@type='button'][text()='Удалить']");
        public By delBalcony3 = By.xpath("//div[14]//div[3]/a[@type='button'][text()='Удалить']");
        public By balcony2 = By.xpath("//div[@class='btn-toolbar']/div[2]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Балкон']");
        public By loggia2 = By.xpath("//div[@class='btn-toolbar']/div[2]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Лоджия']");
        public By noBalcony2 = By.xpath("//div[@class='btn-toolbar']/div[2]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Нет']");
        public By noBalcony3 = By.xpath("//div[@class='btn-toolbar']/div[3]//label[@ng-model='obj.balconies[$index]']" +
                "[text()='Нет']");

        public By wcsComb1 = By.xpath("//div[@class='btn-toolbar']/div[1]//label[@ng-model='obj.wcs[$index]']" +
                "[text()='Совмещенный']");
        public By wcsSeparate1 = By.xpath("//div[@class='btn-toolbar']/div[1]//label[@ng-model='obj.wcs[$index]']" +
                "[text()='Раздельный']");
        public By addWcs = By.xpath("//div[15]//a[@type='button'][text()='Добавить']");
        public By delWcs1 = By.xpath("//div[15]//div[1]/a[@type='button'][text()='Удалить']");
        public By delWcs2 = By.xpath("//div[15]//div[2]/a[@type='button'][text()='Удалить']");
        public By delWcs3 = By.xpath("//div[15]//div[3]/a[@type='button'][text()='Удалить']");
        public By wcsComb2 = By.xpath("//div[@class='btn-toolbar']/div[2]//label[@ng-model='obj.wcs[$index]']" +
                "[text()='Совмещенный']");
        public By wcsSeparate2 = By.xpath("//div[@class='btn-toolbar']/div[2]//label[@ng-model='obj.wcs[$index]']" +
                "[text()='Раздельный']");

        public By windowStreet = By.xpath("//div[16]//div[@class='btn-group']/label[1]");
        public By windowYard = By.xpath("//div[16]//div[@class='btn-group']/label[2]");
        public By windowComb = By.xpath("//div[16]//div[@class='btn-group']/label[3]");

        public By conditioner = By.xpath("//input[@ng-model='obj.facilities.conditioner']");
        public By internet = By.xpath("//input[@ng-model='obj.facilities.internet']");
        public By phone = By.xpath("//input[@ng-model='obj.facilities.phone']");
        public By washer = By.xpath("//input[@ng-model='obj.facilities.washer']");
        public By fridge = By.xpath("//input[@ng-model='obj.facilities.fridge']");
        public By appliances = By.xpath("//input[@ng-model='obj.facilities.appliances']");
        public By tv = By.xpath("//input[@ng-model='obj.facilities.tv']");
        public By doubleGlazing = By.xpath("//input[@ng-model='obj.facilities.doubleGlazing']");
        public By signaling = By.xpath("//input[@ng-model='obj.facilities.signaling']");

        public By passport = By.xpath("//textarea[@ng-model='obj.passport']");

        public By tour3d = By.xpath("//input[@ng-model='obj.tour ']");

        public By dropDownPhoto = By.xpath("//div[1]/select");
        public By optionPhotoWindow = By.xpath("//div[1]/select/option[7]");
        public By optionPhotoKitchen = By.xpath("//div[1]/select[@ng-model='file.place']/option[text()='Кухня']");
        public By delPhoto3a = By.xpath("//div[3]/div[@class='item-preview-close']/span[@style='color: rgb(255, 255, 255);']");
        public By delPhoto3b = By.xpath("//div[3]/div[@class='item-preview-close']/span[@title='Удалить']");
        public By delPhoto2 = By.xpath("//div[2]/div[@class='item-preview-close']/span[@title='Удалить']");


    // Параметры объекта>

}
