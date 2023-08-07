package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.linkText("Sign in")).click();
		WebElement e=driver.findElement(By.xpath("//label[@class='a-form-label']"));
		String s=e.getText();
		System.out.println("Label name of username: " +s);
		driver.findElement(By.name("email")).sendKeys("8106537416", Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("(//label[@class='a-form-label'])[1]"));
		String s1=e1.getText();
		System.out.println("Label name of password: " +s1);
		driver.findElement(By.name("password")).sendKeys("8106537416",Keys.ENTER);
		List<WebElement> headerlist=driver.findElements(By.xpath("//div[@id='nav-xshop-container']/descendant::div[@class='nav-progressive-content']/descendant::a"));
		for(int i=0;i<=headerlist.size();i++) {
			String x=headerlist.get(i).getText();
			System.out.println("Home page header options are: " +x);
		}
		int z=headerlist.size();

		System.out.println("Items size is: " +z);
		driver.findElement(By.xpath("//a[@aria-label='Open Menu']")).click();
		driver.findElement(By.xpath("//div[text()='Gift Cards & Mobile Recharges']")).click();
		driver.findElement(By.xpath("//a[text()='Mobile Recharges']")).click();
		driver.findElement(By.xpath("//a[text()='Visit the help section']")).click();
	

	}

}
