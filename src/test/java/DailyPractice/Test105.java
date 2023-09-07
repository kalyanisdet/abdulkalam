package DailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test105 {

	public static void main(String[] args) throws Exception
	{
		//open browser(operation)
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site(operation)
		driver.get("https://www.worldometers.info/world-population/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//div[@class='maincounter-number']/child::span[@rel='current_population']"));
		String x=e.getText();
		System.out.println(x);
		
		String y=(String) driver.executeScript("return(arguments[0].childNodes[7].textContent);", e);
		System.out.println(y);
	}

}
