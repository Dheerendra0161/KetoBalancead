package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class ChooseBodyType extends UtilsCompo{
	WebDriver driver;
	 public WantToAchieve achieve;
	public ChooseBodyType(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Cut']")
	 WebElement ele;
	public WantToAchieve choseBodyType() {
		ele.click();
		achieve=new  WantToAchieve (driver);
		return achieve;
	}

}
