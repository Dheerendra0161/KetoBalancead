package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class ShedSomeExtraWeight extends UtilsCompo {
	WebDriver driver;
	public HowTall tall;
	public ShedSomeExtraWeight(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="I'm serious about losing as much weight as possible")
	WebElement ele;
	public HowTall shedSomeExtraWeight() {
		ele.click();
	    tall= new HowTall(driver);
	    return tall;
	}

}
