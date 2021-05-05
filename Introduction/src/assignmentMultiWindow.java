import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentMultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='/windows']")).click();
		driver.findElement(By.cssSelector("a[href*='/windows/new']")).click();
		
		Set<String> abc = driver.getWindowHandles(); //parent id, Child id
		
		Iterator<String> it = abc.iterator();
		String parentId = it.next();
		
		
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		
		
	}

}
