import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	
				
		/*Class name= X
				X driver=new X();*/
		System.setProperty("webdriver.chrome.driver", "D:\\ProgramData\\projects\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");     // hit URL in the browser is correct
		System.out.println(driver.getTitle()); //Validate if page title is correct
		
		System.out.println(driver.getCurrentUrl());		//Validate if you are landed on correct URL
		
		//System.out.println(driver.getPageSource());          // Print page source
		
		driver.get("http://yahoo.com");
	   // driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
	}

}
