package FirstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {
	
	static WebDriver driver;
	
	@Test
	public void Testrunn() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://myassignmenthelp.com/");
		driver.manage().window().maximize();
	}

}
