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
        int numberOfSection = reportPage.fetchSections();
        System.out.println("Total number of sections of report page" + numberOfSection);
        Assert.assertEquals(numberOfSection, 7);

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

    //Filter policy cancellation report information upon option of insurer drop down

    @When("User clicks on policy cancellation report button on report page")
    public void user_clicks_on_policy_cancellation_report_button_on_report_page() {
        reportPage.clickOnPolicyCancellationIcon();
    }

    @When("User selects any option from insurer drop down on policy cancellation report page")
    public void user_selects_any_option_from_insurer_drop_down_on_policy_cancellation_report_page() {
        reportPage.selectOptionFromInsurerDropDown();
    }

    @When("User clicks on search button on policy policy cancellation report page")
    public void user_clicks_on_search_button_on_policy_policy_cancellation_report_page() {
        reportPage.clickSearchIconOnPolicyCancellation();
    }

    @Then("Appropriate data displays on policy cancellation report page upon selected option from drop down")
    public void appropriate_data_displays_on_policy_cancellation_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyPolicyCancellationReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon insurer drop down options on policy cancellation report page");
        }
    }


    //Sorting data on policy cancellation report via sort by and sort direction dropdowns options
    @When("User selects any option from sort by and option from sort direction drop down respectively")
    public void user_selects_any_option_from_sort_by_and_option_from_sort_direction_drop_down_respectively() {
        reportPage.selectOptionFromDropDownOnPolicyCancellation();
    }

    //Filter refund report information upon option of payment status drop down

    @When("User clicks on refund report button on report page")
    public void user_clicks_on_refund_report_button_on_report_page() {
        reportPage.clickOnRefundReportIcon();
    }

    @When("User selects any option from payment status drop down on refund report page")
    public void user_selects_any_option_from_payment_status_drop_down_on_refund_report_page() {
        reportPage.selectOptionFromPaymentStatusDropDown();
    }

    @When("User clicks on search button on refund report page")
    public void user_clicks_on_search_button_on_refund_report_page() {
        reportPage.clickSearchIconOnRefundReportPage();
    }

    @Then("Appropriate data displays on refund report page upon selected option from drop down")
    public void appropriate_data_displays_on_refund_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyRefundReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon payment status drop down options on refund report page");
        }
    }

    //Sorting data on refund report via sort by and sort direction dropdowns options
    @When("User selects any option from sort by and option from sort direction drop down respectively on refund report page")
    public void user_selects_any_option_from_sort_by_and_option_from_sort_direction_drop_down_respectively_on_refund_report_page() {
        reportPage.selectOptionFromDropDownOnRefundReport();

    }

    //Filter Policy Payment history report information upon from and to date

    @When("User clicks on policy payment history button on report page")
    public void user_clicks_on_policy_payment_history_button_on_report_page() {
        reportPage.clickOnPolicyHistoryIcon();
    }

    @When("User enters from and to date value on policy payment history page")
    public void user_enters_from_and_to_date_value_on_policy_payment_history_page() {
        reportPage.enterFromAndToDate();
    }

    @When("User clicks on search button on policy policy payment history page page")
    public void user_clicks_on_search_button_on_policy_policy_payment_history_page_page() {
        reportPage.clickSearchIconOnPolicyHistory();
    }

    @Then("Appropriate data displays on policy payment history page upon selected option from drop down")
    public void appropriate_data_displays_on_policy_payment_history_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyPolicyHistoryReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon from and to date values on policy history report page");
        }
    }


    // Filter Active Policy Listing Report information upon option of product status drop down


    @When("User clicks on  active policy listing report button on active policy listing report page")
    public void user_clicks_on_active_policy_listing_report_button_on_active_policy_listing_report_page() {
        reportPage.clickOnActivePolicyListingIcon();
    }

    @When("User selects any option from product status drop down on active policy listing report page")
    public void user_selects_any_option_from_product_status_drop_down_on_active_policy_listing_report_page() {
        reportPage.selectOptionFromProductDropDownOnActivePolicyListingIconPage();
    }

    @When("User clicks on search button on active policy listing report page")
    public void user_clicks_on_search_button_on_active_policy_listing_report_page() {
        reportPage.clickSearchIconOnActivePolicy();

    }

    @Then("Appropriate data displays on active policy listing report page upon selected option from drop down")
    public void appropriate_data_displays_on_active_policy_listing_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyActivePolicyReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon product status drop down options on active policy report page");
        }

    }

    //Filter Active Policy Listing Report information upon option of status drop down

    @When("User selects any option from status drop down on active policy listing report page")
    public void user_selects_any_option_from_status_drop_down_on_active_policy_listing_report_page() {
        reportPage.selectOptionFromStatusDropDownOnActivePolicyListingPage();
    }

    //Filter Active Policy Listing Report information upon option of insurer drop down

    @When("User selects any option from insurer drop down on active policy listing report page")
    public void user_selects_any_option_from_insurer_drop_down_on_active_policy_listing_report_page() {
        reportPage.selectOptionFromInsurerDropDownOnActivePolicyListingPage();
    }

    //Filter Active Policy Listing Report information upon option of received method drop down

    @When("User selects any option from received method drop down on active policy listing report page")
    public void user_selects_any_option_from_received_method_drop_down_on_active_policy_listing_report_page() {
        reportPage.selectOptionFromReceivedMethodDropDownOnActivePolicyListingPage();
    }

    //Filter Active Policy Listing Report information upon option of transaction type method drop down

    @When("User selects any option from transaction type drop down on active policy listing report page")
    public void user_selects_any_option_from_transaction_type_drop_down_on_active_policy_listing_report_page() {
        reportPage.selectOptionFromTransactionalTypeDropDownOnActivePolicyListingPage();
    }

    //Sorting data on active policy listing report page via sort by and sort direction dropdowns options

    @When("User selects any option from sort by and option from sort direction drop down respectively on active policy listing page")
    public void user_selects_any_option_from_sort_by_and_option_from_sort_direction_drop_down_respectively_on_active_policy_listing_page() {
        reportPage.selectOptionFromDropDownOnActivePolicyListingReport();
    }

    //Sorting data on unallocated balance report page via sort by and sort direction dropdowns options

    @When("User clicks on unallocated balance report button on report page")
    public void user_clicks_on_unallocated_balance_report_button_on_report_page() {
        reportPage.clickOnUnallocatedBalanceReport();
    }

    @When("User selects any option from sort by and sort direction drop down respectively on unallocated balance report page")
    public void user_selects_any_option_from_sort_by_and_sort_direction_drop_down_respectively_on_unallocated_balance_report_page() {
       reportPage.selectOptionFromSortByAndDirectionDD();
    }

    @When("User clicks on search button on unallocated balance report page")
    public void user_clicks_on_search_button_on_unallocated_balance_report_page() {
      reportPage.clickSearchIconOnUnallocatedBalance();
    }

    @Then("Appropriate data displays on unallocated balance report page upon selected option from drop down")
    public void appropriate_data_displays_on_unallocated_balance_report_page_upon_selected_option_from_drop_down() {

        String data = reportPage.verifyUnallocatedBalanceReportData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon sorting drop down options on unallocated balance report page");
        }
    }

    //Filter Outstanding Claims report information upon notified from and to date

    @When("User clicks on outstanding claims button on report page")
    public void user_clicks_on_outstanding_claims_button_on_report_page() {
        reportPage.clickOnOutstandingClaimIcon();
    }

    @When("User enters from and to date value on outstanding claims page")
    public void user_enters_from_and_to_date_value_on_outstanding_claims_page() {
        reportPage.enterFromAndToDateOnOutstandingClaim();
    }

    @When("User clicks on search button on outstanding claims")
    public void user_clicks_on_search_button_on_outstanding_claims() {
        reportPage.clickSearchIconOnOutstandingClaim();
    }

    @Then("Appropriate data displays on outstanding claims upon date values")
    public void appropriate_data_displays_on_outstanding_claims_upon_date_values() {
        String data = reportPage.verifyOutstandingClaimData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon entering from and to date value on outstanding claim report page");
        }
    }

    // Sorting data on Filter Outstanding Claims report via sort by and sort direction dropdowns options

    @When("User selects any option from sort by and option from sort direction drop down respectively on Filter Outstanding Claims page")
    public void user_selects_any_option_from_sort_by_and_option_from_sort_direction_drop_down_respectively_on_filter_outstanding_claims_page() {
        reportPage.selectOptionsFromSortByAndDirectionDDOnOutstandingClaim();
    }

    @Then("Appropriate data displays on outstanding claims upon selected option from drop down")
    public void appropriate_data_displays_on_outstanding_claims_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyOutstandingClaimDataUponSorting();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon options of sort by and sort direction drop down  on outstanding claim report page");
        }
    }


    //Filter agent report information upon option of agent type drop down

    @When("User clicks on agent list button on report page")
    public void user_clicks_on_agent_list_button_on_report_page() {
        reportPage.clickOnAgentListIcon();
    }

    @When("User selects any option from  option of agent type drop down on agent list report page")
    public void user_selects_any_option_from_option_of_agent_type_drop_down_on_agent_list_report_page() {
        reportPage.selectOptionFromProductDropDownOnAgentListPage();
    }


    @When("User clicks on search button on agent list report page")
    public void user_clicks_on_search_button_on_agent_list_report_page() {
        reportPage.clickSearchIconOnAgentListPage();
    }

    @Then("Appropriate data displays on agent list report page upon selected option from drop down")
    public void appropriate_data_displays_on_agent_list_report_page_upon_selected_option_from_drop_down() {
        String data = reportPage.verifyAgentListPageData();
        if (data.length() > 0) {
            System.out.println(data);
        } else {
            System.out.println("Data does not reflects upon agent type drop down options on agent list report page");
        }
    }

    //Filter agent report information upon option of active drop down

    @When("User selects any option from  active drop down on agent list report page")
    public void user_selects_any_option_from_active_drop_down_on_agent_list_report_page() {
        reportPage.selectOptionFromActiveDropDown();

    }

    //Sorting data on agent list report page via sort by and sort direction dropdowns options
    @When("User selects agent name or number option from sort by and ascending option from sort direction drop down respectively")
    public void user_selects_agent_name_or_number_option_from_sort_by_and_ascending_option_from_sort_direction_drop_down_respectively() {
        reportPage.selectOptionFromSortByAndSortDirectionDD();
    }


}
