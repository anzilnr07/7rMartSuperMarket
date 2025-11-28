package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.constant;
import pages.Homepage;
import pages.Loginpage;
import utilities.Excelutility;
//import utilities.Excelutility;

public class LoginPagetest extends Base {
	Homepage home;
	 @Test(priority=4)
		 // @Parameters({"username","password"})
		  public void verifyvalidusernamsandpassword() throws IOException {
		 Loginpage signin =new Loginpage(driver);
		String usernam=Excelutility.getStringData(1, 0, "Sheet1");
		 String pasword=Excelutility.getStringData(1, 1, "Sheet1");
		  signin.enterusernameandpassword(usernam,pasword);
		  home =signin.clicksignin();
		  boolean dashboardisdisplayed=signin.isdashboardisdisplayed();
		  Assert.assertTrue(dashboardisdisplayed,constant.ERRORMESSAGE1);
		  }
	@Test(dataProvider = "Credentials", priority = 1)
	 public void invalidUsernameAndinvalidpassword(String username,String password) {
	  Loginpage signin= new Loginpage(driver);
	  signin.enterusernameandpassword(username,password);
	  signin.clicksignin(); 
	  }
	 @Test(priority=2)
		 public void validUsernameAndinvalidpassword() {
		  Loginpage signin= new Loginpage(driver);
		  signin.enterusernameandpassword("admin", "1111");
		  signin.clicksignin(); 
		  }
	 @Test(priority=3)
	  public void invalidusernameandvalidpassword() {
		  Loginpage signin=new Loginpage(driver);
		  signin.enterusernameandpassword("admi","admin");
		  signin.clicksignin();
		  
	  }
	  
	  @DataProvider(name="Credentials")
	  public Object[][] testdata(){
	  Object data[][]= {{"admins","admin0"}};
	 return data;
	 }
	  
	}


