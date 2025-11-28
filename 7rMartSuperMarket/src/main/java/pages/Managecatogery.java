package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.constant;
import utilities.Fileuploadutility;
import utilities.JavaScriptExecutorUtility;
import utilities.Pageutility;
import utilities.Waitutility;

public class Managecatogery {
    public WebDriver driver;
    public Pageutility newpageutility;
    Fileuploadutility fileUploadUtilityObj= new Fileuploadutility();
    public Waitutility wait;
    public JavaScriptExecutorUtility javaexe =new JavaScriptExecutorUtility();
    public Managecatogery(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="(//a[@class='small-box-footer'])[5]") 
    WebElement managecategorybtn;
    @FindBy(xpath="//a[@onclick='click_button(1)']") 
    WebElement newbtn;
    
    @FindBy(xpath="//input[@name='category']") 
    WebElement entercategory;
    
    @FindBy(xpath="//input[@type='file']") 
    WebElement categoryupload;
    
    @FindBy(xpath="//button[@type='submit']") 
    WebElement saved;
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement categoryCreatedSuccessfullyMessage; 


    public Managecatogery clickmanagecategorypage() {
    	managecategorybtn.click();
        return this; // Return current instance, not new one
    }
    public Managecatogery clickmanagecategorynew() {
        newbtn.click();
        return this; // Return current instance, not new one
    }
    
    public void categoryentry() {
        entercategory.sendKeys("New category");
    }
   
   public Managecatogery uploadphoto() throws AWTException {
	   fileUploadUtilityObj.sendkeysforFileupload(categoryupload, constant.IMAGEPATH);
  // wait.weightforelement(driver, categoryupload);
    //fileUploadUtilityObj.sendkeysforFileupload(categoryupload, constant.IMAGEPATH);;
       return this;
	 
   }
    
    public void save() {
    // saved.click();
     javaexe.javaScriptExecutor(driver, saved);
    }
    public boolean verifyCategoryCreatedSuccessfullyMessageIsDisplayed()

    {

  	  return categoryCreatedSuccessfullyMessage.isDisplayed();

    }
}