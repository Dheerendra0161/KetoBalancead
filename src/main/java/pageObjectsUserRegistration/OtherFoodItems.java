package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class OtherFoodItems extends UtilsCompo {
	WebDriver driver;
	public  HowActive active;
	public OtherFoodItems(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='6253ff4a8c1d51ca9bf5f617']")
	WebElement ele1;
	@FindBy(xpath="//*[@id='6253ff548c1d51ca9bf5f61a']")
	WebElement ele2;
	@FindBy(xpath="//*[@id='6253ff588c1d51ca9bf5f61b']")
	WebElement ele3;
	@FindBy(linkText="Continue")
	WebElement ele4;
	public HowActive otherFoodItems() throws Throwable {
		ele1.click();
		actionClass(0,600);
		Thread.sleep(2000);
		ele2.click();
		ele3.click();
		ele4.click();
		active=new  HowActive(driver);
		return active;
	}
}
