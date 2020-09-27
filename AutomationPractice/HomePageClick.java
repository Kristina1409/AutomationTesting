package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageClick {
    public static String URL="http://automationpractice.com/index.php";
    public static String womanSummerDressesUrl="http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String dressesSummerDressesUrl="http://automationpractice.com/index.php?id_category=11&controller=category";
    public static String womanxpath="//a[@class='sf-with-ul'][contains(text(),'Women')]";
    public static String womanSummerDressesxpath="//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
    public static String dressesxpath="/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]";
    public static String dressesSummerDressesxpath="/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]";
    public static WebElement getWoman(WebDriver wb){
        return wb.findElement(By.xpath(womanxpath));
    }
    public static void moveToWoman(WebDriver wb){
        Actions act=new Actions(wb);
        act.moveToElement(getWoman(wb)).perform();
    }
    public static WebElement getWomSummerDresses(WebDriver wb){
        return wb.findElement(By.xpath(womanSummerDressesxpath));
    }
    public static void womSummerDressesClick(WebDriver wb){
        getWomSummerDresses(wb).click();
    }


    public static WebElement getDresses(WebDriver wb){
        return wb.findElement(By.xpath(dressesxpath));
    }
    public static void moveToDresses(WebDriver wb){
        Actions act=new Actions(wb);
        act.moveToElement(getDresses(wb)).perform();
    }
    public static WebElement getDressesSummDresses(WebDriver wb){
        return wb.findElement(By.xpath(dressesSummerDressesxpath));
    }
    public static void dressesSummDressesClick(WebDriver wb){
        getDressesSummDresses(wb).click();
    }
}
