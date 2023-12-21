package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class CountrySelectionPage extends UtilsCompo {
	WebDriver driver;
	public GenderSelectionPage gender;
	public CountrySelectionPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@alt='usa']")
	 WebElement ele1;
	public GenderSelectionPage countrySelection() {
		ele1.click();
	    gender= new GenderSelectionPage(driver);
	    return gender;
	}
}
