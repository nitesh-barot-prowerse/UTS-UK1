package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ReportPage {
    private WebDriver driver;

    public ReportPage(WebDriver driver) {
        this.driver = driver;
    }

    private By reportIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(9)");

    private By quoteReportIcon = By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a");

    private By productDropDown = By.xpath("//div[@id='search']/div[1]/div[1]/div/span/span");

    private By optionFromProductDD = By.xpath("//ul[@id='ProductId_listbox']/li[2]");

    private By quoteFromDropDown = By.xpath("//div[@id='search']/div[1]/div[4]/div/span/span");

    private By optionFromQuoteFromDD = By.xpath("//ul[@id='QuoteSaveFrom_listbox']/li[2]");

    private By quoteStatusDropDown = By.xpath("//div[@id='search']/div[1]/div[5]/div/div/div/button");

    private By optionFromQuoteStatusDD = By.xpath("//div[@class='ms-parent']/div/ul/li[2]/label/input");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By sortByDropDown=By.xpath("//div[@id='search']/div[2]/div[1]/div/span/span");

    private By optionFromSortByDD=By.xpath("//ul[@id='SortName_listbox']/li[2]");

    private By sortByDirectionDropDown=By.xpath("//div[@id='search']/div[2]/div[2]/div/span/span");

    private By optionFromSortByDirectionDD=By.xpath("//ul[@id='SortDirection2_listbox']/li[2]");

    //Policy Summary report page

    private By policySummaryIcon = By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]");

    private By productDropDownOnPolicySummary = By.xpath("//div[@id='search']/div/div[5]/div/span/span");

    private By optionFromProductDDOnPolicySummary = By.xpath("//ul[@id='ProductId_listbox']/li[2]");

    private By statusDropDownOnPolicySummary = By.xpath("//div[@id='search']/div/div[6]/div/div/div/button");

    private By optionFromStatusDDOnPolicySummary = By.xpath("//div[@id='search']/div/div[6]/div/div/div/div/ul/li[2]/label");

    private By sortByDropDownOnPolicySummary = By.xpath("//div[@id='search']/div[2]/div[6]/div/span/span");

    private By optionFromSortByDDOnPolicySummary = By.xpath("//ul[@id='SortName_listbox']/li[2]");

    private By sortDirectionDropDownOnPolicySummary = By.xpath("//div[@id='search']/div[2]/div[7]/div/span/span");

    private By optionFromSortDirectionDDOnPolicySummary = By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnProductSummary = By.cssSelector("button[id='SearchGrid']");

    //Policy cancellation report page

    private By policyCancellationIcon = By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[9]");

    private By insurerDropDown = By.xpath("//div[@id='search']/div/div[9]/div/span/span");

    private By optionFromInsurerDropDown = By.xpath("//ul[@id='InsurerId_listbox']/li[2]");

    private By sortByDropDownOnPolicyCancellation = By.xpath("//div[@id='search']/div[1]/div[10]/div/span/span");
    private By optionFromSortByDDOnPolicyCancellation = By.xpath("//ul[@id='SortName_listbox']/li[2]");
    private By sortDirectionDropDownOnPolicyCancellation = By.xpath("//div[@id='search']/div[1]/div[11]/div/span/span");
    private By optionFromSortDirectionDDOnPolicyCancellation= By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnPolicyCancellation = By.cssSelector("button[id='SearchGrid']");

    //Refund report page

    private By refundReportIcon = By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[10]");

    private By paymentStatusDropDown = By.xpath("//div[@id='search']/div/div[3]/div/span/span");

    private By optionFromPaymentStatusDropDown = By.xpath("//ul[@id='PaymentStatusId_listbox']/li[2]");

    private By sortByDropDownOnRefundReport = By.xpath("//div[@id='search']/div[1]/div[4]/div/span/span");
    private By optionFromSortByDDOnRefundReport = By.xpath("//ul[@id='SortName_listbox']/li[2]");
    private By sortDirectionDropDownOnRefundReport = By.xpath("//div[@id='search']/div[1]/div[5]/div/span/span");
    private By optionFromSortDirectionDDOnRefundReport= By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnRefundReport = By.cssSelector("button[id='SearchGrid']");

    //Policy History report page

    private By policyHistoryIcon = By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]");

    private By fromDateOnPolicyHistoryReport= By.xpath("//div[@id='search']/div/div[1]/div/span/span/input");

    private By toDateOnPolicyHistoryReport = By.xpath("//div[@id='search']/div/div[2]/div/span/span/input");

    private By searchButtonOnPolicyHistoryReport = By.cssSelector("button[id='SearchGrid']");

    //Active Policy Listing Report

    private By activePolicyListingIcon = By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]");

    private By productDropDownOnActivePolicy = By.xpath("//div[@id='search']/div/div[3]/div/span/span");

    private By optionFromProductDropDownOnActivePolicy = By.xpath("//ul[@id='ProductId_listbox']/li[2]");

    private By statusDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[1]/div[4]/div/div");
    private By optionFromStatusDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[1]/div[4]/div/div/div/div/ul/li[2]/label");
    private By insurerDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[1]/div[5]/div/span/span");
    private By optionFromInsurerDropDownOnActivePolicy= By.xpath("//ul[@id='InsurerId_listbox']/li[2]");

    private By receivedMethodDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[1]/div[6]/div/span/span");
    private By optionFromReceivedMethodDDOnActivePolicy= By.xpath("//ul[@id='PolicyReceivedMethodId_listbox']/li[2]");

    private By tractionTypeDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[2]/div[1]/div/span/span");
    private By optionFromTractionTypeOnActivePolicy= By.xpath("//ul[@id='TransactionTypeId_listbox']/li[2]");

    private By agentDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[1]/div[5]/div/span/span");
    private By optionFromAgentDropDownOnActivePolicy= By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By sortByDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[2]/div[4]/div/span/span");
    private By optionFromSortByDDOnActivePolicy= By.xpath("//ul[@id='SortName_listbox']/li[2]");

    private By sortDirectionDropDownOnActivePolicy = By.xpath("//div[@id='search']/div[2]/div[5]/div/span/span");
    private By optionFromSortDirectionDDOnActivePolicy= By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnOnActivePolicy = By.cssSelector("button[id='SearchGrid']");

    //Outstanding claims report page

    private By outStandingClaimsIcon = By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]");

    private By fromDateOnOutStandingClaimsReport= By.xpath("//div[@id='search']/div/div[1]/div/span/span/input");

    private By toDateOnOutStandingClaimsReport = By.xpath("//div[@id='search']/div/div[2]/div/span/span/input");

    private By sortBYStandingDropDown = By.xpath("//div[@id='search']/div/div[5]/div/span/span");

    private By optionFromSortBYStandingDropDown = By.xpath(" //ul[@id='SortName_listbox']/li[3]");

    private By sortDirectionStandingDropDown = By.xpath("//div[@id='search']/div/div[6]/div/span/span");

    private By optionFromSortDirectionStandingDropDown = By.xpath(" //ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnOutStandingClaimsReport = By.cssSelector("button[id='SearchGrid']");

    //Un allocated  Balance Report

    private By unallocatedBalanceIcon = By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[8]");

    private By sortByDropDownOnUnallocatedBalance = By.xpath("//div[@id='search']/div[1]/div[2]/div/span/span");
    private By optionFromSortByDDOnUnallocatedBalance= By.xpath("//ul[@id='SortName_listbox']/li[2]");

    private By sortDirectionDropDownOnUnallocatedBalance = By.xpath("//div[@id='search']/div[1]/div[3]/div/span/span");
    private By optionFromSortDirectionDDOnUnallocatedBalance= By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnUnallocatedBalance = By.cssSelector("button[id='SearchGrid']");

    //Agent List report page

    private By agentListIcon = By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]");

    private By agentTypeDropDownOn = By.xpath("//div[@id='search']/div/div[2]/div/span/span");

    private By optionFromAgentTypeDropDownOn= By.xpath("//ul[@id='AgentTypeId_listbox']/li[2]");

    private By activeDropDown = By.xpath("//div[@id='search']/div/div[3]/div/span/span");

    private By optionFromActiveDropDown = By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By sortByDropDownOnAgentListPage = By.xpath("//div[@id='search']/div/div[4]/div/span/span");

    private By optionFromSortByDDOnAgentListPage= By.xpath("//ul[@id='SortName_listbox']/li[2]");

    private By sortDirectionDropDownOnAgentListPage = By.xpath("//div[@id='search']/div/div[5]/div/span/span");

    private By optionFromSortDirectionDDOnAgentListPage = By.xpath("//ul[@id='SortDirection_listbox']/li[2]");

    private By searchButtonOnAgentListReport = By.cssSelector("button[id='SearchGrid']");



    public void clickOnReportIcon() {
        driver.findElement(reportIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public int fetchSections() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox']/div/div")));
        int size = totalColumn.size();
        return size;

    }

    public void traversingThroughPages() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Quote
        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a[1]")).isEnabled()) {
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a[1]")).click();
        } else {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a[1]")).click();
        }
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getCurrentUrl());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // driver.findElement(reportIcon).click();


        //Client
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[1]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[3]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[3]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[3]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[4]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[4]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[1]/div[2]/div/div[2]/a[4]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();

//        //Policy
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[1]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[3]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[6]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[1]/div/div[2]/a[7]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();



        //Claim

//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[1]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
      //  driver.findElement(reportIcon).click();


//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[2]/div[2]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();


//        //Trust Summary
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[1]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[3]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[1]/div/div[2]/a[4]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //From here make comment
//        driver.findElement(reportIcon).click();
//
//        //Agent
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[1]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
       // driver.findElement(reportIcon).click();

//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[2]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[3]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(reportIcon).click();
//
//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[4]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //  driver.findElement(reportIcon).click();


//        if (driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[5]")).isEnabled()) {
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[5]")).click();
//        } else {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            driver.findElement(By.xpath("//div[@class='ibox']/div[3]/div[2]/div/div[2]/a[5]")).click();
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(driver.getCurrentUrl());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    ////Filter quote report information upon option of product drop down


    public void selectOptionFromProductDropDown() {
        driver.findElement(productDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromProductDD).click();


    }


    // Filter quote report information upon options value of quote status and quote from drop downs

    public void clickOnQuoteReportIcon() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        WebElement quoteIcon = cWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ibox']/div[1]/div[1]/div/div[2]/a")));
        quoteIcon.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectOptionFromDropDown() {

        driver.findElement(quoteFromDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromQuoteFromDD).click();
        driver.findElement(quoteStatusDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromQuoteStatusDD).click();

    }

    public void clickSearchIcon() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyQuoteReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> quoteDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr[1]/td")));
        String details = " ";
        for (WebElement cLE : quoteDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Sorting data on quote report page via quote number

    public void selectOptionFromSortByDropDown(){
        driver.findElement(sortByDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDD).click();

        driver.findElement(sortByDirectionDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDirectionDD).click();
    }

    //Filter policy report information upon option of product drop down

    public void clickOnPolicySummaryIcon() {
        driver.findElement(policySummaryIcon).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void selectOptionFromProductDropDownOnProductSummaryPage() {
        driver.findElement(productDropDownOnPolicySummary).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromProductDDOnPolicySummary).click();


    }
    public void clickSearchIconOnPolicySummary() {
        driver.findElement(searchButtonOnProductSummary).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicySummaryReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> policySummaryDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : policySummaryDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Filter policy report information upon option of status drop down

    public void selectOptionFromStatusDropDownOnProductSummaryPage() {
        driver.findElement(statusDropDownOnPolicySummary).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromStatusDDOnPolicySummary).click();


    }

    public String verifyPolicySummaryReportDataUponStatusDD() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> policySummaryDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : policySummaryDetails) {
            details = details + cLE.getText();

        }
        return details;
    }


    //Sorting data on policy summary report page via policy number and sort direction dropdowns options

    public void selectOptionFromSortsDropDownOnProductSummaryPage() {
        driver.findElement(sortByDropDownOnPolicySummary).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDDOnPolicySummary).click();

        driver.findElement(sortDirectionDropDownOnPolicySummary).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionDDOnPolicySummary).click();


    }

    public String verifyPolicySummaryReportDataUponSortBYDD() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> policySummaryDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : policySummaryDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Filter Policy Payment history report information upon from and to date

    public void clickOnPolicyHistoryIcon() {
        driver.findElement(policyHistoryIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterFromAndToDate() {

        driver.findElement(fromDateOnPolicyHistoryReport).clear();

        driver.findElement(fromDateOnPolicyHistoryReport).sendKeys("12/02/2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(toDateOnPolicyHistoryReport).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(toDateOnPolicyHistoryReport).sendKeys("12/08/2024");


    }

    public void clickSearchIconOnPolicyHistory() {
        driver.findElement(searchButtonOnPolicyHistoryReport).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyHistoryReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> policyHistoryDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ibox-grid']/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : policyHistoryDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Filter Active policy listing  report information upon option of product drop down

    public void clickOnActivePolicyListingIcon() {
        driver.findElement(activePolicyListingIcon).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void selectOptionFromProductDropDownOnActivePolicyListingIconPage() {
        driver.findElement(productDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromProductDropDownOnActivePolicy).click();


    }
    public void clickSearchIconOnActivePolicy() {
        driver.findElement(searchButtonOnOnActivePolicy).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyActivePolicyReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> activePolicyDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : activePolicyDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Filter Active Policy Listing Report information upon option of status drop down

    public void selectOptionFromStatusDropDownOnActivePolicyListingPage() {
        driver.findElement(statusDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromStatusDropDownOnActivePolicy).click();


    }

    //Filter Active Policy Listing Report information upon option of insurer drop down

    public void selectOptionFromInsurerDropDownOnActivePolicyListingPage() {
        driver.findElement(insurerDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromInsurerDropDownOnActivePolicy).click();


    }

    //Filter Active Policy Listing Report information upon option of received method drop down

    public void selectOptionFromReceivedMethodDropDownOnActivePolicyListingPage() {
        driver.findElement(receivedMethodDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromReceivedMethodDDOnActivePolicy).click();


    }

    //Filter Active Policy Listing Report information upon option of transaction type method drop down

    public void selectOptionFromTransactionalTypeDropDownOnActivePolicyListingPage() {
        driver.findElement(tractionTypeDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromTractionTypeOnActivePolicy).click();


    }

    //Sorting data on active policy listing report page via sort by and sort direction dropdowns options

    public void selectOptionFromDropDownOnActivePolicyListingReport() {

        driver.findElement(sortByDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDDOnActivePolicy).click();
        driver.findElement(sortDirectionDropDownOnActivePolicy).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionDDOnActivePolicy).click();

    }
    //Sorting data on unallocated balance report page via sort by and sort direction dropdowns options

    public void clickOnUnallocatedBalanceReport() {
        driver.findElement(unallocatedBalanceIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectOptionFromSortByAndDirectionDD() {

        driver.findElement(sortByDropDownOnUnallocatedBalance).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDDOnUnallocatedBalance).click();

        driver.findElement(sortDirectionDropDownOnUnallocatedBalance).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionDDOnUnallocatedBalance).click();


    }

    public void clickSearchIconOnUnallocatedBalance() {
        driver.findElement(searchButtonOnUnallocatedBalance).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyUnallocatedBalanceReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> unallocatedReportDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : unallocatedReportDetails) {
            details = details + cLE.getText();

        }
        return details;
    }



    //Filter policy cancellation report information upon option of insurer drop down

    public void clickOnPolicyCancellationIcon() {
        driver.findElement(policyCancellationIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectOptionFromInsurerDropDown() {

        driver.findElement(insurerDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromInsurerDropDown).click();


    }

    public void clickSearchIconOnPolicyCancellation() {
        driver.findElement(searchButtonOnPolicyCancellation).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyPolicyCancellationReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> policyCancellationDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : policyCancellationDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Sorting data on policy cancellation report via sort by and sort direction dropdowns options


    public void selectOptionFromDropDownOnPolicyCancellation() {

        driver.findElement(sortByDropDownOnPolicyCancellation).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDDOnPolicyCancellation).click();
        driver.findElement(sortDirectionDropDownOnPolicyCancellation).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionDDOnPolicyCancellation).click();

    }
    //Filter Outstanding Claims report information upon notified from and to date

    public void clickOnOutstandingClaimIcon() {
        driver.findElement(outStandingClaimsIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterFromAndToDateOnOutstandingClaim() {

        driver.findElement(fromDateOnOutStandingClaimsReport).clear();

        driver.findElement(fromDateOnOutStandingClaimsReport).sendKeys("12.01.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(toDateOnOutStandingClaimsReport).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(toDateOnOutStandingClaimsReport).sendKeys("12.08.2024");


    }

    public void clickSearchIconOnOutstandingClaim() {
        driver.findElement(searchButtonOnOutStandingClaimsReport).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyOutstandingClaimData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> outstandingClaimDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : outstandingClaimDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    // Sorting data on Filter Outstanding Claims report via sort by and sort direction dropdowns options

    public void selectOptionsFromSortByAndDirectionDDOnOutstandingClaim() {

        driver.findElement(sortBYStandingDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortBYStandingDropDown).click();

        driver.findElement(sortDirectionStandingDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionStandingDropDown).click();


    }

    public String verifyOutstandingClaimDataUponSorting() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> outstandingClaimDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : outstandingClaimDetails) {
            details = details + cLE.getText();

        }
        return details;
    }



    //Filter refund report information upon option of payment status drop down

    public void clickOnRefundReportIcon() {
        driver.findElement(refundReportIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void selectOptionFromPaymentStatusDropDown() {

        driver.findElement(paymentStatusDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromPaymentStatusDropDown).click();


    }

    public void clickSearchIconOnRefundReportPage() {
        driver.findElement(searchButtonOnRefundReport).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyRefundReportData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> refundReportDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : refundReportDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Sorting data on refund report via sort by and sort direction dropdowns options


    public void selectOptionFromDropDownOnRefundReport() {

        driver.findElement(sortByDropDownOnRefundReport).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDDOnRefundReport).click();
        driver.findElement(sortDirectionDropDownOnRefundReport).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionDDOnRefundReport).click();

    }

    //Filter agent report information upon option of agent type drop down

    public void clickOnAgentListIcon() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)", "");

        driver.findElement(agentListIcon).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    public void selectOptionFromProductDropDownOnAgentListPage() {
        driver.findElement(agentTypeDropDownOn).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromAgentTypeDropDownOn).click();


    }
    public void clickSearchIconOnAgentListPage() {
        driver.findElement(searchButtonOnAgentListReport).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAgentListPageData() {
        WebDriverWait cWait = new WebDriverWait(driver, 10);
        List<WebElement> agentListDetails = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='wrapper wrapper-content']/div/div/table/tbody/tr")));
        String details = " ";
        for (WebElement cLE : agentListDetails) {
            details = details + cLE.getText();

        }
        return details;
    }

    //Filter agent report information upon option of active drop down

    public void selectOptionFromActiveDropDown() {
        driver.findElement(activeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromActiveDropDown).click();


    }

    //Sorting data on agent list report page via sort by and sort direction dropdowns options

    public void selectOptionFromSortByAndSortDirectionDD() {
        driver.findElement(sortByDropDownOnAgentListPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortByDDOnAgentListPage).click();

        driver.findElement(sortDirectionDropDownOnAgentListPage).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromSortDirectionDDOnAgentListPage).click();


    }



}




