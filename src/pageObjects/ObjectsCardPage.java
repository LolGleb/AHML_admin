package pageObjects;

import org.openqa.selenium.By;

public class ObjectsCardPage {

    public By elemntInObjectCard = By.xpath("//h1[contains(text(), 'Апартамент')]");

    public By apartNumber = By.xpath("//div[4]//div[2][@class='col-sm-10 ng-binding']");

    public By price = By.xpath("//div[5]//div[2][@class='col-sm-10 ng-binding ng-scope']");

    public By deposit = By.xpath("//div[6]//div[2][@class='col-sm-10 ng-binding ng-scope']");

    public By minRent = By.xpath("//div[7]//div[2][@class='col-sm-10 ng-binding']");

    public By restrictions = By.xpath("//div[8]/div[2][@class='col-sm-10 ng-scope']");

    public By floor = By.xpath("//div[9]//div[2][@class='col-sm-10 ng-binding']");

    public By rooms = By.xpath("//div[10]//div[2][@class='col-sm-10 ng-binding']");

    public By areaTotal = By.xpath("//div[1]/div[2][@class='col-sm-11 ng-binding']");

    public By areaKitchen = By.xpath("//div[2]/div[2][@class='col-sm-11 ng-binding']");

    public By areaLiving = By.xpath("//div[3]/div[2][@class='col-sm-11 ng-binding']");

    public By livingRoom1 = By.xpath("//div[2]/span[1][@class='ng-binding ng-scope']");

    public By livingRoom2 = By.xpath("//div[2]/span[2][@class='ng-binding ng-scope']");

    public By decor = By.xpath("//div[12]/div[2][@class='col-sm-10 ng-binding']");

    public By furniture = By.xpath("//div[13]/div[2][@class='col-sm-10 ng-binding']");

    public By repair = By.xpath("//div[14]/div[2][@class='col-sm-10 ng-binding']");

    public By balcony = By.xpath("//div[15]/div[2][@class='col-sm-10']");

    public By wc = By.xpath("//div[16]/div[2][@class='col-sm-10']");

    public By view = By.xpath("//div[17]/div[2][@class='col-sm-10 ng-binding']");

    public By facilities = By.xpath("//div[18]/div[2][@class='col-sm-10 ng-scope']");

    public By passport = By.xpath("//div[19]/div[2][@class='col-sm-10 ng-binding ng-scope']");

    public By description = By.xpath("//div[20]/div[2][@class='col-sm-10 ng-binding ng-scope']");

    public By tour = By.xpath("//div[21]/div[2][@class='col-sm-10 ng-binding ng-scope']");

    public By photo1 = By.xpath("//div[1]/div[1]/img");

    public By photo2 = By.xpath("//div[2]/div[1]/img");

    public By dropdown1 = By.xpath("//div[1]/div[2][@class='ng-binding']");

    public By dropdown2 = By.xpath("//div[2]/div[2][@class='ng-binding']");

    public By toastSuccess = By.xpath("//div[text()='Объект создан']");
}