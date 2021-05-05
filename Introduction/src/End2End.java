import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class End2End {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();//Regular Expression for CSS
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();//Regular expression for xpath
		Thread.sleep(2000);
		getScreenshot(driver);
		
	}
	
	public static void getScreenshot(WebDriver driver) throws IOException
	{
		driver.get("https://www.google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,  new File("C:\\Users\\richa\\screenshot.png"));
	}

}
