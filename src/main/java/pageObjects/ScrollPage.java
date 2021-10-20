package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage {
	
	public WebDriver driver;
	
	public ScrollPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void scroll(int a, int b) throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(500);
	}

}
