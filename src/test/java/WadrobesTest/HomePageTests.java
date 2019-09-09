package WadrobesTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import Wardrobes.HomePageObject;

public class HomePageTests {
	
	HomePageObject hpt;
	
	public HomePageTests() {
		hpt = new HomePageObject();		
		}

	@Test
	private void verifyObjectWomen() {		
		hpt.clickWomen();
		Assert.assertTrue(hpt.WomenPage().isDisplayed());
	}
	
	@Test
	private void verifyObjectDresses() {		
		hpt.clickDresses();
		Assert.assertTrue(hpt.DressPage().isDisplayed());
	}
	
	@Test
	private void verifyObjectTShirts() {		
		hpt.clickTShirts();
		Assert.assertTrue(hpt.TShirtPage().isDisplayed());
	}
	
}
