package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice7 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Abdul kalam sir");
		driver.findElement(By.name("Password")).sendKeys("Abdul kalam sir");
		driver.findElement(By.name("company")).sendKeys("Abdul kalam sir");
		driver.findElement(By.name("mobile number")).sendKeys("Abdul kalam sir");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@title='Enter your first crush name']")).sendKeys("Venkateshwara");
		driver.findElement(By.xpath("//table[@id='resultTable']/descendant::tr[@class='usr_acn']/descendant::td/input[@id='ohrmList_chkSelectRecord_16']")).click();
		WebElement webelement=driver.findElement(By.xpath("//select[@name='tablepress-1_length']"));
		Select select=new Select(webelement);
		select.selectByIndex(3);
		driver.findElement(By.xpath("(//input[@type='search'])[last()]")).sendKeys("India");
		driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.linkText("Previous")).click();
		
		

	}
}
