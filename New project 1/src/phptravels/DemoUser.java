package phptravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(5000);
		driver.findElement(By.id("dropdownLangauge")).click();
		driver.findElement(By.xpath("//a[@id='en']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(10000);
	}

}
