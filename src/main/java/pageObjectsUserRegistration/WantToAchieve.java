package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class WantToAchieve extends UtilsCompo{
	WebDriver driver;
	public TargetZones zones;
	public WantToAchieve(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Loose weight")
	WebElement ele1;
	@FindBy(linkText="Boost brain power")
	WebElement ele2;
	@FindBy(linkText="Improve bone health")
	WebElement ele3;
	@FindBy(linkText="Yes, I Got it")
	WebElement ele4;
	@FindBy(linkText="Continue")
	WebElement ele5;
	public TargetZones wantToAchieve() {
		ele1.click();
		ele2.click();
		actionClass(0,1000);
		ele3.click();
		ele4.click();
		ele5.click();
		zones=new TargetZones(driver);
		return zones;
	}

}
