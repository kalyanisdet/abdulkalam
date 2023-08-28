package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import PagesForElements.HomePg;
import PagesForElements.LoginPg;

public class MyConcrete implements LoginPg, HomePg{
	static RemoteWebDriver driver;
	public void AllBtn() {
		clkOnAll.click();
	}
	
	public void selectNewRelase() {
		selectNewReleases.click();
	}
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		MyConcrete obj=new MyConcrete();
		obj.AllBtn();
		obj.selectNewRelase();
		
	}

	
		
	}


