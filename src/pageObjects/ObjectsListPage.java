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


    public By filterSearch = By.xpath("/html/body/div/div[2]/div/div[2]/div/multi-filter/div/div[1]/div[2]/input");

    public By filterFloor = By.xpath("");

    public By addNewObject = By.name("qa-add-obj-btn");

    public By dropdown = By.xpath("//tr[1]//a[@data-toggle='dropdown']");

    public By editObject = By.xpath("//tr[1]//a[text()='Редактировать...']");
}
