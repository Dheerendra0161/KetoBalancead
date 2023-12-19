package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class MultipleAnswers extends UtilsCompo {
	WebDriver driver;
	public ShedSomeExtraWeight weight;
	public MultipleAnswers(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='625400108c1d51ca9bf5f623']")
	WebElement ele;
	@FindBy(linkText="Continue")
	WebElement ele2;
	
	public ShedSomeExtraWeight multipleAnswers() throws Throwable {
		ele.click();
		ele2.click();
		weight=new ShedSomeExtraWeight(driver);
		return weight;
		
		
	}

}
