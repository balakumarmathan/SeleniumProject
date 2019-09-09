package WadrobesTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import Wardrobes.LoginObject;

public class LoginTests { 

	LoginObject login;

	public LoginTests() {

		login = new LoginObject();
	}

	@Test
	public void verifyLogin() {
		login.clickLogin();
		login.loginToApp("mbala_kumar@yahoo.com", "Bala2@19");
		Assert.assertTrue(login.getMyaccount().isDisplayed());
	}

}
