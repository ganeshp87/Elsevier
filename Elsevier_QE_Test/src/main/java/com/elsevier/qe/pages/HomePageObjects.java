package com.elsevier.qe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.elsevier.qe.util.WebelementConstant.*;

import com.elsevier.qe.base.TestBase;



public class HomePageObjects extends TestBase {

	@FindBy(how = How.XPATH, using = Dresses)
    private WebElement dresses;
	
	@FindBy(how = How.XPATH, using = Summer_Dresses)
    private WebElement summerDresses;
	
	 public HomePageObjects() {
	    	PageFactory.initElements(driver, this);
	    }
	
    public SummerDressPageObjects clickDressesTab() {
		 Actions actions = new Actions(driver);
		 actions.moveToElement(dresses).build().perform();
		 Actions actions2 = new Actions(driver);
		 actions2.moveToElement(summerDresses).build().perform();
		 summerDresses.click();
		 return new SummerDressPageObjects();
	}

	
}
	 
	 

