package Sessions;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String x=sc.nextLine();
		sc.close();
		RemoteWebDriver driver=null;//declare as null initially.
		if(x.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver(); //Define using specific constructor w.r.to browser.
			 driver.get("http://www.google.in");
			 }
		else if(x.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();//Define using specific constructor w.r.to browser.
			driver.get("http://www.google.in");
			}
		
		else if(x.equals("edge")) {
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();//Define using specific constructor w.r.to browser.
			driver.get("http://www.google.in");
			}
		else {
			System.out.println("Please check given browser name");
			System.exit(0);// 0 means forcibly stop execution.
		}
		
		
		

	}

}
