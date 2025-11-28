package testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Editcontactus_managecontact;
import pages.Loginpage;

public class Editcontactus_managecontact_test extends Base {
  @Test(priority=7)
  @Parameters({"username","password"})
  public void Editcontactus_managecontact(String username,String password) {
	  Loginpage signin= new Loginpage(driver);
	  signin.enterusernameandpassword(username,password);
	  signin.clicksignin();
	  Editcontactus_managecontact manageinfo =new Editcontactus_managecontact(driver);
	  manageinfo.clickmanagecontact();
	  manageinfo.contactusinfo();
	  manageinfo.contactinfoeditdetails();
	  manageinfo.contactinfoupdatebutton();
  }
}
