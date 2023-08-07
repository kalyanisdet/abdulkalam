package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("112").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//yt-formatted-string[text()='Music'])[2]")).click();
		
		






}
}