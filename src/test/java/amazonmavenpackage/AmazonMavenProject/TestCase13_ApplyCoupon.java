package amazonmavenpackage.AmazonMavenProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerLogic.class)
public class TestCase13_ApplyCoupon extends BaseClass{
		
	@Test
	//(retryAnalyzer=retryFailedTestCase.class)
	public void ApplyCoupons()
	{
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver(driver);
		homepage.homepagesignin();
		
		LoginPage login=new LoginPage(driver);
		login.username(ExcelSheet.username);
		login.continuebtnclick();
		login.password(ExcelSheet.password);
		login.signinBtnClick(driver);
		
		homepage.searchProduct2();
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		Couponspage cp=new Couponspage(driver);
		//cp.couponTag();
		cp.coupon();
	}
}
