package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class Plans extends UtilsCompo{
	WebDriver driver;
	public BackToPlans backplans;
	public Plans(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Buy Now']")
	WebElement ele;
	public BackToPlans plans() throws InterruptedException {
		Thread.sleep(2000);
		actionClass(0,900);
		Thread.sleep(2000);
		ele.click();
		backplans=new  BackToPlans(driver);
		return backplans;
	}

}
