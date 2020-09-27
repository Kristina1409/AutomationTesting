package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBar {
    public static String searchXpath = "//input[@id='search_query_top']";
    public static String submitSearchXpath = "//button[@name='submit_search']";
    public static String resultOfSearchXpath = "//span[@class='heading-counter']";
    public static String summerDress1colour = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[3]/ul[1]/li[4]/a[1]";
    public static String summerDress2colour = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]";
    public static String summerDress3colour = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/div[3]/ul[1]/li[2]/a[1]";


    public static WebElement getSearchXpath(WebDriver wb){
        return wb.findElement(By.xpath(searchXpath));
    }
    public static void clickSearch(WebDriver wb){
        getSearchXpath(wb).click();
    }
    public static void textInSearch(WebDriver wb, String a){
        getSearchXpath(wb).sendKeys(a);
    }
    public static WebElement getSubmitSearchXpath(WebDriver wb){
        return wb.findElement(By.xpath(submitSearchXpath));
    }
    public static void clickSubmitSearch(WebDriver wb){
        getSubmitSearchXpath(wb).click();
    }
    public static WebElement getResultOfSearchXpath(WebDriver wb){
        return wb.findElement(By.xpath(resultOfSearchXpath));
    }
    public static String getResultOfSearch(WebDriver wb){
        return getResultOfSearchXpath(wb).getText();
    }

    public static WebElement getSummerDress1colourCssSelector(WebDriver wb){
        return
                wb.findElement(By.xpath(summerDress1colour));
    }

    public static WebElement getSummerDress2colourCssSelector(WebDriver wb){
        return
                wb.findElement(By.xpath(summerDress2colour));
    }

    public static WebElement getSummerDress3colourCssSelector(WebDriver wb){
        return
                wb.findElement(By.xpath(summerDress3colour));
    }

    public static String getSummerDress1colour(WebDriver wb){
        return
                getSummerDress1colourCssSelector(wb).getAttribute("style");
    }
    public static String getSummerDress2colour(WebDriver wb){
        return
                getSummerDress2colourCssSelector(wb).getAttribute("style");
    }
    public static String getSummerDress3colour(WebDriver wb){
        return
                getSummerDress3colourCssSelector(wb).getAttribute("style");
    }

}
