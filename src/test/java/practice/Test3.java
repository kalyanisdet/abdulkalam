package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seletech.in/practice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@class='radioButton'])[3]")).click();
		WebElement e=driver.findElement(By.xpath("//select[@name='multiple-select-example']"));
		Select s=new Select(e);
		s.selectByIndex(2);
		
		WebElement e1=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Option2");
		
		
		driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Dinesh");
		driver.findElement(By.xpath("(//input[@class='btn-style btn-sm'])[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		
	}

}
