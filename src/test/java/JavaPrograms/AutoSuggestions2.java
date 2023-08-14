package JavaPrograms;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter text");
		String str=scanner.nextLine();
		scanner.close();
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys(str);
		List<WebElement> collectAllItems=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		int flag=0;
		for(WebElement items:collectAllItems) {
			String y=items.getText();
		
			y=y.toLowerCase();
			y=y.replace(" ", "");
			str=str.toLowerCase();
			str=str.replace(" ", "");
			if(!y.contains(str)) {
				System.out.println(y);
				//If anything is flase "1" wrong suggestion.
				flag=1;
				
				break;
			}
			
			
		}
		
		if(flag==0) {
			System.out.println("All suggestions are correct");
		}
		else {
			System.out.println("All suggestions are wrong");
		}
		

	}

}
