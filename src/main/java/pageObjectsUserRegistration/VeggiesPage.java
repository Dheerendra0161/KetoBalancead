package pageObjectsUserRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class VeggiesPage extends UtilsCompo {
	WebDriver driver;
	public OtherFoodItems item;
	
	public VeggiesPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='6253fe5a8c1d51ca9bf5f605']")
	WebElement ele1;
	@FindBy(xpath="//*[@id='6253fee38c1d51ca9bf5f60a']")
	WebElement ele2;
	@FindBy(xpath="//*[@id='6253fee88c1d51ca9bf5f60c']")
	WebElement ele3;
	@FindBy(linkText="Continue")
	WebElement ele4;
	public OtherFoodItems veggiesPage() throws InterruptedException {
		ele1.click();
		actionClass(0,700);
		Thread.sleep(2000);
		ele2.click();
		ele3.click();
		ele4.click();
		item= new OtherFoodItems(driver);
		return item;
	}

}
