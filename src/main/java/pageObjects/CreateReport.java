package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateReport {
	
	public WebDriver driver;
	
	/*By email =By.cssSelector("[id='user_email']");
	By password =By.cssSelector("[type='password']");
	By login =By.cssSelector("[value='Log In']");*/
	
	By manageReports = By.xpath("//a[contains(text(),'Manage reports')]");
	By Sel = By.xpath("//a[contains(text(),'Grades of resources')]");
	By downloadReport =By.cssSelector("a[href*='viewreport.php?id=5&download=1&format=csv']");

	public CreateReport(WebDriver driver) 
	{
		this.driver=driver;
	}
	

	
	public WebElement manageReports()
	{
		return driver.findElement(manageReports);
	}
	
	public WebElement Sel()
	{
		return driver.findElement(Sel);
	}
	
	public WebElement downloadReport()
	{
		return driver.findElement(downloadReport);
	}
	
	

}
