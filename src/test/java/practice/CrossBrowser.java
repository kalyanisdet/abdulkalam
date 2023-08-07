package practice;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text: ");
		String x=sc.nextLine();
		sc.close();
		
		RemoteWebDriver driver=null;
		if(x.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
		}
			else if(x.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get("https://www.gmail.com");
			}
			else if(x.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.get("https://www.gmail.com");
		}
		
		
		System.exit(0);

	}
	

}
