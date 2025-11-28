package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.Managecatogery;
import utilities.Excelutility;

public class Managecatogerytest extends Base {
    public Homepage home;
    public Managecatogery manageCategory;
    @Test(priority=9,description = "Ctaegory managed")
   // @Parameters({"username", "password"})
    public void createuserinfo() throws AWTException, IOException {
        Loginpage signin = new Loginpage(driver);
        String usernam=Excelutility.getStringData(1, 0, "Sheet1");
		 String pasword=Excelutility.getStringData(1, 1, "Sheet1");
        signin.enterusernameandpassword(usernam, pasword);
        home = signin.clicksignin();
        
        // Navigate to manage category

        manageCategory=home.clickmanagecategory();
        manageCategory.clickmanagecategorynew();
        manageCategory.categoryentry();
        manageCategory.uploadphoto(); // Upload file using Robot class
        manageCategory.save();
    }
}