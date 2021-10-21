package studentPageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CourseCertficate {



	By cert = By.xpath("//a[contains(text(),'Certificate')]");
	By cert1 = By.xpath("//*[@id='collapse7']/div/ul/li/a/div[2]");
	By getCert = By.xpath("//input[@value='Get your custom certificate']");
	By badgeNsurvey = By.xpath("//a[contains(text(),'Badge & Feedback')]");
	By getBadge = By.xpath("//div[contains(text(),'Click here to claim your Silver badge')]");
	By feedback = By.xpath("//div[contains(text(),'Course Feedback Form')]");


public WebDriver driver;
	
	public CourseCertficate(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void scroll() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1800)");
		Thread.sleep(500);
	}
	
	public void select() throws InterruptedException
	{
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.xpath("//p[contains(text(),'Selenium Beginners')]"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).build().perform();
		
		Thread.sleep(1000);
		
		WebElement mouseClick = driver.findElement(By.xpath("//p[contains(text(),'Selenium Beginners')]"));
		a.moveToElement(mouseClick).click().build().perform();
	}
	
	public WebElement cert()
	{
		return driver.findElement(cert);
	}
	
	
	public WebElement cert1()
	{
		return driver.findElement(cert1);
	}
	
	public WebElement getCert()
	{
		return driver.findElement(getCert);
	}
	
	public WebElement badgeNsurvey()
	{
		return driver.findElement(badgeNsurvey);
	}
	
	public WebElement getBadge()
	{
		return driver.findElement(getBadge);
	}
	
	public WebElement feedback()
	{
		return driver.findElement(feedback);
	}
}
