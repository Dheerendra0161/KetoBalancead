package utilsPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilsCompo {
	WebDriver driver;
	
	public UtilsCompo(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
	public WebElement waitElement(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		return ele;
		
	}
	public Actions actionClass(int x,int y) {
		Actions action = new Actions(driver);
		action.scrollByAmount(x, y).build().perform();
		return action;
	}

	}


