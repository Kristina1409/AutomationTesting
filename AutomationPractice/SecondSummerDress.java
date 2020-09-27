package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SecondSummerDress {


    public static String secondSummDressXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/a[1]/img[1]";
    public static String whiteColourXpath ="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/div[1]/fieldset[2]/div[1]/ul[1]/li[1]/a[1]";
    public static String sizeXpath = "//option[contains(text(),'M')]";
    public static String addToCart = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]/span[1]";
    public static String checkOutXpath = "//span[contains(text(),'Proceed to checkout')]";
    public static String productNameXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p[1]";
    public static String productQuantityXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[2]";
    public static String colourSizeXpath = "//td[@class='cart_description']//a[contains(text(),'Color : White, Size : M')]";



    public static WebElement getSecondSummerDressXpath(WebDriver wb){
        return wb.findElement(By.xpath(secondSummDressXpath));
    }
    public static void clickSecondSummerDress(WebDriver wb){
        Actions act=new Actions(wb);
        act.moveToElement(getSecondSummerDressXpath(wb)).perform();
        getSecondSummerDressXpath(wb).click();
    }

    public static WebElement getWhiteColourXpath(WebDriver wb){
        return wb.findElement(By.xpath(whiteColourXpath));
    }
    public static void clickWhiteColour(WebDriver wb){
        getWhiteColourXpath(wb).click();
    }

    public static WebElement getSizeXpath(WebDriver wb){
        return wb.findElement(By.xpath(sizeXpath));
    }
    public static void clickSize(WebDriver wb){
        getSizeXpath(wb).click();
    }
    public static WebElement getProductQuantityXpath(WebDriver wb){
        return wb.findElement(By.xpath(productQuantityXpath));
    }
    public static WebElement getAddToCartXpath(WebDriver wb){
        return wb.findElement(By.xpath(addToCart));
    }
    public static void clickAddToCart(WebDriver wb){
        getAddToCartXpath(wb).click();
    }
    public static WebElement getCheckOutXpath(WebDriver wb){
        return wb.findElement(By.xpath(checkOutXpath));
    }
    public static void clickCheckOut(WebDriver wb){
        getCheckOutXpath(wb).click();
    }
    public static WebElement getProductNameXpath(WebDriver wb){
        return wb.findElement(By.xpath(productNameXpath));
    }

    public static String getProductQuantity(WebDriver wb){
        return getProductQuantityXpath(wb).getAttribute("value");
    }
    public static WebElement getColourSizeXpath(WebDriver wb){
        return wb.findElement(By.xpath(colourSizeXpath));
    }
    public static String getColourSize(WebDriver wb){
        return getColourSizeXpath(wb).getText();
    }
    public static String getProductName(WebDriver wb){
        return getProductNameXpath(wb).getText();
    }
}