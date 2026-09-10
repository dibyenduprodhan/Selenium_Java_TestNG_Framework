package TestCases;

import org.testng.annotations.Test;

import BaseTestcases.BaseTest;
import PageObject.LoginPage;

public class loginPageTest extends BaseTest {
	//create ref of LoginPage objectclass
	LoginPage lp;
	@Test
	void loginFunctionTest() {
		lp=new LoginPage(driver);
		//enter username using config
		lp.enterUsername(config.username());
		//enter password using config
		lp.enterPassword(config.password());
		//click login option
		lp.clickLogin();
		
		System.out.println("Dibyendu is your nmae");
	}
}
