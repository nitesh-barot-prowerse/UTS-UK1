package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ReportPage;

public class ReportPageSteps {
    ReportPage reportPage = new ReportPage(DriverFactory.getDriver());

    @When("User clicks on reports icon on left tool bar")
    public void user_clicks_on_reports_icon_on_left_tool_bar() {
        reportPage.clickOnReportIcon();

    }

    @Then("User will able to see total six section of report category")
    public void user_will_able_to_see_total_six_section_of_report_category() {
        int numberOfSection=reportPage.fetchSections();
        System.out.println("Total number of sections of report page" +numberOfSection);
        Assert.assertEquals(numberOfSection,7);

    }

    @When("User clicks on reports icon")
    public void user_clicks_on_reports_icon() {
        reportPage.traversingThroughPages();

    }

    @Then("Respected report page displays")
    public void respected_report_page_displays() {
        //reportPage.traversingThroughPages();

    }
    //Filter quote report information upon option of product drop down

    @When("User selects any option from product drop down on quote report page")
    public void user_selects_any_option_from_product_drop_down_on_quote_report_page() {
        reportPage.selectOptionFromProductDropDown();
    }

    @Then("Appropriate data displays on quote report page upon selected option from drop down")
    public void appropriate_data_displays_on_quote_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyQuoteReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon product drop down options on quote report page");
        }
    }

    // Filter quote report information upon options value of quote status and quote from drop downs

    @When("User clicks on quote report button on report page")
    public void user_clicks_on_quote_report_button_on_report_page() {
        reportPage.clickOnQuoteReportIcon();
    }

    @When("User selects any option from quote from and quote status drop down on quote report page")
    public void user_selects_any_option_from_quote_from_and_quote_status_drop_down_on_quote_report_page() {
        reportPage.selectOptionFromDropDown();
    }

    @When("User clicks on search button on quote report page")
    public void user_clicks_on_search_button_on_quote_report_page() {
        reportPage.clickSearchIcon();

    }

    @Then("Appropriate data displays on quote report page upon selected options from drop down")
    public void appropriate_data_displays_on_quote_report_page_upon_selected_options_from_drop_down() {
        String data = reportPage.verifyQuoteReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon quote from and quote status drop down options on quote report page");
        }
    }

    //Sorting data on quote report page via quote number

    @When("User selects quote number option from sort by and Ascending option from sort by direction drop down respectively")
    public void user_selects_quote_number_option_from_sort_by_and_ascending_option_from_sort_by_direction_drop_down_respectively() {
        reportPage.selectOptionFromSortByDropDown();
    }

    @Then("All data on quote report page displays in sorting manner")
    public void all_data_on_quote_report_page_displays_in_sorting_manner() {
        String data = reportPage.verifyQuoteReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon quote number and Ascending drop down options on quote report page");
        }
    }

    //Filter policy report information upon option of product drop down

    @When("User clicks on policy summary report button on report page")
    public void user_clicks_on_policy_summary_report_button_on_report_page() {
        reportPage.clickOnPolicySummaryIcon();
    }

    @When("User selects any option from product drop down on policy summary report page")
    public void user_selects_any_option_from_product_drop_down_on_policy_summary_report_page() {
        reportPage.selectOptionFromProductDropDownOnProductSummaryPage();
    }

    @When("User clicks on search button on policy summary report page")
    public void user_clicks_on_search_button_on_policy_summary_report_page() {
        reportPage.clickSearchIconOnPolicySummary();
    }

    @Then("Appropriate data displays on policy summary report page upon selected option from drop down")
    public void appropriate_data_displays_on_policy_summary_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyPolicySummaryReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon product drop down options on policy summary report page");
        }

    }

    //Filter policy report information upon option of status drop down

    @When("User selects any option from status drop down on policy summary report page")
    public void user_selects_any_option_from_status_drop_down_on_policy_summary_report_page() {
        reportPage.selectOptionFromStatusDropDownOnProductSummaryPage();
    }

    @Then("Appropriate data displays on policy summary report page upon selected option from status drop down")
    public void appropriate_data_displays_on_policy_summary_report_page_upon_selected_option_from_status_drop_down() {
        String data = reportPage.verifyPolicySummaryReportDataUponStatusDD();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon status drop down options on policy summary report page");
        }
    }

    //Sorting data on policy summary report page via policy number and sort direction dropdowns options

    @When("User selects policy number option from sort by and ascending option from sort direction drop down respectively")
    public void user_selects_policy_number_option_from_sort_by_and_ascending_option_from_sort_direction_drop_down_respectively() {
        reportPage.selectOptionFromSortsDropDownOnProductSummaryPage();
    }

    @Then("Appropriate data displays on policy summary report page upon selected option from both drop down")
    public void appropriate_data_displays_on_policy_summary_report_page_upon_selected_option_from_both_drop_down() {
        String data = reportPage.verifyPolicySummaryReportDataUponSortBYDD();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon status drop down options on policy summary report page");
        }
    }

    //Add premium and claim adjustments window opens by clicking on adjustment button on section 26 and 27 report page

    @When("User clicks on Trust summary section button on report page")
    public void user_clicks_on_trust_summary_section_button_on_report_page() {
        reportPage.clickOnTrustSummarySection();
    }

    @When("User clicks on adjustment button on section report page")
    public void user_clicks_on_adjustment_button_on_section_report_page() {
        reportPage.clickOnAdjustmentIconOnSectionPage();
    }

    @Then("Add premium and claim adjustments window opens with all details")
    public void add_premium_and_claim_adjustments_window_opens_with_all_details() {
        reportPage.verifyAddPremiumAndClaimAdjustmentWindow();
    }

    //Payment window opens by clicking on payments button on section 26 and 27 report page

    @When("User clicks on payments button on section report page")
    public void user_clicks_on_payments_button_on_section_report_page() {
        reportPage.clickOnPaymentsSectionPage();
    }

    @Then("Payments window opens with all details")
    public void payments_window_opens_with_all_details() {
        reportPage.verifyPaymentsWindow();
    }

    //Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page

    @When("User clicks on bank button on section report page")
    public void user_clicks_on_bank_button_on_section_report_page() {
        reportPage.clickOnBankIconOnSectionPage();
    }

    @Then("Opening and Closing bank balance window opens with all details")
    public void opening_and_closing_bank_balance_window_opens_with_all_details() {
        reportPage.verifyBankBalanceWindow();

    }



}
