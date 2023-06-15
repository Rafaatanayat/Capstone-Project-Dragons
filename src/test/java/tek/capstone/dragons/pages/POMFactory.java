package tek.capstone.dragons.pages;

import tek.capstone.dragons.base.BaseSetup;

public class POMFactory extends BaseSetup{
	
	private RetailHomePage homePage;
	private RetailSignInPage loginPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage retailOrder;
	
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.loginPage = new RetailSignInPage(); 
		this.accountPage = new RetailAccountPage();
		this.retailOrder = new RetailOrderPage();
		
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	public RetailSignInPage signInPage() {
		return this.loginPage;
	}
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	public RetailOrderPage retailOrder() {
		return this.retailOrder;
	}
	

}
