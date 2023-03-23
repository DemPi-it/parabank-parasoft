package pageobjects.locators;

import org.openqa.selenium.By;

public class AboutPageLocators {
    public final static By AboutButton = By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a");;
    public final static By AboutPageTextTitle = By.xpath("//*[@id=\"rightPanel\"]/h1");
    public final static By AboutPageInfo = By.xpath("//*[@id=\"rightPanel\"]/p[1]");
    public final static By Site = By.xpath("//*[@id=\"rightPanel\"]/p[3]/a");
    public final static By MobilePhone = By.xpath("//*[@id=\"rightPanel\"]/p[3]");

}
