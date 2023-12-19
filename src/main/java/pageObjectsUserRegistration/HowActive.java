package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class HowActive extends UtilsCompo{
	WebDriver driver;
	SpendYourDay day;
	public HowActive(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='6252eed193a77197d03f127f']")
	WebElement ele;
	public SpendYourDay howActive() {
		ele.click();
	    day=new SpendYourDay(driver);
	    return day;
	}

}
