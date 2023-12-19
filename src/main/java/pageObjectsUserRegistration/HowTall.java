package pageObjectsUserRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsPackage.UtilsCompo;

public class HowTall extends UtilsCompo {
	WebDriver driver;
	public  CurrentWeight currntwgt;
	public HowTall (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="height_cm_id")
	WebElement eleSend;
	public CurrentWeight howTall() {
		eleSend.sendKeys("185");
		driver.findElement(By.id("continue")).click();
		currntwgt=new  CurrentWeight(driver);
		return currntwgt;
	}

}
