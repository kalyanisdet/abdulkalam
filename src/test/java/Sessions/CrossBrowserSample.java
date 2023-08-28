package Sessions;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserSample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter required browser name as per the given text:");
		String str=sc.nextLine();
		sc.close();
		RemoteWebDriver driver=null;//Declare the RemoteWebDriver(parent) intially null.
		if(str.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://www.amazon.in");
			
		}
		
		else if(str.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 driver.get("http://www.amazon.in");
		}
		
		else if(str.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("http://www.amazon.in");
		}
		else
			System.out.println("Please check given browser name:");
		
		System.exit(0);
	}
	


}
