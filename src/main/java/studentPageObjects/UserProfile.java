package studentPageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

public class UserProfile {

	By userMenu = By.cssSelector(".userbutton");
	By userProfile = By.xpath("//a/span[@id='actionmenuaction-2']");
	By userEdit = By.xpath("//a[contains(text(),'Edit profile')]");
	By userEditCity = By.id("id_city");
	By userUpdate = By.id("id_submitbutton");
	public WebDriver driver;

	public UserProfile(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement userMenu() {
		return driver.findElement(userMenu);
	}

	public WebElement userProfile() {
		return driver.findElement(userProfile);
	}

	public WebElement userEdit() {
		return driver.findElement(userEdit);
	}

	public WebElement userEditCity() {
		return driver.findElement(userEditCity);
	}

	public WebElement userUpdate() {
		return driver.findElement(userUpdate);
	}
}
