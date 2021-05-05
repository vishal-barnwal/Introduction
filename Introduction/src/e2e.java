import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'])")).click();
		//First calendar is enabled
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		//Second calendar is disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		}
		
		else
		{
			Assert.assertTrue(false);
		}
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		/*
		 * for(int i=1;i<5;i++) {
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click(); }
		 */
		
		WebElement staticDrpdwn = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select drpdown = new Select(staticDrpdwn);
		drpdown.selectByIndex(3);
		 
		 
		/*
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * //Assert.assertEquals(actual, expected)
		 * Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),
		 * "4 Adult");
		 * 
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * 
		 * Thread.sleep(3000);
		 */
		
		//dropdown with Select  tag - Static Dropdown
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		
		//To get the value is selected correct or not
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//Customize CSS 
		//driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
