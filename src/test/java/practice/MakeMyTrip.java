package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws Exception{ 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
		from.click();
		WebElement src=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		src.sendKeys("Hyderabad");
		Thread.sleep(5000);
		src.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		src.sendKeys(Keys.ENTER);
		
		
		//To enter to address
		driver.findElement(By.xpath("//span[text()='To']")).click();
		WebElement dest=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		dest.sendKeys("Tirupati");
		Thread.sleep(5000);
		dest.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		dest.sendKeys(Keys.ENTER);
		
		
		WebElement selectDate=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		selectDate.click();
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[1]/descendant::div[@aria-label='Tue Jul 04 2023']"));
		date.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		WebElement adultsandchildren=driver.findElement(By.xpath("//input[@id='travellerAndClass']"));
		adultsandchildren.click();
		
		WebElement adults=driver.findElement(By.xpath("(//ul[contains(@class,'guestCounter')])[1]/child::li[text()='4']"));
		adults.click();
		
		WebElement children=driver.findElement(By.xpath("(//ul[contains(@class,'guestCounter')])[2]/li[text()='2']"));
		children.click();
		
		WebElement travekclass=driver.findElement(By.xpath("(//ul[contains(@class,'guestCounter')])[4]/child::li[text()='Business']"));
		travekclass.click();
		
		driver.findElement(By.xpath("//button[text()='DONE']")).click();
		
		driver.findElement(By.xpath("//button[text()='Go Back']")).click();
	}

}
