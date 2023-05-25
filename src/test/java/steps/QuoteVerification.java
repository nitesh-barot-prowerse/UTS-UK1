package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.QuoteVerify;

public class QuoteVerification {
    QuoteVerify quoteVerify = new QuoteVerify(DriverFactory.getDriver());

    static String value = " ";

    @When(":User enters all pet related details under about you tab")
    public void user_enters_all_pet_related_details_under_about_you_tab() {
        quoteVerify.clickOnCookies();
        String nextPage = quoteVerify.enterPetDetails();
        System.out.println(nextPage);

    }

    @When("User enters all customer related information under about you tab")
    public void user_enters_all_customer_related_information_under_about_you_tab() {
        quoteVerify.enterCustomerDetail();

    }

    @When("User will able to see all quote details and clicks on save quote button")
    public void user_will_able_to_see_all_quote_details_and_clicks_on_save_quote_button() {
        value = quoteVerify.fetchQuotePrice();
        if (value.length() > 0) {
            System.out.println(value);

        } else {
            Assert.fail();
        }
    }

    @Then("User will get unique quote number")
    public void user_will_get_unique_quote_number() {

    }

    @When("User will redirect to url {string}")
    public void user_will_redirect_to_url(String string) {
        quoteVerify.url(string);

    }

    @When("User clicks on inbox")
    public void user_clicks_on_inbox() {
        String valueMail = quoteVerify.UserClickOnInbox();
        System.out.println(valueMail);
        String[] splited = valueMail.split("\\s+");
        if (splited[2].equals(value)) {
            System.out.println(valueMail);
        } else {
            Assert.fail();
        }

    }

    @When("User fetch data")
    public void user_fetch_data() {

    }
}
