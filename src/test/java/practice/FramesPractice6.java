package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice6 {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String x=scanner.nextLine();
		scanner.close();
		if(x.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			driver.get("http://www.amazon.in");
		}
		
		else if(x.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			RemoteWebDriver driver=new FirefoxDriver();
			driver.get("http://www.amazon.in");
		}
			
		else if(x.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			RemoteWebDriver driver=new EdgeDriver();
			driver.get("http://www.amazon.in");
		
		
		
		
	}
		else
		{
			System.out.println("Please check the given browser name:");
			System.exit(0);
		}

	}
}
