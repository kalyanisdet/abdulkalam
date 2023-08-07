package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().create();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		//driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[11]/a/div/span\r\n")).click();
	}

}
