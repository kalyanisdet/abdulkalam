package JavaPrograms;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		
		sc.close();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys(x);
		
		List<WebElement> allSuggestions=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		int flag=0;
		for(WebElement eachSug:allSuggestions) {
			String a=eachSug.getText();
			a=a.toLowerCase();
			a=a.replace(" ", "");
			x=x.toLowerCase();
			x=x.replace(" ", "");
			if(!a.contains(x)) {
				System.out.println(a);
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("All suggestions are correct");
			
		}
		else {
			System.out.println("All suggestions are not correct");
		}

	}

}
