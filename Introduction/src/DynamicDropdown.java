import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		// //a[@value='MAA'] -Xpath for Chennai
		// //a[@value='BLR'] - Xpath for BLR
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(5000);
		
		
		//Somewhere hardcoded xpath is not allowed using indexes so we have to use Parent Child Traverse Xpath
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//Or
		//Parent Child Traverse Xpath (Parent Child Relationship xpath)
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'])")).click();
		
		//Code to handle Calendar UI in Travel Website using selenium using class as cssSelector
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-active(class object)")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		

	}

}
