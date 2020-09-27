package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

    public class ContactUs {
        public static String contactUsXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
        public static String subjectHeadingXpath= "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/select[1]";
        public static String emailPath = "//input[@id='email']";
        public static String orderReferencePath = "//input[@id='id_order']";
        public static String uploadImagePath = "//input[@id='fileUpload']";
        public static String clickSendButtonPath = "//span[contains(text(),'Send')]";
        public static String messageTextPath = "//textarea[@id='message']";

        public static WebElement getContactUsXpath(WebDriver wb){
            return
                    wb.findElement(By.xpath(contactUsXpath));
        }
        public static void clickContactUs(WebDriver wb){
            getContactUsXpath(wb).click();
        }

        public static void chooseSubject (WebDriver wb, String subject) {
            Select categorySubject = new Select(wb.findElement(By.xpath(subjectHeadingXpath)));
            categorySubject.selectByVisibleText(subject);

        }

        public static WebElement getEmailBar(WebDriver wb){
            return wb.findElement(By.xpath(emailPath));
        }
        public static void clickEmailBar(WebDriver wb) {
            Actions actions = new Actions(wb);
            actions.moveToElement(getEmailBar(wb)).perform();
            getEmailBar(wb).click();
        }

        public static void writeEmail(WebDriver wb, String email) {
            getEmailBar(wb).sendKeys(email);
        }

        public static WebElement getOrderReference(WebDriver wb){
            return wb.findElement(By.xpath(orderReferencePath));
        }

        public static void clickOrderReference(WebDriver wb) {
            Actions actions = new Actions(wb);
            actions.moveToElement(getOrderReference(wb)).perform();
            getOrderReference(wb).click();
        }

        public static void writeOrderReference(WebDriver wb, String word) {
            getOrderReference(wb).sendKeys(word);
        }
        public static void uploadImage(WebDriver wb){
            WebElement addFile = wb.findElement(By.xpath(uploadImagePath));
            addFile.sendKeys("D:\\100MEDIA\\IMG_0006.JPG");
        }
        public static WebElement getSendDButton(WebDriver wb){
            return wb.findElement(By.xpath(clickSendButtonPath));
        }

        public static void clickSendButton(WebDriver wb) {
            Actions actions = new Actions(wb);
            actions.moveToElement(getSendDButton(wb)).perform();
            getSendDButton(wb).click();
        }
        public static WebElement getTextMessage(WebDriver wb){
            return wb.findElement(By.xpath(messageTextPath));
        }

        public static void clickTextMessage(WebDriver wd) {
            Actions actions = new Actions(wd);
            actions.moveToElement(getTextMessage(wd)).perform();
            getTextMessage(wd).click();
        }

        public static void writeTextMessage(WebDriver wb, String text) {
            getTextMessage(wb).sendKeys(text);
        }
    }

