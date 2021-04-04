import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	// static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "D:\\ProgramData\\projects\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com"); // URL in the browser to be opened
//		driver.findElement(By.id("email")).sendKeys("This is my First code");
//		driver.findElement(By.name("pass")).sendKeys("123456");
//		driver.findElement(By.linkText("Forgot Password?")).click();

		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		driver.findElement(By.name("login")).click();

	}

}
