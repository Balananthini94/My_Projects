package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassMaplogik {
	public static WebDriver driver = new ChromeDriver();
	public void depChrome() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver",
			//"C:\\Users\\nanth\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	driver.manage().window().maximize();

	
	driver.get("https://www.maplogik.com/index.php/admin/login");
	}

}


