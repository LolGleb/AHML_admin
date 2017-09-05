package pageObjects;

import org.openqa.selenium.By;

public class ObjectsAddPage {

    public By elementInAddObjectForm = By.name("qa-h1-add-edit-copy");

    public By saveObject = By.name("qa-obj-submit-btn");

    // </Параметры объекта
    public By apartNumber = By.xpath("//input[@name='number']");
    public By price = By.xpath("//input[@name='price']");
    public By deposit = By.xpath("//input[@name='deposit']");
    public By minMonth = By.xpath("//input[@name='lease']");

    public By noPets = By.xpath("//input[@ng-model='obj.requirements.noPets']");
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

    public By noFurniture = By.xpath("//label[@ng-model='obj.furniture'][contains(text(), 'мебели')]");
    public By furNational = By.xpath("//label[@ng-model='obj.furniture'][text()='Отечественная']");
    public By furIkea = By.xpath("//label[@ng-model='obj.furniture'][text()='Икеа']");
    public By furElite = By.xpath("//label[@ng-model='obj.furniture'][text()='Элитная']");

    public By repairNormal = By.xpath("//label[@ng-model='obj.repair'][text()='Обычный']");
    public By repairRussian = By.xpath("//label[@ng-model='obj.repair'][text()='Советский']");
    public By repairEuro = By.xpath("//label[@ng-model='obj.repair'][text()='Евроремонт']");
    public By repairElite = By.xpath("//label[@ng-model='obj.repair'][text()='Элитный']");
    public By needRepair = By.xpath("//label[@ng-model='obj.repair'][contains(text(), 'ремонта')]");

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
    public By washer = By.xpath("//input[@ng-model='obj.facilities.washer']");
    public By fridge = By.xpath("//input[@ng-model='obj.facilities.fridge']");
    public By appliances = By.xpath("//input[@ng-model='obj.facilities.appliances']");
    public By tv = By.xpath("//input[@ng-model='obj.facilities.tv']");
    public By doubleGlazing = By.xpath("//input[@ng-model='obj.facilities.doubleGlazing']");
    public By signaling = By.xpath("//input[@ng-model='obj.facilities.signaling']");

    public By passportRu = By.xpath("//div[@id='ru_p']/div/div[2]/div[3]");
    public By passportEn = By.xpath("//div[@id='en_p']/div/div[2]/div[3]");
    public By passportSwitchToEng = By.xpath("//div[@class='ng-scope']/div[18]//a[contains(text(),'En')]");
    public By passportSwitchToRu = By.xpath("//div[@class='ng-scope']/div[18]//a[contains(text(),'Ру')]");

    public By descriptionRu = By.xpath("//div[@id='ru_d']/textarea");
    public By descriptionEn = By.xpath("//div[@id='en_d']/textarea");
    public By descriptionSwitchToEng = By.xpath("//div[@class='ng-scope']/div[19]//a[contains(text(),'En')]");
    public By descriptionSwitchToRu = By.xpath("//div[@class='ng-scope']/div[19]//a[contains(text(),'Ру')]");

    public By tour3d = By.xpath("//input[@ng-model='obj.tour ']");

    public By dropDownPhoto = By.xpath("//div[1]/select");
    public By optionPhotoWindow = By.xpath("//div[1]/select/option[7]");
    public By optionPhotoKitchen = By.xpath("//div[1]/select[@ng-model='file.place']/option[text()='Кухня']");
    public By delPhoto2 = By.xpath("//div[2]/button[@class='btn btn-danger item-preview-close']");
    public By nextPhoto = By.cssSelector("div.tru-slider__handler--next");
    public By prevPhoto = By.cssSelector("div.tru-slider__handler--prev");
    public By closePhoto = By.cssSelector("div.modal-photos__close");
    public By photo = By.xpath("//img");
    // Параметры объекта>
}
