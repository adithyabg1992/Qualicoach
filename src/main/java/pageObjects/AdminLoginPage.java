package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
	
	public WebDriver driver;
	
	/*By email =By.cssSelector("[id='user_email']");
	By password =By.cssSelector("[type='password']");
	By login =By.cssSelector("[value='Log In']");*/
	
	
	By email = By.cssSelector("[id='username']");
	By password = By.cssSelector("[id='password']");
	By login = By.cssSelector("[value='Log in']");
	By errorlogin = By.cssSelector(".error");
	
	public AdminLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public String getErrorLogin() {
		
		 String error_message=driver.findElement(errorlogin).getText();
		 
		 return error_message;
	}
	
	
	

}
