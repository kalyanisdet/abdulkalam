package JavaPrograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		//Collect all elements in pagesource.
		List<WebElement> allElements=driver.findElements(By.xpath("//*"));
		//System.out.println("All elements size of amazon page:"+allElements.size());
		int TotalElements=allElements.size();
		int nohrefelements=0;
		int localpagelinks=0;
		int correctlinks=0;
		int brokenlinks=0;
		int linkswithexception=0;
		
		//Take each element
		
		for(WebElement allEle:allElements) {
			//Check "href" attribute availale or not
			String hrefpath;
			if((hrefpath=allEle.getAttribute("href"))!=null) {
				//2. Check that attribute value starts with "http/https"
				if(hrefpath.startsWith("https")||hrefpath.equals("http")) {
					try {
						//3. Check link href address is working /not.
						URL u=new URL(hrefpath);
						HttpURLConnection con=(HttpURLConnection) u.openConnection();
						con.connect();
						
						if(con.getResponseCode()==200) {
							correctlinks++;
						}
						else {
							brokenlinks++;
							System.out.println(hrefpath+ " is broken link due to "+con.getResponseMessage());
							
						}
					}
					catch(Exception ex) {
						linkswithexception++;
						System.out.println(hrefpath+"is raised"+ex.getMessage());
						
					}
				}
				else {
					localpagelinks++;
				}
			}
		
			else {
				nohrefelements++;
			}

	}
		System.out.println("Total elements are:"+allElements);
		System.out.println("Elements without href are:"+nohrefelements);
		System.out.println("Total links are" +(TotalElements-nohrefelements));
		System.out.println("Local page links are:"+localpagelinks);
		System.out.println("Correctly working links are:"+correctlinks);
		System.out.println("Broken links are"+brokenlinks);
		System.out.println("Links  raised exceptions are:"+linkswithexception);
		
	}
}
