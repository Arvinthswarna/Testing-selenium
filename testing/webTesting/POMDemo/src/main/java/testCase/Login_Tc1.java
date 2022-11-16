package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Dashboard;
import pages.HomePage;
import pages.LoginPage;
public class Login_Tc1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemanth Devangam\\Documents\\axis\\axisb8\\libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //driver.get("https://demoqa.com/books");
        driver.get("http://127.0.0.1:8080/");
        //HomePage home = new HomePage(driver);
        
        LoginPage login = new LoginPage(driver);
    //  home.clickLogin();
        
        Dashboard dashboard = new Dashboard(driver);
        driver.manage().window().maximize();
        login.enterUsername("Hemanth");
        login.enterPassword("Hemanth@540");
        login.clickLogin();
        
        Thread.sleep(3000);
        System.out.println("Page title is: " + dashboard.getHeading());
    
        dashboard.clickLogout();
        
        //driver.quit();
        
    }
}
