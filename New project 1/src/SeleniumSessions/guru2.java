package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        
        
        driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr318835");
		driver.findElement(By.name("password")).sendKeys("umeveja");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("Guru99 Bank Manager HomePage")){
			
			System.out.println(" Title of the page is correct");
			
		}
			
			else {
				
				System.out.print(" Wrong title");
			}
			
		driver.close();
	}
}


	


