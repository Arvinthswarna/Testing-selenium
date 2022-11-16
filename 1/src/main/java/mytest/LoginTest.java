package mytest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testingselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		
		obj.get("http://127.0.0.1:8081/");
		obj.findElement(By.id("j_username")).sendKeys("admin");
		obj.findElement(By.name("j_password")).sendKeys("admin123");
		obj.findElement(By.xpath("/html/body/div/div/form/div[4]/button")).click();
		obj.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		obj.findElement(By.xpath("//* [@id=\"page-header\"]/div[3]/a[2]/span")).click();
		obj.quit();
		

	}}
