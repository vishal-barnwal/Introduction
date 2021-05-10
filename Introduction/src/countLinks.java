import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class countLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebDriverWait w = new WebDriverWait(driver,10);
		//Count of footer Section
		w.until(ExpectedConditions.elementToBeClickable(By.id("select-class-example")));
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println("Explicit wait is working");
		
		//Limited WebDriver Scope for footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Want link from only first column
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//Click on each links in the columns in new tab using CNTRL+LEFT Click or Enter and check if the pages are opening
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			String clickonlinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
			Thread.sleep(4000);
			
		}//For loop Opens all Tab
		
		
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}

	}


