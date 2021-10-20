package studentPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Studentlogin {

	public WebDriver driver;

	By studentUsername = By.id("username");
	By studentPassword = By.id("password");
	By studentLogin = By.id("loginbtn");
	By errorlogin = By.cssSelector(".error");

	public Studentlogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement studentUsername() {
		return driver.findElement(studentUsername);
	}

	public WebElement studentPassword() {
		return driver.findElement(studentPassword);
	}

	public WebElement studentLogin() {
		return driver.findElement(studentLogin);
	}

	public String errorlogin() {
		String message = driver.findElement(errorlogin).getText();
		return message;

	}

}
