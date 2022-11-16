package mytest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customer {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testingselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		
		obj.get("http://127.0.0.1:5500/Travel/index.html");
		obj.findElement(By.xpath("//*[@id=\"pro-id\"]")).sendKeys("1");
		obj.findElement(By.xpath("//*[@id=\"pro-name\"]")).sendKeys("Arvinth");
     	obj.findElement(By.xpath("//*[@id=\"pro-email\"]")).sendKeys("arvinth201997@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"pro-phone\"]")).sendKeys("9600441125");
     	obj.findElement(By.xpath("//*[@id=\"pro-city\"]")).sendKeys("erode");
		obj.findElement(By.xpath("//*[@id=\"pro-state\"]")).sendKeys("Tamilnadu");
		obj.findElement(By.xpath("//*[@id=\"pro-country\"]")).sendKeys("India");
		obj.findElement(By.xpath("//*[@id=\"Submit\"]/button")).sendKeys("Submitted Successfully");
		obj.findElement(By.xpath("//*[@id=\"get-customers\"]/button")).sendKeys("Customers Listed Successfully");
		
	    obj.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        obj.quit();
		

	}}
