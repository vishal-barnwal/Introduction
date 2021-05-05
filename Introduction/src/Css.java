import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		  driver.get("https://login.salesforce.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.cssSelector("input[id='username']")).sendKeys("vbselenium");
		  driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234567");
		  //driver.findElement(By.xpath("//*[@id='Login']")).click();
		  //or
		  driver.findElement(By.cssSelector("#Login")).click();
	}

}
