$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopsFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Retail Website Features",
  "description": "",
  "id": "retail-website-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3656843100,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User add Canon EOS 5D from Desktops tab to the cart",
  "description": "",
  "id": "retail-website-features;user-add-canon-eos-5d-from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@TestAddCanon"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User click ADD TO CART option on ‘Canon EOS 5D’ item",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User select color from dropdown ‘Red’",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User select quantity 1",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 4963164000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageStepDefinition.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 140552900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageStepDefinition.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 3591702600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 44
    }
  ],
  "location": "DesktopsPageStepDefinition.user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int)"
});
formatter.result({
  "duration": 1818710600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageStepDefinition.user_select_color_from_dropdown_Red()"
});
formatter.result({
  "duration": 633356700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "DesktopsPageStepDefinition.user_select_quantity(int)"
});
formatter.result({
  "duration": 468784400,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageStepDefinition.user_click_add_to_Cart_button()"
});
formatter.result({
  "duration": 79686300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 61
    }
  ],
  "location": "DesktopsPageStepDefinition.user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int)"
});
formatter.result({
  "duration": 458430400,
  "status": "passed"
});
formatter.after({
  "duration": 4777911800,
  "status": "passed"
});
});