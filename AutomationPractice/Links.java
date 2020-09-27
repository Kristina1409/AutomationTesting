package Projekat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {

        public static String facebookXpath = "/html[1]/body[1]/div[1]/div[3]/footer[1]/div[1]/section[1]/ul[1]/li[1]/a[1]";
        public static String twitterXpath = "/html[1]/body[1]/div[1]/div[3]/footer[1]/div[1]/section[1]/ul[1]/li[2]/a[1]";
        public static String youtubeXpath = "/html[1]/body[1]/div[1]/div[3]/footer[1]/div[1]/section[1]/ul[1]/li[3]/a[1]";

        public static WebElement getFacebookXpath(WebDriver wb){
            return wb.findElement(By.xpath(facebookXpath));
        }
        public static void clickFacebook(WebDriver wb){
            getFacebookXpath(wb).click();
        }
        public static WebElement getTwitterXpath(WebDriver wb){
            return wb.findElement(By.xpath(twitterXpath));
        }
        public static void clickTwitter(WebDriver wb){
            getTwitterXpath(wb).click();
        }
        public static WebElement getYoutubeXpath(WebDriver wb){
            return wb.findElement(By.xpath(youtubeXpath));
        }
        public static void clickYoutube(WebDriver wb){
            getYoutubeXpath(wb).click();
        }

    }

