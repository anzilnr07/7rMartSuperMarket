package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pageutility {
public void selectByvisibletext(WebElement element,String text) {
	Select textvalue =new Select(element);
	textvalue.selectByVisibleText(text);
}
}
