package domaci22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestRegirstracije {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\ItBootcamp\\New folder (5)\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.get(Home.url);
        Home.clickEnterTheStore(wd);
        Katalog.clickSignIn(wd);
        RegistrujSe.registerNowClick(wd);

        String filePath ="C:\\Users\\Maksa\\Desktop\\Registracija.xlsx" ;

        Registracija.setUserID(wd,CitanjeExcelTabele.readDataFromExcel(filePath,0,1));
        Registracija.setNewPassword(wd,CitanjeExcelTabele.readDataFromExcel(filePath,1,1));
        Registracija.setRepeatPassword(wd,CitanjeExcelTabele.readDataFromExcel(filePath,2,1));

        Registracija.setFirstName(wd,CitanjeExcelTabele.readDataFromExcel(filePath,3,1));
        Registracija.setLastName(wd,CitanjeExcelTabele.readDataFromExcel(filePath,4,1));
        Registracija.setEmail(wd,CitanjeExcelTabele.readDataFromExcel(filePath,5,1));
        Registracija.setPhone(wd,CitanjeExcelTabele.readDataFromExcel(filePath,6,1));
        Registracija.setAddress1(wd,CitanjeExcelTabele.readDataFromExcel(filePath,7,1));
        Registracija.setAddress2(wd,CitanjeExcelTabele.readDataFromExcel(filePath,8,1));
        Registracija.setCity(wd,CitanjeExcelTabele.readDataFromExcel(filePath,9,1));
        Registracija.setState(wd,CitanjeExcelTabele.readDataFromExcel(filePath,10,1));
        Registracija.setZip(wd,CitanjeExcelTabele.readDataFromExcel(filePath,11,1));
        Registracija.setCountry(wd,CitanjeExcelTabele.readDataFromExcel(filePath,12,1));

        Registracija.setLanguagePreference(wd,CitanjeExcelTabele.readDataFromExcel(filePath,13,1));
        Registracija.setFavouriteCategory(wd,CitanjeExcelTabele.readDataFromExcel(filePath,14,1).toUpperCase());
        Registracija.setEnableMyList(wd);
        Registracija.setEnableMyBanner(wd);
        Registracija.clickSaveAccountInformation(wd);
        wd.close();

        System.setProperty("webdriver.chrome.driver","D:\\ItBootcamp\\New folder (5)\\chromedriver.exe"");
        wd = new ChromeDriver();
        wd.get(Home.url);
        Home.clickEnterTheStore(wd);
        Katalog.clickSignIn(wd);
        ProveraNaloga.setUserName(wd,CitanjeExcelTabele.readDataFromExcel(filePath,0,1));
        ProveraNaloga.setPassword(wd,CitanjeExcelTabele.readDataFromExcel(filePath,1,1));
        ProveraNaloga.clickLogIn(wd);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wd.close();
    }
}
