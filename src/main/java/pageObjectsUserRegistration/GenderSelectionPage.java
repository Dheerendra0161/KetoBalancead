package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;
  
public class GenderSelectionPage extends UtilsCompo {
	   WebDriver driver;
	   public BodyType body;
	public GenderSelectionPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Men']")
	WebElement ele;
	public BodyType genderSelction() {
		ele.click();
		 body=new BodyType(driver);
		 return body;
		
	}

}
