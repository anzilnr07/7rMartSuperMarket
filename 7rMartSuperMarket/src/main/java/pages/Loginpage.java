package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Waitutility;

public class Loginpage {
public Waitutility wait;
	public WebDriver driver;
public Loginpage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@type='text']") WebElement username;
@FindBy(xpath="//input[@type='password']") WebElement password;
@FindBy(xpath="//button[@type='submit']") WebElement signin;
@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;

public boolean isdashboardisdisplayed() { 
	return dashboard.isDisplayed();
	
}


public Loginpage enterusernameandpassword(String usernamefield,String passwordfield) {
username.sendKeys(usernamefield);
password.sendKeys(passwordfield);
return this;
}
public Homepage clicksignin() {
	signin.click();
	return new Homepage(driver);
}
	}	
