package SamplePrograms;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String str=sc.nextLine();
		sc.close();
		RemoteWebDriver driver=null;
		if(str.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("http://www.gmail.com");
		}
		else if(str.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("http://www.gmail.com");
		}
		else if(str.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("http://www.gmail.com");
		}else {
			
			System.out.println("Enter mentioned browser name");
			System.exit(0);
		}
	
	}

}
