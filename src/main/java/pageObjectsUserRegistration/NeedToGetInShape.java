package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class NeedToGetInShape extends UtilsCompo {
	WebDriver driver;
	public YourWeight yourweight;
	public NeedToGetInShape(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="continue")
	WebElement ele;
	public YourWeight needToGetInShape() {
		ele.click();
		yourweight= new YourWeight(driver);
		return yourweight;
		
	}

}
