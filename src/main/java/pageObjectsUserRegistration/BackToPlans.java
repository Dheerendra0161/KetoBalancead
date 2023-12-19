package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class BackToPlans extends UtilsCompo {
	WebDriver driver;
	public GotIt gotit;
	public BackToPlans(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
     
	}
	@FindBy(xpath="//button/i")	
    WebElement ele;
	public GotIt backToPlans() {
		ele.click();
		gotit= new GotIt(driver);
		return gotit;
	}

}
