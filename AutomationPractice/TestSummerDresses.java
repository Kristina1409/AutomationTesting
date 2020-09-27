package Projekat;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestSummerDresses {

    public static WebDriver wb;

    @BeforeMethod
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\ItBootcamp\\New folder (5)\\chromedriver.exe");
        wb = new ChromeDriver();
        wb.manage().window().maximize();
        wb.get(HomePageClick.URL);

    }

    @AfterMethod
    public static void close() {
        wb.close();
    }

    @Test
    public static void ClickOnWomen() {
        SoftAssert sa = new SoftAssert();
        HomePageClick.moveToWoman(wb);
        HomePageClick.womSummerDressesClick(wb);
        Assert.assertEquals(wb.getCurrentUrl(), HomePageClick.womanSummerDressesUrl);

        sa.assertAll();

    }

    @Test
    public static void ClickOnDresses() {

        SoftAssert sa = new SoftAssert();
        HomePageClick.moveToDresses(wb);
        HomePageClick.dressesSummDressesClick(wb);
        Assert.assertEquals(wb.getCurrentUrl(), HomePageClick.dressesSummerDressesUrl);
        sa.assertAll();
    }

    @Test
    public static void buyingProcess() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) wb;

        HomePageClick.moveToWoman(wb);
        Thread.sleep(1000);
        HomePageClick.womSummerDressesClick(wb);
        Actions actions = new Actions(wb);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        js.executeScript("arguments[0].scrollIntoView();", SecondSummerDress.getSecondSummerDressXpath(wb));
        wb.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        SecondSummerDress.clickSecondSummerDress(wb);
        SecondSummerDress.clickWhiteColour(wb);
        SecondSummerDress.clickSize(wb);
        SecondSummerDress.getProductQuantityXpath(wb);
        SecondSummerDress.clickAddToCart(wb);
        SecondSummerDress.clickCheckOut(wb);

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(SecondSummerDress.getProductName(wb), "Printed Summer dress");
        sa.assertEquals(SecondSummerDress.getColourSize(wb), "Color : White, Size : M ");
        sa.assertEquals(SecondSummerDress.getProductQuantity(wb), "2");

        sa.assertAll();
    }
    @Test
    public static void SearchBart() {
        SoftAssert as = new SoftAssert();

        SearchBar.clickSearch(wb);
        SearchBar.textInSearch(wb, "yellow");
        SearchBar.clickSubmitSearch(wb);
        wb.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        as.assertEquals(SearchBar.getResultOfSearch(wb), "3 results have been found.");
        as.assertEquals(SearchBar.getSummerDress1colour(wb), "background: rgb(241, 196, 15);");
        as.assertEquals(SearchBar.getSummerDress2colour(wb), "background: rgb(241, 196, 15);");
        as.assertEquals(SearchBar.getSummerDress3colour(wb), "background: rgb(241, 196, 15);");

        as.assertAll();

    }
    @Test
    public static void Links(){
        SoftAssert sa=new SoftAssert();

        Links.clickFacebook(wb);
        ArrayList<String> a = new ArrayList<>(wb.getWindowHandles());
        wb.switchTo().window(a.get(1));
        wb.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        sa.assertEquals(wb.getCurrentUrl(), "https://www.facebook.com/groups/525066904174158/");


        wb.switchTo().window(a.get(0));
        Links.clickTwitter(wb);
        a = new ArrayList<>(wb.getWindowHandles());
        wb.switchTo().window(a.get(2));
        wb.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        sa.assertEquals(wb.getCurrentUrl(), "https://twitter.com/seleniumfrmwrk");

        wb.switchTo().window(a.get(0));
        Links.clickYoutube(wb);
        a = new ArrayList<>(wb.getWindowHandles());
        wb.switchTo().window(a.get(3));
        wb.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        sa.assertEquals(wb.getCurrentUrl(), "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
        wb.switchTo().window(a.get(0));
        sa.assertAll();

    }
    @Test
    public void YContactUs() throws InterruptedException {

        ContactUs.getContactUsXpath(wb);
        ContactUs.clickContactUs(wb);
        Thread.sleep(3000);
        ContactUs.chooseSubject(wb, "Webmaster");
        ContactUs.getEmailBar(wb);
        ContactUs.clickEmailBar(wb);
        ContactUs.writeEmail(wb, "tomickristina@gmail.com");
        ContactUs.getOrderReference(wb);
        ContactUs.clickOrderReference(wb);
        ContactUs.writeOrderReference(wb, "order something");
        ContactUs.uploadImage(wb);
        ContactUs. getTextMessage(wb);
        ContactUs.clickTextMessage(wb);
        ContactUs.writeTextMessage((wb), "I want to by summer dress.");
        ContactUs.getSendDButton(wb);
        ContactUs.clickSendButton(wb);

        WebElement mailText = wb.findElement(By.xpath("//p[@class='alert alert-success']"));
        String text = mailText.getText();
        Assert.assertEquals(text, "Your message has been successfully sent to our team.");

    }

}






