package DailyPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(); //browser open in normal size
		Thread.sleep(3000);
		//Minimize browser
		driver.manage().window().minimize();
		Thread.sleep(3000);
		//Maximize browser
		driver.manage().window().maximize(); //Maximise with tool bars
		Thread.sleep(3000);
		//get current size
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		//Resize browser
		Dimension d=new Dimension(800,300); //width and height
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//get current position 
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);

	}

}
