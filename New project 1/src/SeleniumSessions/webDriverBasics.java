package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverBasics {
	
	public static void main(String args[]) throws InterruptedException {
		
	
	/* System.setProperty("webdriver.gecko.driver", "E:\\Selenium Project\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com"); */
	
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
	Thread.sleep(5000);
	
	if(title.equals("Google")) {
		
		System.out.println(" Title is correct");
		
	}
	
	else {
		
		System.out.println("Title is wrong");
	}
		
	driver.close();
}

}