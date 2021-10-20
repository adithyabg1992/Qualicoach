package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateCourse {
By course = By.xpath("//ul/li[3]/a[contains(text(),'Courses')]");
By manageCourse = 	By.xpath("//li/a[contains(text(),'Manage courses and categories')]");
By create       = By.xpath("//a[contains(text(),'Create new category')]");
By name         =    By.id("id_name");
By subBtn = By.id("id_submitbutton");
By find = By.xpath("//a[contains(text(),'ad_quali')]");
By create1 = By.xpath("//a[contains(text(),'Create new course')]");
By courseName = By.id("id_fullname");
By shortName = By.id("id_shortname");
By submit = By.id("id_saveanddisplay");


public WebDriver driver;
	
	public CreateCourse(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement course()
	{
		return driver.findElement(course);
	}
	
	public WebElement manageCourse()
	{
		return driver.findElement(manageCourse);
	}

	public WebElement create()
	{
		return driver.findElement(create);
	}
	
	public WebElement name()
	{
		return driver.findElement(name);
	}
	
	public WebElement subBtn()
	{
		return driver.findElement(subBtn);
	}
	
	public WebElement find()
	{
		return driver.findElement(find);
	}
	
	public WebElement create1()
	{
		return driver.findElement(create1);
	}
	
	public WebElement courseName()
	{
		return driver.findElement(courseName);
	}
	
	public WebElement shortName()
	{
		return driver.findElement(shortName);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
}
