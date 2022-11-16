package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth Devangam\\Documents\\axis\\axisb8\\libraries\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://localhost:8080/");
		obj.findElement(By.name("j_username")).sendKeys("Hemanth");
		obj.findElement(By.name("j_password")).sendKeys("Hemanth@540");
		obj.findElement(By.xpath("/html/body/div/div/form/div[4]/button")).click();
		obj.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		obj.findElement(By.xpath("//*[@id=\"page-header\"]/div[3]/a[2]/span")).click();
		obj.quit();
	}
}
