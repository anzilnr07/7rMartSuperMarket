package testscript;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pages.Homepage;
import pages.Loginpage;

public class Homepagetest extends Base {
	public Homepage home;
	 @Test(priority=5)
  @Parameters({"username","password"})
  public void verifylogout(String username,String password) {
	  Loginpage signin= new Loginpage(driver);
	  signin.enterusernameandpassword(username, password);
	  home= signin.clicksignin();
	  home.clickadmin().clicklogout();
	 // signin.clicksignin();
	  //Homepage signout =new Homepage(driver);
	 // signout.clickadmin();
	 //signout.clicklogout();
	  String expected=" Login | 7rmart supermarket ";
	  String actual=driver.getCurrentUrl();
	  Assert.assertEquals(expected, actual,"Logout failed");
  }
}
