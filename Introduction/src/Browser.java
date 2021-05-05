import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		  /*
		 * driver.findElement(By.id("email")).sendKeys("abc@gmail.co");
		 * driver.findElement(By.name("pass")).sendKeys("123456");
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 * driver.close();
		 */
		
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id='u_0_a_Gf']/div[3]/a")).click();
		System.out.println("Running");
	}

}
