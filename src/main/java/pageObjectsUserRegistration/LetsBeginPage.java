package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class LetsBeginPage extends UtilsCompo {
	WebDriver driver;
	public CountrySelectionPage country;
	
	public LetsBeginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='mn-btn']")
	WebElement ele;
	public CountrySelectionPage letsBegin() {
		ele.click();
	    country=new CountrySelectionPage(driver);
	    return country;
		
	}

}
