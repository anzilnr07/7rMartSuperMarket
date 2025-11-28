package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Managenews {
	public WebDriver driver;
	public Managenews(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		}
	;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newnews;
	@FindBy(xpath="//textarea[@id='news']") WebElement newstype;
	@FindBy(xpath="//button[@type='submit']") WebElement savenews;

	public Managenews clicknewnews() {
		newnews.click();
		return this;
	
	}
	public Managenews typenews() {
		
		newstype.sendKeys("Good news");
		return this;
	}
public Managenews savenews() {
		
	savenews.click();
	return this;
	}


}




