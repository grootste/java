import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		System.setProperty("webdriver.edge.driver","D:\\ProgramData\\projects\\java\\msedgedriver.exe ");
		WebDriver driver=new EdgeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		

	}

}
