import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class facebookpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ProgramData\\projects\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("customized xpath");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("customized pass Xpath");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//System.out.println(driver.findElement(By.xpath("//a[@href='/login/identify/']")).getText());
		
		
		
	}

}
