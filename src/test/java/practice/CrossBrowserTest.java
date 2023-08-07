package practice;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter required browser:");
		String x=scanner.nextLine();
		scanner.close();
		
		if(x.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			RemoteWebDriver driver=new ChromeDriver();
			driver.get("http://www.amazon.in");
		}
		else if(x.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			RemoteWebDriver driver=new EdgeDriver();
			driver.get("http://www.amazon.in");
	}
System.exit(0);
}
}