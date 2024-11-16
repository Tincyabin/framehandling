package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\selenium automation\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//switching by index
		//driver.switchTo().frame(0);
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("123");
		
		//switching by frame name
		// driver.switchTo().frame("login_page");
		// driver.findElement(By.name("fldLoginUserId")).sendKeys("123");
		
		 WebElement frame1 = driver.findElement(By.name("login_page"));//frame name=login page
		 driver.switchTo().frame(frame1); 
		 driver.findElement(By.name("fldLoginUserId")).sendKeys("123");

	}

}
