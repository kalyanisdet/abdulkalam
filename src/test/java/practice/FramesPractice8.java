package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice8 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		driver.switchTo().frame("pact");
		
		driver.findElement(By.id("snacktime")).getShadowRoot()
		.findElement(By.name("chai")).sendKeys("Irani");
	}
}
