import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Program using xpath
		/*
		 * driver.findElement(By.xpath("//*[@name='email']")).sendKeys("abc@test.com");
		 * driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("123456");
		 * driver.findElement(By.xpath("//*[@name='login']")).click();
		 * System.out.println(driver.findElement(By.xpath("//*[@class='_9ay7']")).
		 * getText());
		 */
		
		//Program using cssSelector
		//Syntax - tagName[attribute='value'] or //tagName[v='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("[value='1']")).click();
		//driver.close();
}
}
