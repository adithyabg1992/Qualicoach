package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddingUsers {
	
	public WebDriver driver;
	

	By userNavigate= By.xpath("//a[contains(text(),'Users')]");
	By adduser = By.xpath("//ul/li[3]/a[contains(text(),'Add a new user')]");
	By username =By.id("id_username");
	By passwordClick = By.xpath("//em[contains(text(),'Click to enter text')]");
	By newPassword = By.id("id_newpassword");
	By firstName =By.id("id_firstname");
	By lastNAme =By.id("id_lastname");
	By Email = By.id("id_email");
	By adminUpdate = By.id("id_submitbutton");
	

	
	public AddingUsers(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	
	public WebElement userNavigate()
	{
		return driver.findElement( userNavigate);
	}
	
	public WebElement adduser()
	{
		return driver.findElement(adduser);
	}

	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement passwordClick()
	{
		return driver.findElement(passwordClick);
	}
	
	public WebElement newPassword()
	{
		return driver.findElement(newPassword);
	}
	
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement lastNAme()
	{
		return driver.findElement(lastNAme);
	}

	public WebElement Email()
	{
		return driver.findElement(Email);
	}

	public WebElement adminUpdate()
	{
		return driver.findElement(adminUpdate);
	}
	
	
	

}
