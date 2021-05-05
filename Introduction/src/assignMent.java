import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Indiga";		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		
		
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("[id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		WebElement staticDrpdwn = driver.findElement(By.id("Adults"));
		Select drpdown = new Select(staticDrpdwn);
		drpdown.selectByIndex(3);
		
		WebElement staticDr = driver.findElement(By.id("Childrens"));
		Select drdown = new Select(staticDr);
		drdown.selectByIndex(3);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
				
		WebElement staticD = driver.findElement(By.id("Class"));
		Select drdow = new Select(staticD);
		drdow.selectByIndex(3);
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(a);
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		

	}

}
