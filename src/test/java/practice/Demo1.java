package practice;


	import java.util.Arrays;
	import java.util.Date;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Demo1 {

		public static void main(String[] args) throws Exception {
			
			Date date=new Date();
			System.out.println(date);
			String arr[]=String.valueOf(date).split(" ");
			String actdate=arr[2]+" "+arr[1]+" "+arr[5];
			System.out.println(actdate);
			List<String> months=Arrays.asList("January","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec");
			int index=0;
			for(;index<months.size();index++) {
				if(months.get(index).contains(arr[1])) {
					break;
				}
			}
			 WebDriverManager.chromedriver().setup(); 
			 RemoteWebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			  driver.get("https://demoqa.com/automation-practice-form");
			  Thread.sleep(3000);
			
			 
			  driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
			  Thread.sleep(5000);
			  new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select"))).selectByValue("8");
			  Thread.sleep(5000);
			  new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select"))).selectByValue("2024");
			  driver.findElement(By.xpath("//div[text()="+arr[2]+"]")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\arako\\OneDrive\\Pictures\\Screenshots\\Screenshot (746).png");
			  driver.findElement(By.xpath("(//input[@name='gender'])[2]")).click();
		}

	

	

}


