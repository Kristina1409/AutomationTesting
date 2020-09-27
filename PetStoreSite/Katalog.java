package domaci22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Katalog {
    private static String signInXpath = "//a[contains(text(),'Sign In')]";
    public static WebElement getSignIn(WebDriver wd){
        return wd.findElement(By.xpath(signInXpath));
    }
    public static void clickSignIn(WebDriver wd){
        getSignIn(wd).click();

    }
}