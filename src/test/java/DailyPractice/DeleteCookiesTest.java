package DailyPractice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookiesTest {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Dimension d=new Dimension(800,300);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println("chrome width and height changed as per the mentioned.");
		
		Point p=new Point(200, 200);
		driver.manage().window().setPosition(p);
		System.out.println("Position setup as per the given.");
		
		
	}

}
