package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase4_EditProfile extends BaseClass{
	@Test(retryAnalyzer=retryFailedTestCase.class)
	public void editProfile()
	{
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver(driver);
		homepage.homepagesignin();
		
		LoginPage login=new LoginPage(driver);
		login.username(ExcelSheet.password);
		login.continuebtnclick();
		login.password(ExcelSheet.password);
		login.signinBtnClick(driver);
		homepage.hoverOver(driver);
		
		YourAccountPage youraccountpage=new YourAccountPage(driver);
		youraccountpage.yourAccountTextClick();
		youraccountpage.yourAddressesBoxClick();
		youraccountpage.editAddress();
		youraccountpage.editAlldetails();
		youraccountpage.updateDetails();
		
	}
}
