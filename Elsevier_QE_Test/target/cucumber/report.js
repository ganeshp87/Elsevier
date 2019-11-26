$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ElsevierQeTestProperty.feature");
formatter.feature({
  "line": 1,
  "name": "Validate Add to cart function",
  "description": "",
  "id": "validate-add-to-cart-function",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13989587035,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Elsevier Checkout Test",
  "description": "",
  "id": "validate-add-to-cart-function;elsevier-checkout-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already on Automation Practice Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User hoover on Dresses and click summer dresses",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User lands on the Summer Dresses page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User hoover on to the first item and click Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "click on Proceed to Checkout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Assert the product successfully added to the shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify the user in \"Order - My Store\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click Proceed to checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Assert user is in SignIn Section",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ElsevierStepDefination.user_is_already_on_Automation_Practice_Home_Page()"
});
formatter.result({
  "duration": 308639267,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.user_hoover_on_Dresses_and_click_summer_dresses()"
});
formatter.result({
  "duration": 2213110611,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.user_lands_on_the_Summer_Dresses_page()"
});
formatter.result({
  "duration": 361530320,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.user_hoover_on_to_the_first_item_and_click_Add_to_cart()"
});
formatter.result({
  "duration": 2511846677,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.click_on_Proceed_to_Checkout()"
});
formatter.result({
  "duration": 2809836058,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.assert_the_product_successfully_added_to_the_shopping_cart()"
});
formatter.result({
  "duration": 162980924,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Order - My Store",
      "offset": 20
    }
  ],
  "location": "ElsevierStepDefination.verify_the_user_in_page(String)"
});
formatter.result({
  "duration": 35936681,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.click_Proceed_to_checkout_button()"
});
formatter.result({
  "duration": 3698801497,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.assert_user_is_in_SignIn_Section()"
});
formatter.result({
  "duration": 292749755,
  "status": "passed"
});
formatter.match({
  "location": "ElsevierStepDefination.quit_the_browser()"
});
formatter.result({
  "duration": 4671091183,
  "status": "passed"
});
});