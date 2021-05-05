import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).isSelected()));
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getText());
		for(int i=1; i<=4; i++)
		{
			System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getText());
			//driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		}
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		Assert.assertFalse((driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).isSelected()));
		//Need to uncheck the check box
		

	}

}
