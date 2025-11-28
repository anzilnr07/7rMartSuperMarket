package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import utilities.JavaScriptExecutorUtility;
import utilities.Waitutility;

public class Editcontactus_managecontact {
	public WebDriver driver;
	public JavaScriptExecutorUtility javaexe =new JavaScriptExecutorUtility();
 //Waitutility wait=new Waitutility();
public Editcontactus_managecontact(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//a[@class='small-box-footer'])[3]") WebElement managecontact;
@FindBy(xpath="//i[@class='fas fa-edit']") WebElement edit;
@FindBy(xpath="(//input[@type='text'])[1]") WebElement phonenum;
@FindBy(xpath="(//input[@type='text'])[2]") WebElement email;
@FindBy(xpath="//textarea[@name='address']") WebElement address;
@FindBy(xpath="//textarea[@name='del_time']") WebElement deliverytime;
@FindBy(xpath="//input[@name='del_limit']") WebElement deliverylimit;
@FindBy(xpath="//button[@name='Update']") WebElement updated;
public void clickmanagecontact() {
	managecontact.click();
}
public void contactusinfo() {
	edit.click();
}
public void contactinfoeditdetails() {
	phonenum.clear();
	phonenum.sendKeys("+91 8856239635");
	email.clear();
	email.sendKeys("Anzil");
	address.clear();
	address.sendKeys("Trivandrum");
	deliverytime.clear();
	deliverytime.sendKeys("6");
	deliverylimit.clear();
	deliverylimit.sendKeys("60");
	
}
public void contactinfoupdatebutton() {
	//wait.weightforelement(driver, updated);
	javaexe.javaScriptExecutor(driver, updated);
}




	}	