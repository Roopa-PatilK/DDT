package amazonmavenpackage.AmazonMavenProject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(ITestListenerLogic.class)
public class TestCase3_LoginwithIncorrectCredentials extends BaseClass{
	
	@Test(retryAnalyzer=retryFailedTestCase.class)

	public void Launch()
	{
		LoginPage login=new LoginPage(driver);
		login.username(ExcelSheet.password);
		login.continuebtnclick();
		login.wrongpassword();
		login.signinBtnClick1(driver);
		
	
	}
}
