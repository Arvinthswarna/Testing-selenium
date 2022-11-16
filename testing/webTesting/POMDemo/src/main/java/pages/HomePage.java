package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By LoginBtn = By.id("login");
	
	public void clickLogin() {
		
	}
}
