package studentPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CourseEnroll {



	By studentEnroll = By.id("id_submitbutton");
	By studentQuizCourseLink = By.xpath("//p[contains(text(),'Devops 101')]");
	By studentQuiz = By.xpath("//a[contains(text(),'Quiz')]");
	
	By studentQuizSel = By.xpath("//div[@id='collapse6']/div/ul/li/a/div[2]");
	By studentQuizAttempt = By.xpath("//input[@value='Attempt quiz now']");

public WebDriver driver;
	
	public CourseEnroll(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void scroll() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2600)");
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
	
	public void select2() throws InterruptedException
	{
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.xpath("//p[contains(text(),'Devops 101')]"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).build().perform();
		
		Thread.sleep(1000);

		WebElement mouseClick = driver.findElement(By.xpath("//p[contains(text(),'Devops 101')]"));
		a.moveToElement(mouseClick).click().build().perform();
	}
	
	public void select3() throws InterruptedException
	{
		Actions a = new Actions(driver);
		Thread.sleep(500);
		WebElement mouseHower = driver.findElement(By.xpath("//p[contains(text(),'Linux 101')]"));							//Hover mouse onto mouseHover button
		a.moveToElement(mouseHower).build().perform();
		
		Thread.sleep(1000);

		WebElement mouseClick = driver.findElement(By.xpath("//p[contains(text(),'Linux 101')]"));
		a.moveToElement(mouseClick).click().build().perform();
	}
	
	public WebElement studentEnroll()
	{
		return driver.findElement(studentEnroll);
	}
	
	
	public WebElement studentQuizCourseLink()
	{
		return driver.findElement(studentQuizCourseLink);
	}
	
	
	public WebElement studentQuiz()
	{
		return driver.findElement(studentQuiz);
	}
	
	public WebElement studentQuizSel()
	{
		return driver.findElement(studentQuizSel);
	}
	
	public WebElement studentQuizAttempt()
	{
		return driver.findElement(studentQuizAttempt);
	}
}
