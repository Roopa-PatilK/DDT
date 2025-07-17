package amazonmavenpackage.AmazonMavenProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerLogic.class)
public class TestCase12_SelectEachPaymentMethod extends BaseClass{
	
	@Test(retryAnalyzer=retryFailedTestCase.class)
	public void selectEachPaymentMethod() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.hoverOver(driver);
		homepage.homepagesignin();
		
		LoginPage login=new LoginPage(driver);
		login.username(ExcelSheet.username);
		login.continuebtnclick();
		login.password(ExcelSheet.password);;
		login.signinBtnClick(driver);
		
		homepage.searchProduct();
		
		SearchResultPage searchresult=new SearchResultPage(driver);
		searchresult.firstProductClick();
		
		AddToCartPage addtocart=new AddToCartPage(driver);
		addtocart.addToCartClick();
		addtocart.proceedToBuyBtn();
		
		PaymentPage paymentpage=new PaymentPage(driver);
		paymentpage.verifysecureCheckouttext();
		paymentpage.amazonPaybalancecheck();
		Thread.sleep(2000);
		paymentpage.amazonPaycheck();
		Thread.sleep(2000);
		paymentpage.debitAndCreditcardcheck();
		Thread.sleep(2000);
		paymentpage.newBankingcheck();
		Thread.sleep(2000);
		paymentpage.upiAppscheck();
		Thread.sleep(2000);
		paymentpage.emicheck();
		Thread.sleep(2000);
		paymentpage.cashOnDeliverycheck();
		
	}

}
