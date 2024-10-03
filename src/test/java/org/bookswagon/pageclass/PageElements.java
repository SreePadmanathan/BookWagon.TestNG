package org.bookswagon.pageclass;

import org.bookswagon.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageElements extends BaseClass {

	public PageElements() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_lblUser']")
	private WebElement myAccountClick;

	public void getMyAccountClick() {
		myAccountClick.click();
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
	private WebElement userName;

	public WebElement getuserName() {
		return userName;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(how = How.XPATH, using = "//a[@id='ctl00_phBody_SignIn_btnLogin']")
	private WebElement loginClick;

	public void getloginclick() {
		loginClick.click();
	}

	@FindBy(how = How.XPATH, using = "//img[@id='ctl00_imglogo']")
	private WebElement homepageClick;

	public void getHomePageClick() {
		homepageClick.click();
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Fiction Books')]")
	private WebElement fictionTabClick;

	public void getFictionTabClick() {
		fictionTabClick.click();

	}
	
	@FindBy(xpath="//div[@class='text-center position-relative blackhover']//img[@alt='It Ends with Us']")
	private WebElement fictionbook1Click;

	public WebElement getFictionBook1Click() {
		return fictionbook1Click;

	}
	
	@FindBy(xpath="//a[@data-id='21884796']")
	WebElement fictionbook2Click;
	public WebElement getFictionbook2Click() {
		return fictionbook2Click;
	}
	
	@FindBy(xpath="//a[text()='Add To Cart']")
	WebElement quickViewAddtocart;
	public WebElement getquickViewAddtocart() {
		return quickViewAddtocart;
	}
	
	@FindBy(how = How.XPATH, using = "//a[@id='btnAddtocart']")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@FindBy(how = How.XPATH,using ="//label[@id='ctl00_lblTotalCartItems']")
	private WebElement cartButton;
	
	public WebElement getCartButton() {
		return cartButton;
	}
	
	@FindBy(how = How.XPATH,using ="//input[@id='ctl00_phBody_BookCart_lvCart_imgPayment']")
	private WebElement buyButton;
	
	public WebElement getBuyButton() {
		return buyButton;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_txtNewRecipientName']")
	WebElement reciptName;
	public WebElement getRecipentName() {
		return reciptName;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_txtNewCompanyName']")
	WebElement companyName;
	public WebElement getCompanyName() {
		return companyName;
	}
	
	@FindBy(xpath="//textarea[@id='ctl00_cpBody_txtNewAddress']")
	WebElement strAddress;
	public WebElement getStreetAddress() {
		return strAddress;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_txtNewLandmark']")
	WebElement landmark;
	public WebElement getLandMark() {
		return landmark;
	}
	
	@FindBy(xpath="//select[@id='ctl00_cpBody_ddlNewCountry']")
	WebElement country;
	public WebElement getCountrySelect() {
		return country;
	}
	
	@FindBy(xpath="//select[@id='ctl00_cpBody_ddlNewState']")
	WebElement state;
	public WebElement getSelectState() {
		return state;
	}
	
	@FindBy(xpath="//select[@id='ctl00_cpBody_ddlNewCities']")
	WebElement city;
	public WebElement getSelectCity() {
		return city;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_txtNewPincode']")
	WebElement pinCode;
	public WebElement getPinCode() {
		return pinCode;
	}

	@FindBy(xpath="//input[@id='ctl00_cpBody_txtNewMobile']")
	WebElement mobileNum;
	public WebElement getMobileNum() {
		return mobileNum;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_txtNewPhone']")
	WebElement phNum;
	public WebElement getPhoneNum() {
		return phNum;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_chkNewDefault']")
	WebElement defaultVheckBtn;
	public WebElement clickDefaultCheckBtn() {
		return defaultVheckBtn;
	}
	
	
	@FindBy(xpath="//input[@name='ctl00$cpBody$chkUseAddress']")
	WebElement billingCheckBtn;
	public WebElement clickBillingCheckBtn() {
		return billingCheckBtn;
	}
	
	
	@FindBy(xpath="//input[@id='ctl00_cpBody_imgSaveNew']")
	WebElement saveContinue;;
	public WebElement clickSaveContinue() {
		return saveContinue;
	}
	@FindBy(xpath="//img[@id='ctl00_imglogo']")
	WebElement logo;
	public WebElement clickLogo() {
		return logo;
	}
	
	@FindBy(xpath="//span[@class='usernametext']")
	WebElement userNameTxt;
	public WebElement getUserNameTxt() {
		return userNameTxt;
	}
	
	@FindBy(xpath="//a[@id='ctl00_lnkbtnLogout']")
	WebElement logoutBtn;
	public WebElement clickLogout() {
		return logoutBtn;
	}


	
	
	
	
	
	
	
	

}
