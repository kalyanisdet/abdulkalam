package practice;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice12 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("pact");
		driver.findElement(By.id("snacktime")).getShadowRoot().findElement(By.name("chai")).sendKeys("Irani");
		
		}
		
	}

