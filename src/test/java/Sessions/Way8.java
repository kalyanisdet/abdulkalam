package Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Way8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]")).click();
		WebElement e=driver.findElement(By.xpath("//label[@class='a-form-label']"));
		String x=e.getText();
		System.out.println("Label name is:"+x);
		driver.findElement(By.name("email")).sendKeys("8106537416",Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("//div[@class='a-column a-span5']"));
		String y=e1.getText();
		System.out.println("Label of pwd:"+y);
		driver.findElement(By.name("password")).sendKeys("8106537416", Keys.ENTER);
		driver.findElement(By.xpath("//a[@aria-label='0 items in cart']")).click();
		
		
	}

}
