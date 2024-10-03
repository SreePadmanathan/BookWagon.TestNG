package org.bookswagon.testclass;

import java.io.IOException;

import org.bookswagon.baseclass.BaseClass;
import org.bookswagon.pageclass.PageElements;
import org.testng.annotations.*;

import org.openqa.selenium.WebElement;

public class TestClass {

	static BaseClass baseClass = new BaseClass();
	
	static PageElements pageelements;

	
@Test
	public static void tc01() throws IOException, InterruptedException {

		baseClass.getDriver(baseClass.excelRead(1, 1));
		baseClass.getUrl(baseClass.excelRead(1, 2));
		
		baseClass.excelReport(1, 3, "Browser and Url Launched Succeessfully");

		baseClass.windowMax();
		Thread.sleep(2000);
		
		 pageelements = new PageElements();
	}

	//PageElements pageelements = new PageElements();

	@Test
	public void tc02() throws IOException, InterruptedException {
		pageelements.getMyAccountClick();

		WebElement getuserName = pageelements.getuserName();
		baseClass.sendKeysByJava(getuserName, baseClass.excelRead(2, 1));

		WebElement getpassword = pageelements.getpassword();
		baseClass.sendKeysByJava(getpassword, baseClass.excelRead(2, 2));

		pageelements.getloginclick();
		
		baseClass.excelReport(2, 3, "Login Successful");

		pageelements.getHomePageClick();

		pageelements.getFictionTabClick();

		WebElement fictionBook1Click = pageelements.getFictionBook1Click();
		baseClass.clickByJS(fictionBook1Click);

		WebElement addToCart = pageelements.getAddToCart();
		baseClass.clickByJS(addToCart);
		
		pageelements.getFictionTabClick();
		
		WebElement fictionbook2Click = pageelements.getFictionbook2Click();
		baseClass.clickByJS(fictionbook2Click);
		
		WebElement addToCart1 = pageelements.getquickViewAddtocart();
		baseClass.clickByJS(addToCart1);
		
		WebElement cartButton = pageelements.getCartButton();
		baseClass.clickByJS(cartButton);
		
		WebElement buyButton = pageelements.getBuyButton();
		baseClass.clickByJS(buyButton);
		
		WebElement recipentName = pageelements.getRecipentName();
		baseClass.sendKeysByJava(recipentName, baseClass.excelRead(3, 1));
		
		WebElement companyName = pageelements.getCompanyName();
		baseClass.sendKeysByJava(companyName, baseClass.excelRead(4, 1));
		
		WebElement streetAddress = pageelements.getStreetAddress();
		baseClass.sendKeysByJava(streetAddress, baseClass.excelRead(5, 1));
		
		WebElement landMark = pageelements.getLandMark();
		baseClass.sendKeysByJava(landMark, baseClass.excelRead(6, 1));
		
		WebElement countrySelect = pageelements.getCountrySelect();
		baseClass.sendKeysByJava(countrySelect, baseClass.excelRead(7, 1));
		Thread.sleep(2000);
		WebElement selectState = pageelements.getSelectState();
		baseClass.sendKeysByJava(selectState, baseClass.excelRead(8, 1));
		
		WebElement selectCity = pageelements.getSelectCity();
		baseClass.sendKeysByJava(selectCity, baseClass.excelRead(9, 1));
		
		WebElement pinCode = pageelements.getPinCode();
		baseClass.sendKeysByJava(pinCode, baseClass.excelRead(10, 1));
		
		WebElement mobileNum = pageelements.getMobileNum();
		baseClass.sendKeysByJava(mobileNum, baseClass.excelRead(11, 1));
		
		WebElement phoneNum = pageelements.getPhoneNum();
		baseClass.sendKeysByJava(phoneNum, baseClass.excelRead(12, 1));
		
		WebElement clickDefaultCheckBtn = pageelements.clickDefaultCheckBtn();
		baseClass.clickByJS(clickDefaultCheckBtn);
		
		WebElement clickBillingCheckBtn = pageelements.clickBillingCheckBtn();
		baseClass.clickByJS(clickBillingCheckBtn);
		
		WebElement clickSaveContinue = pageelements.clickSaveContinue();
		baseClass.clickByJS(clickSaveContinue);

		WebElement clickLogo = pageelements.clickLogo();
		baseClass.clickByJS(clickLogo);

		WebElement userNameTxt = pageelements.getUserNameTxt();
		baseClass.moveToCursor(userNameTxt);

		WebElement clickLogout = pageelements.clickLogout();
		baseClass.clickByJS(clickLogout);
		
		baseClass.excelReport(3, 3, "Logout Successfull");

		Thread.sleep(2000);
		baseClass.quit();
		
	}
}
