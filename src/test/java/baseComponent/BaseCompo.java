package baseComponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectsUserRegistration.LetsBeginPage;

public class BaseCompo {
	WebDriver driver;
	public LetsBeginPage begin;

	public WebDriver browserInitilize() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
	}
	@BeforeTest
	public  LetsBeginPage landingPage() {
		driver=browserInitilize();
		driver.get("https://ketobalanced.com/");
		begin = new LetsBeginPage(driver);
		return begin;
	}
}
