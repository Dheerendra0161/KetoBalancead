package baseComponent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectsUserRegistration.LetsBeginPage;

public class BaseCompo {
	WebDriver driver;
	public LetsBeginPage begin;

	public WebDriver browserInitilize() throws Throwable {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\global\\global.properties");
		prop.load(fis);
		String browser=prop.getProperty("Br");
		
		if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		if(browser.equalsIgnoreCase("firefox")) {
			//code here
		}
		return driver;
	}

	public static String screenShot(WebDriver driver, String testCaseName) throws IOException {
		TakesScreenshot scrshot = ((TakesScreenshot) (driver));
		File srce = scrshot.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reportsScreenshot//" + testCaseName + ".png");
		FileUtils.copyFile(srce, file);
		return System.getProperty("user.dir") + "//reportsScreenshot//" + testCaseName + ".png";
	}

	@BeforeTest
	public LetsBeginPage landingPage() throws Throwable {
		driver = browserInitilize();
		driver.get("https://ketobalanced.com/");
		begin = new LetsBeginPage(driver);
		return begin;
	}

	@AfterTest
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();

	}
}
