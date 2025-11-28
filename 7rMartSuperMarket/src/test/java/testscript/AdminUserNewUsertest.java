package testscript;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AdminUserNewUser;
import pages.Homepage;
import pages.Loginpage;
import utilities.FakerUtility;
import constants.constant;
public class AdminUserNewUsertest extends Base {
	FakerUtility fake =new FakerUtility();
	public Homepage home;
	public AdminUserNewUser admin;
	 @Test(priority=6)
  @Parameters({"username","password"})
  public void createuserinfo(String username,String password) {
	  Loginpage signin= new Loginpage(driver);
	  signin.enterusernameandpassword(username,password);
	  home =signin.clicksignin();
	  admin=home.clickadminusermoreinfo();
	  String new_username=fake.getUsername();
	  String new_password=fake.getPassword();
	  admin.clickusermoreinfonew().usermoreinfonewenterdetails(new_username,new_password).usermoreinfonewtypeselect().usermoreinfosave();
	  boolean usercreate=admin.isusercreated();
	  Assert.assertTrue(usercreate);
	  String expected = "            User Created Succesfully        ";
	  String actual = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
	  Assert.assertEquals(expected, actual,"Not created");
	  //signin.clicksignin();
	 // AdminUserNewUser newusr=new AdminUserNewUser(driver);
	 // newusr.clickusermoreinfonew();
	 // newusr.usermoreinfonewenterdetails();
	 // newusr.usermoreinfonewtype();
	 // newusr.usermoreinfonewtypeselect();
	  //newusr.usermoreinfosave();
	  
  }
}
