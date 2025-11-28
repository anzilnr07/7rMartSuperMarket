package testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.Managenews;

public class Managenewstest extends Base {
	Homepage home;
	Managenews mngnews;
  @Test(priority=8)
  @Parameters({"username","password"})
  public void updatenews(String username,String password) {
	  Loginpage signin= new Loginpage(driver);
	  signin.enterusernameandpassword(username, password);
	  home=signin.clicksignin();
	  mngnews=home.clickmanagenews();
	  mngnews.clicknewnews().typenews().savenews();
	  
	

  }
}
