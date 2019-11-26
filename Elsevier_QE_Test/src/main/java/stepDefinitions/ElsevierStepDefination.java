package stepDefinitions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import com.elsevier.qe.base.TestBase;
import com.elsevier.qe.pages.HomePageObjects;
import com.elsevier.qe.pages.ShoppingCartSummaryPageObjects;
import com.elsevier.qe.pages.SignInPageObjects;
import com.elsevier.qe.pages.SummerDressPageObjects;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElsevierStepDefination extends TestBase {

	private static final Logger LOG = LoggerFactory.getLogger(ElsevierStepDefination.class);
	HomePageObjects homePageObects;
	SummerDressPageObjects summerDressPageObjects;
	ShoppingCartSummaryPageObjects shoppingCartSummaryPageObjects;
	SignInPageObjects signInPageObjects;

	@Before
	public void setUP() {
		LOG.info("Elsevier Test Started");
		TestBase.initialization();
		homePageObects = new HomePageObjects();
		summerDressPageObjects = new SummerDressPageObjects();
		shoppingCartSummaryPageObjects = new ShoppingCartSummaryPageObjects();
		signInPageObjects = new SignInPageObjects();
	}

	@Given("^user is already on Automation Practice Home Page$")
	public void user_is_already_on_Automation_Practice_Home_Page()  {
		String url= driver.getTitle();
		LOG.info("Home Page URL is " + url);
		Assert.assertEquals(url, "My Store");
	}
	
	@When("^User hoover on Dresses and click summer dresses$")
	public void user_hoover_on_Dresses_and_click_summer_dresses(){
		summerDressPageObjects = homePageObects.clickDressesTab();
	}
	
	@Then("^User lands on the Summer Dresses page$")
	public void user_lands_on_the_Summer_Dresses_page(){
		summerDressPageObjects.imageOnHoover();
	}

	@Then("^User hoover on to the first item and click Add to cart$")
	public void user_hoover_on_to_the_first_item_and_click_Add_to_cart(){
		summerDressPageObjects.addtoCart();
		summerDressPageObjects.continueShopping();
		summerDressPageObjects.item2Click();
		summerDressPageObjects.continueShopping();
		summerDressPageObjects.item3Click();
	}

	@Then("^click on Proceed to Checkout$")
	public void click_on_Proceed_to_Checkout(){
		shoppingCartSummaryPageObjects= summerDressPageObjects.proceedToCheckout();

	}
	
	@Then("^Assert the product successfully added to the shopping cart$")
	public void assert_the_product_successfully_added_to_the_shopping_cart(){
		String text=shoppingCartSummaryPageObjects.getText();
		Assert.assertEquals(text, "3 Products");
	}

	@Then("^Verify the user in \"([^\"]*)\" page$")
	public void verify_the_user_in_page(String arg1){
		String title=shoppingCartSummaryPageObjects.getTitle();
		Assert.assertEquals(title, arg1);
	}

	@Then("^Click Proceed to checkout button$")
	public void click_Proceed_to_checkout_button(){
	 signInPageObjects=shoppingCartSummaryPageObjects.checkout();
	}

	@Then("^Assert user is in SignIn Section$")
	public void assert_user_is_in_SignIn_Section(){
		String title = signInPageObjects.getText();
		Assert.assertEquals(title, "02. Sign in");
	}

	@Then("^Quit the browser$")
	public void quit_the_browser() throws InterruptedException{
	  driver.quit();
	  LOG.info("Elsevier Test Completed");
	}

}
