package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AccountPage;

public class AccountPageSteps {
    AccountPage accountPage = new AccountPage(DriverFactory.getDriver());


    @When("User clicks on account icon on left tool bar")
    public void user_clicks_on_account_icon_on_left_tool_bar() {
        accountPage.clickOnAccountIcon();
    }

    @When("User clicks on icon")
    public void user_clicks_on_icon() {
        accountPage.traversingThroughPages();
    }

    @Then("User will redirect to respected page")
    public void user_will_redirect_to_respected_page() {
        //String url=accountPage.displayURL();
        //System.out.println(url);
    }

    @When("User clicks on bank icon")
    public void user_clicks_on_bank_icon() {
        accountPage.clickOnBankIcon();

    }

    @When("User enters account number in search box on manage bank page")
    public void user_enters_account_number_in_search_box_on_manage_bank_page() {
       accountPage.enterAccountNumber();
    }

    @When("User clicks on search button on manage bank page")
    public void user_clicks_on_search_button_on_manage_bank_page() {
       accountPage.clickOnSearchButton();
    }

    @Then("Data on manage bank page reflects upon account number")
    public void data_on_manage_bank_page_reflects_upon_account_number() {
     String accountNumber=accountPage.verifyAccountNumber();
     System.out.println(accountNumber);
    }

    @When("User enters client name in search box on manage bank page")
    public void user_enters_client_name_in_search_box_on_manage_bank_page() {
        accountPage.enterClientName();

    }

    @Then("Data on manage bank page reflects upon client name")
    public void data_on_manage_bank_page_reflects_upon_client_name() {
        String clientName=accountPage.verifyClientName();
        System.out.println(clientName);

    }

    //Bank Information page displays with details after clicking on bank code link on manage bank details

    @When("User clicks on bank code link on manage bank page")
    public void user_clicks_on_bank_code_link_on_manage_bank_page() {
        accountPage.clickOnBankCode();

    }

    @Then("Bank information page displays with details")
    public void bank_information_page_displays_with_details() {
        String clientInfo=accountPage.verifyBankDetails();
        if(clientInfo.length()>0){
            System.out.println(clientInfo);
        }
        else {
            Assert.fail();
        }

    }

    //Add Bank page  displays will all details when user clicks on add bank icon on manage bank page

    @When("User clicks on add bank icon on manage bank page")
    public void user_clicks_on_add_bank_icon_on_manage_bank_page() {
        accountPage.clickOnAddBankIcon();
    }

    @Then("Add bank page displays with all details")
    public void add_bank_page_displays_with_all_details() {
        String addBankPage = accountPage.verifyAddBankPage();
        Assert.assertEquals(addBankPage, "Add Bank");
    }

    //Add receipt page  displays will all details when user clicks on add receipt icon on manage receipt page

    @When("User clicks on manage receipt icon on account page")
    public void user_clicks_on_manage_receipt_icon_on_account_page() {
        accountPage.clickOnManageReceiptIcon();
    }

    @When("User clicks on add receipt icon on manage receipt page")
    public void user_clicks_on_add_receipt_icon_on_manage_receipt_page() {
        accountPage.clickOnAddReceiptIcon();
    }

    @Then("Allocate Payment page displays with all details")
    public void allocate_payment_page_displays_with_all_details() {
        String addAllocatePaymentPage = accountPage.verifyAddAllocatePaymentPage();
        Assert.assertEquals(addAllocatePaymentPage, "Allocate Payment");
    }
}
