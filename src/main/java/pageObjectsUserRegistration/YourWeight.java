package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class YourWeight extends UtilsCompo {
	WebDriver driver;
	public EnterYourEmail mail;
	public YourWeight(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=' Continue']")
	WebElement ele;
	public EnterYourEmail yourWeight() {
		ele.click();
		mail=new EnterYourEmail(driver);
		return mail;
		
	}

}
