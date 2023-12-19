package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class TargetZones extends UtilsCompo {
	WebDriver driver;
	public LastHappy happy;
	public TargetZones(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='achv']/a[3]/span")
	WebElement ele1;
	@FindBy(xpath="//*[@id='achv']/a[4]/span")
	WebElement ele2;
	@FindBy(linkText="Continue")
	WebElement ele3;
	public LastHappy targetZones() {
		ele1.click();
		ele2.click();
		actionClass(0,500);
		ele3.click();
		happy=new LastHappy(driver);
		return happy;
	}

}
