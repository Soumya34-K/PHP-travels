package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("SpiceMAX ")).click();
		

	}

}
