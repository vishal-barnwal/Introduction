import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//example: WebDriverWait ew = new WebDriverWait(driver object, Time(5)); 
		//Wait is not applied globally it is applied specific webelemnt
		WebDriverWait ew = new WebDriverWait(driver,5);
		
		
		
		String[] names = {"Brocolli","Cucumber","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(4000);
		
		Ecommerce e = new Ecommerce();
		
		//addItems here is known as utility
		e.addItems(driver, names);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		//example: WebDriverWait ew = new WebDriverWait(driver object, 5);
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
				
		
	}
	
	
		public void addItems(WebDriver driver, String[] names) {
		
		int j=0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//Size method is used to get size of ArrayList
		for(int i=0; i<products.size();i++) 
		{
			
			//Brocolli - 1Kg after using split method it will split Brocolli, and 1Kg
			String[] name = products.get(i).getText().split("-");
			//trim() method is used to to trim extra spaces 
			String formattedName = name[0].trim();
			
			//Format it to get actual vegetable name ex. Cucumber - 1kg to be formatted to Cucumber
			
			//Convert array into array list for easy search
			//TO check whether name you extracted is present in array list or not.
			List itemsNeededList = Arrays.asList(names);
			
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				// click on add to cart
				//It is not recommended to use xpath for text as it might change for Dynamic values
				//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				
				//We can use xpath for class
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//Length method is used to get size of an Array
				if(j==names.length) {
					break;
				}
					
				
				//break can't be used in array list or multiple concept is used. 
			}
		}
		
	}

}
