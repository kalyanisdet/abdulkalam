package practice;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice15 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]"));
		Thread.sleep(5000);
		try {
			e.click();
			
		}
		catch(Exception exception) {
			driver.executeScript("arguments[0].click();", e);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[(contains(text(),'Beauty, Toys & More'))]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Top Mirrorless Cameras']")).click();
		Thread.sleep(5000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[text()='Newest First']/following::a[@class='_1fQZEK']"));
		for(int i=0;i<elements.size();i++) {
			
		elements.get(i).click();
		Thread.sleep(5000);
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		WebElement webElement= driver.findElement(By.xpath("//div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']"));
		////div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']
		String x=webElement.getText();
			System.out.println(x);
			driver.close();
			driver.switchTo().window(list.get(0));
		}
		
		System.out.println("Get all the cameras prices successfully.");
		////*[@id="container"]/div/div[2]/div/div/div[9]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[1]
		//img[@alt='Beauty, Toys & More']/following::a[text()='Beauty & Personal Care']
			}
}

