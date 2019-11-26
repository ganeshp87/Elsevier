package com.elsevier.qe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static com.elsevier.qe.util.WebelementConstant.*;
import com.elsevier.qe.base.TestBase;

public class ShoppingCartSummaryPageObjects extends TestBase {

	@FindBy(how = How.XPATH, using = Product_Quantity )
    private WebElement productQty;
	
	
	@FindBy(how = How.XPATH, using = Checkout )
    private WebElement checkout;
	
	 public ShoppingCartSummaryPageObjects() {
	    	PageFactory.initElements(driver, this);
	    }
	
	public String getText(){
		String text = productQty.getText();
		return text;
	}
	 
	public SignInPageObjects checkout(){
		checkout.click();
		return new SignInPageObjects();
	}
	 
	public String getTitle(){
		String text = driver.getTitle();
		return text;
	}
	
}
