package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Pageutility;

public class AdminUserNewUser {
	public WebDriver driver;
	public Pageutility newpageutility;
public AdminUserNewUser(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
@FindBy(xpath="(//input[@type='text'])[2]") WebElement username1;
@FindBy(xpath="//input[@type='password']") WebElement  password2;
@FindBy(xpath="//select[@id='user_type']") WebElement  usertype;
@FindBy(xpath="(//option[@value='admin'])[2]") WebElement admin ;
@FindBy(xpath="//button[@name='Create']") WebElement save ;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement usercreated ;
public boolean isusercreated() {
	return usercreated.isDisplayed();
}
public AdminUserNewUser clickusermoreinfonew() {
	newbutton.click();
	return this;
}
public AdminUserNewUser usermoreinfonewenterdetails(String username,String password) {
	username1.sendKeys(username);
	password2.sendKeys(password);
	return this;
}
//public AdminUserNewUser usermoreinfonewtype() {
	//usertype.click();
	//Select dropdown =new Select(admin);
	//dropdown.selectByVisibleText("Admin");
	//newpageutility.selectByvisibletext(admin, "Admin");
//	return this;
//}
public AdminUserNewUser usermoreinfonewtypeselect() {
	
	admin.click();
	return this;
}
public AdminUserNewUser usermoreinfosave() {
	
	save.click();
	return this;
}
	}	