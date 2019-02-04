package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions a=new Actions(driver);
		WebElement ele1 = driver.findElement(By.id("draggable"));
		
		WebElement ele2 = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(ele1, ele2).perform();
		
		
		
	}

}
