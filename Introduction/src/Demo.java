import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	
				
		/*Class name= X
				X driver=new X();*/
		System.setProperty("webdriver.chrome.driver", "D:\\ProgramData\\projects\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
