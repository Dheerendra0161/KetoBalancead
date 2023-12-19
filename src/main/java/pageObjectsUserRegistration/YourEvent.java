package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class YourEvent extends UtilsCompo {
	WebDriver driver;
	public NeedToGetInShape shape;
	public  YourEvent(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='form-control']")
	WebElement eleSend;
	@FindBy(id="continue")
	WebElement ele;
	public NeedToGetInShape yourEvent() {
		eleSend.sendKeys("16/02/2024");
		ele.click();
		shape=new NeedToGetInShape(driver);
		return shape;
	}
}
