package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
public Homepage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminlogo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement adminusermoreinfo;
@FindBy(xpath="(//a[@class='small-box-footer'])[7]") WebElement managenews;
@FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement managecategorybtn;
public AdminUserNewUser clickadminusermoreinfo() {
	adminusermoreinfo.click();
	return new AdminUserNewUser(driver);
}
public Managecatogery clickmanagecategory() {
	managecategorybtn.click();
	return new Managecatogery(driver);
}
public Managenews clickmanagenews() {
	managenews.click();
    return new Managenews(driver);
}
public Homepage clickadmin() {
	adminlogo.click();
	return this;
}
public Homepage clicklogout() {
	
	logout.click();
	return this;
}

	}	
