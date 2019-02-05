package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_broser_popup 
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
		
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		
		
		Set<String> whs = driver.getWindowHandles();
		whs.remove(parent);
		int count = whs.size();
		System.out.println(count);
	
		for(String s:whs)
		{
			driver.switchTo().window(s);
			driver.close();
			
		}
		
		
	}

}
