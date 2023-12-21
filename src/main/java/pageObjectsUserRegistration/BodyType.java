package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class BodyType extends UtilsCompo {
	public ChooseBodyType bodytype;
	WebDriver driver;

	public BodyType(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Extra']")
	WebElement ele;

	public ChooseBodyType bodyType() {
		ele.click();
		bodytype = new ChooseBodyType(driver);
		return bodytype;
	}

}
