package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru99Bank {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        
        // Alert function
        
    	driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(5000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
       
        
		/*driver.findElement(By.name("uid")).sendKeys("mngr318835");
		driver.findElement(By.name("password")).sendKeys("umeveja");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);*/
		
		// New customer creation//
		
		/* driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.name("name")).sendKeys("Soumya Vaidya");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.id("dob")).sendKeys("24041990");
		driver.findElement(By.name("addr")).sendKeys("11 Nandanavanam G street  Ulsoor");
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		driver.findElement(By.name("pinno")).sendKeys("560008");
		driver.findElement(By.name("telephoneno")).sendKeys("9591619787");
		driver.findElement(By.name("emailid")).sendKeys("ksoumya34@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Password@123");
		driver.findElement(By.name("sub")).click();*/
		
		// Edit customer//
		
		/*driver.findElement(By.linkText("Edit Customer")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("63877");
		driver.findElement(By.name("AccSubmit")).click();
		driver.findElement(By.name("addr")).clear();
		driver.findElement(By.name("addr")).sendKeys("11 Vigneshwara nilaya Nandanavanam G street  Ulsoor");
		Thread.sleep(5000);
		driver.findElement(By.name("sub")).click();*/
		
}
}