package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class EnterYourEmail extends UtilsCompo {
	WebDriver driver;
	public Plans plns;
	public EnterYourEmail(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(id="mail-value")
    WebElement eleSend;
    @FindBy(xpath="//a[text()='Continue']")
    WebElement ele;
	public Plans enterYourEmail() {
	eleSend.sendKeys("xyz2015@yopmail.com");
	ele.click();
	plns=new Plans(driver);
	return plns;
	}

}
