package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class GotIt extends UtilsCompo {
	WebDriver driver;
	public GotIt(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Got It!")
	WebElement ele;
	public void gotIt() {
		ele.click();
	}
	

}
