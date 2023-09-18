package JavaPrograms;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggestions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text: ");
		String x=sc.nextLine();
		sc.close();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys(x);
		
		List<WebElement> allItems=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/child::li"));
		int flag=0;
		for(WebElement items:allItems) {
			String str=items.getText();
			
			System.out.println();
			
			str=str.toLowerCase();
			str=str.replace(" ", "");
			x=x.toLowerCase();
			x=x.replace(" ", "");
			if(!str.contains(x)) {
				flag=1;
			}
		}
			if(flag==0) {
				System.out.println("Suggestions are correct.");	
		}
		else {
			System.out.println("Suggestions are incorrect.");
		}
		

	}

}
