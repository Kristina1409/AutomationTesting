package Projekat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {

    public static WebDriver wb;

    @Test
    public void ExcelT() {

        System.setProperty("webdriver.chrome.driver", "D:\\ItBootcamp\\New folder (5)\\chromedriver.exe");

        wb = new ChromeDriver();
        wb.manage().window().maximize();
        wb.get(HomePageClick.URL);

        XSSFWorkbook fw;
        FileInputStream fis;

        try {
            fis = new FileInputStream("D:\\ItBootcamp\\Java\\Projekat1\\30pitanja.xlsx");
            fw = new XSSFWorkbook(fis);

            Sheet list = fw.getSheetAt(0);

            for (int i = 0; i < 30; i++) {

                Row red = list.getRow(i);

                ContactUs.clickContactUs(wb);
                ContactUs.chooseSubject(wb, "Webmaster");
                ContactUs.clickEmailBar(wb);
                Cell cell1 = red.getCell(0);
                WebElement inputEmail = wb.findElement(By.xpath(ContactUs.emailPath));
                inputEmail.sendKeys(cell1.toString());

                ContactUs.clickOrderReference(wb);
                Cell cell2 = red.getCell(1);
                WebElement inputOrderReference = wb.findElement(By.xpath(ContactUs.orderReferencePath));
                inputOrderReference.sendKeys(cell2.toString());

                ContactUs.uploadImage(wb);

                ContactUs.clickTextMessage(wb);
                Cell cell3 = red.getCell(2);
                WebElement inputMessage = wb.findElement(By.xpath(ContactUs.messageTextPath));
                inputMessage.sendKeys(cell3.toString());


                ContactUs.clickSendButton(wb);

                WebElement messageTextSuccess = wb.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[1]"));
                String text = messageTextSuccess.getText();
                Assert.assertEquals(text, "Your message has been successfully sent to our team.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Greska.");
        }
    }
}