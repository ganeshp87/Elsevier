package com.elsevier.qe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static com.elsevier.qe.util.WebelementConstant.*;
import com.elsevier.qe.base.TestBase;



public class SignInPageObjects extends TestBase {

	@FindBy(how = How.XPATH, using = SignIn)
    private WebElement signIn;
	
	
	@FindBy(how = How.XPATH, using = Checkout )
    private WebElement checkout;
	
	 public SignInPageObjects() {
	    	PageFactory.initElements(driver, this);
	    }
	
	public String getText(){
		return signIn.getText();
	}
}
