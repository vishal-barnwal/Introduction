import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Code - 
		
		//Create Driver Object for Chrome Browser
		
		/*Class name= ChromeDriver;
		x driver=new x();*/
		
		
		//System.setProperty(key=webdriver.chrome.drive, value=C:\\Work\\chromedriver.exe);
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); //Validate page title is correct or not
		
		System.out.println(driver.getCurrentUrl());	//Validate if  you are landed on correct url
		
		//System.out.println(driver.getPageSource());//Print Page source
		
		driver.get("yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		driver.close(); //It closes current browser
		driver.quit(); //It closes all the browser opened by selenium
		
	}

	
}
