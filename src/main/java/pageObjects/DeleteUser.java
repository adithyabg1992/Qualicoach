package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteUser {

	public WebDriver driver;
	By userNavigate= By.xpath("//a[contains(text(),'Users')]");
	//By userNavigate = By.xpath("//a[contains(text(),'Users')]");
	By BrowseListOfUsers = By.xpath("//ul/li/a[contains(text(),'Browse list of users')]");
	By searchBar = By.id("id_realname");
	By addFilter = By.id("id_addfilter");
	By deleteUser = By.cssSelector("img[title='Delete']");
	By confirmUser = By.cssSelector("input[value='Delete']");

	public DeleteUser(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement userNavigate() {
		return driver.findElement(userNavigate);
	}

	public WebElement BrowseListOfUsers() {
		return driver.findElement(BrowseListOfUsers);
	}

	public WebElement searchBar() {
		return driver.findElement(searchBar);
	}

	public WebElement addFilter() {
		return driver.findElement(addFilter);
	}

	public WebElement deleteUser() {
		return driver.findElement(deleteUser);
	}

	public WebElement confirmUser() {
		return driver.findElement(confirmUser);
	}

}
