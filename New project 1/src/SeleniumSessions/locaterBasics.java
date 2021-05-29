package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locaterBasics {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.actitime.com/free-online-trial");
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Soumya");
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("K");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ksoumya34@gmail.com");
    driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Testvox");
    driver.findElement(By.id("start-trial-submit")).click();

	}

}
