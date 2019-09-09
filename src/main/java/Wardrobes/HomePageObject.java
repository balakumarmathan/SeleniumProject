package Wardrobes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[1]/a")
	private WebElement tabWomen;
		
	public void clickWomen() {
		tabWomen.click();
	}
		
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a")
	private WebElement tabDresses;
	
	public void clickDresses() {
		tabDresses.click();
	}
	
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[1]/a")
	private WebElement tabTShirts;
	
	public void clickTShirts() {
		tabTShirts.click();
	}
	
	@FindBy(xpath = "//*[@class='navigation_page']")
	private WebElement PageWomen;

	public WebElement WomenPage() {
		return PageWomen;
	}

	@FindBy(xpath = "//div[contains(@class,'breadcrumb clearfix')]/span[2]")
	private WebElement PageDresses;

	public WebElement DressPage() {
		return PageDresses;
	}
	
	//@FindBy(xpath = "//div[contains(@class,'breadcrumb clearfix')]/span[3]")
	@FindBy (xpath = "//*[@text='T-shirts\r\n" + 
			"			']")
	private WebElement PageTshirt;

	public WebElement TShirtPage() {
		return PageTshirt;
	}
	
	
	
}