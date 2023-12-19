package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class OccasionYouWantToLoseWeight extends UtilsCompo {
	WebDriver driver ;
	public YourEvent event;
	public OccasionYouWantToLoseWeight(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Family occasion")
	WebElement ele;
	public YourEvent occasionYouWantToLoseWeight() {
		actionClass(0,800);
		ele.click();
		event=new YourEvent(driver);
		return event;
	}
}
