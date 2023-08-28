package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-Jh9lGc']/following::span[text()='Create account']")).click();
		driver.findElement(By.xpath("//li[@role='menuitem']/descendant::span[text()='For my child']")).click();
		
		
	}

}
