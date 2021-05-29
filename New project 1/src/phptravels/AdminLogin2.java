package phptravels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdminLogin2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
        // Admin login features
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(10000);
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Clicking on Hotel link
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Hotels\"]/li[1]/a")).click();
		
		//Clicking on Add button
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.name("hotelname")).sendKeys("Soumya_12:36");
		Thread.sleep(3000);
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("/html/body/p")).sendKeys("Sample description");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.name("hotelstars")));
		s1.selectByValue("4");
		Select s2=new Select(driver.findElement(By.name("hoteltype")));
		s2.selectByValue("102");
		driver.findElement(By.xpath("//div[@id='s2id_searching']")).click();
	    driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/div/input")).sendKeys("Beatrice");
	    driver.findElement(By.xpath("//span[text()='Beatrice']"));
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Facilities']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()=' Airport Transport']")).click();
		driver.findElement(By.xpath("//label[text()=' Business Center']")).click();
		driver.findElement(By.xpath("//label[text()=' Laundry Service']")).click();
		driver.findElement(By.xpath("//label[text()=' Bar Lounge']")).click();
		driver.findElement(By.xpath("//label[text()=' Air Conditioner']")).click();
		driver.findElement(By.xpath("//label[text()=' Elevator']")).click();
		driver.findElement(By.xpath("//label[text()=' Swimming Pool']")).click();
		driver.findElement(By.xpath("//label[text()=' Fitness Center']")).click();
		driver.findElement(By.xpath("//label[text()=' Restaurant']")).click();
		driver.findElement(By.xpath("//label[text()=' Disabled Facilities']")).click();
		driver.findElement(By.xpath("//label[text()=' Children Activites']")).click();
		driver.findElement(By.xpath("//label[text()=' Pets Allowed']")).click();
		driver.findElement(By.xpath("//label[text()=' SPA']")).click();
		
		// Meta info tab
		driver.findElement(By.xpath("//a[text()='Meta Info']")).click();
		driver.findElement(By.xpath("//input[@name='hotelmetatitle']")).sendKeys(" Arts and Heritage District, the art-inspired Rendezvous Hotel Singapore is 5-minute walk from Dhoby Ghat");
		driver.findElement(By.xpath("//textarea[@name='hotelkeywords']")).sendKeys("Singapore by Far East Hospitality, Singapore, Singapore, hotel, Hotels");
		driver.findElement(By.xpath("//textarea[@name='hotelmetadesc']")).sendKeys("Singapore's Arts and Heritage District, the art-inspired Rendezvous Hotel Singapore is 5-minute walk from Dhoby Ghaut and Bras Basah MRT...");
		
		// Policy tab
		driver.findElement(By.xpath("//a[text()='Policy']")).click();
		driver.findElement(By.xpath("//div[@id=\"s2id_autogen2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[6]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		}

	}
			
