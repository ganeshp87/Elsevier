package com.elsevier.qe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.elsevier.qe.util.WebelementConstant.*;

import com.elsevier.qe.base.TestBase;



public class SummerDressPageObjects extends TestBase {

	@FindBy(how = How.XPATH, using = Image_On_Hoover)
    private WebElement imageHoover;
	
	@FindBy(how = How.XPATH, using = Add_To_Cart)
    private WebElement addToCart;
	
	@FindBy(how = How.XPATH, using = Proceed_TO_Checkout)
    private WebElement proceedToCheckOut;
	
	@FindBy(how = How.XPATH, using = Continue_Shopping)
    private WebElement continueShopping;
	
	@FindBy(how = How.XPATH, using = Item_2)
    private WebElement item2;
	
	@FindBy(how = How.XPATH, using = Item_3)
    private WebElement item3;
	
	@FindBy(how = How.XPATH, using = Image_Hoover_3)
    private WebElement imageHover3;
	
	 public SummerDressPageObjects() {
	    	PageFactory.initElements(driver, this);
	    }
	
	 public void imageOnHoover() {
		 Actions actions = new Actions(driver);
		 actions.moveToElement(imageHoover).build().perform();
	}
	 
	 public void addtoCart(){
		 addToCart.click();
	 }
	 
	 public void item2Click(){
		 item2.click();
	 }
	 public void item3Click(){
		 Actions actions = new Actions(driver);
		 actions.moveToElement(imageHover3).build().perform();		
		 item3.click();
	 }
	 
	 public void continueShopping(){
		 continueShopping.click();
	 }
	 
	 public ShoppingCartSummaryPageObjects proceedToCheckout(){
		 proceedToCheckOut.click();
		 return new ShoppingCartSummaryPageObjects();
	 }
}
