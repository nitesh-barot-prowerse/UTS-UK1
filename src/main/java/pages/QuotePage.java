package pages;

import actions.AddQuoteForDog;
import actions.ClientActions;
import dataModels.Client;
import dataModels.Exotic;
import dataModels.Horse;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Log;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class QuotePage extends AddQuoteForDog {
    private WebDriver driver;

    Exotic exotic;

    Client client;

    Horse horse;

    ClientActions clientActions = new ClientActions();

    public QuotePage(WebDriver driver) {
        this.driver = driver;
    }

    private By quoteIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(4)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By addQuoteButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By messageOnAddQuotePage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By monthlyPremiumColumn = By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]");

    private By microchipButton = By.xpath("//div[@class='form-group pull-right']/div/a[3]");

    private By productListDropDown = By.xpath("//div[@class='ibox-content']/div/div/div[4]/div/div/span");

    private By quoteStatusDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div/div[5]/div/div/div/button");

    private By statusOpen = By.xpath("//div[@class='ms-drop']/ul/li[1]/label");

    //Fetch quote list based upon product dropdown options

    private By productDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[2]/div/span");

    private By optionsFromProductDD = By.xpath("//ul[@id='ProductId_listbox']/li[3]");

    private By isReferredDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[1]/div[3]/div/span");

    private By optionsFromIsReferredDD = By.xpath("//ul[@id='IsReferRequired_listbox']/li[2]");

    private By divisionDropdown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div[1]/div[2]/div[4]/div/span");

    private By optionsFromDivisionDD = By.xpath("//ul[@id='DivisionId_listbox']/li[2]");


    private By detailsOfQuotes=By.xpath("//div[@id='gridName']/table/tbody/tr");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    //client information
    private By titleDropdown = By.xpath("//div[@id='divfname']/div[1]/div/div/span");

    private By optionOfTitleDD = By.xpath("//ul[@id='Title_listbox']/li[2]");

    private By firstName = By.cssSelector("input[id='FirstName']");

    private By lastName = By.cssSelector("input[id='LastName']");

    private By birthDate = By.cssSelector("input[id='BirthDate']");

    private By Email = By.cssSelector("input[id='Email']");

    private By addressCode = By.cssSelector("input[id='Address1']");

    private By optionOfAddressCode = By.xpath("//div[@id='cc_c2a']/ul/li[4]");

    private By contactNumber = By.cssSelector("input[id='PrimaryContactNumber']");

    //Exotic Information

    private By optionOfExoticFromProductDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[2]");

    private By agentDropDown = By.xpath("//div[@id='Div_33020']/div/div/span");

    private By optionOfAgentDD = By.xpath("//ul[@id='Question_33020_listbox']/li[3]");

    private By brandOption = By.cssSelector("input[id='Question_234_279']");

    private By speciesDropDownOfExotic = By.xpath("//div[@id='Div_138']/div/div/span");

    private By optionOfSpeciesExoticDD = By.xpath("//ul[@id='Question_138_listbox']/li[2]");

    private By exoticPetName = By.cssSelector("input[id='Question_139']");

    private By petGenderOfExoticDropDown = By.xpath("//div[@id='Div_140']/div/div/span");

    private By optionOfPetGenderExoticDD = By.xpath("//ul[@id='Question_140_listbox']/li[2]");

    private By exoticDateOfBirth = By.cssSelector("input[id='Question_141']");

    private By exoticPrice = By.cssSelector("input[id='Question_142']");

    private By plusPlanCheckBox = By.xpath("//div[@id='tab-MonthlyPremiumCalculation']/div/div/div/div/div/table/tbody/tr/th[3]/input");

    private By planStartDate = By.cssSelector("input[id='Question_80']");

    private By questionOneExotic = By.cssSelector("input[id='Question_82_340']");

    private By termsAndCondition = By.cssSelector("input[id='Question_137']");

    private By paymentFrequency = By.cssSelector("input[id='PremiumFrequency_2']");

    private By paymentOptionDropDown = By.xpath("//div[@id='divPayment']/div/div/div/div/span/span/span");

    private By optionOfPaymentDropDown = By.xpath("//ul[@id='PaymentTenderId_listbox']/li[4]");

    private By optionOfPaymentDebitCardDropDown = By.xpath("//ul[@id='PaymentTenderId_listbox']/li[3]");

    private By optionOfPaymentDirectDebitDD=By.xpath("//ul[@id='PaymentTenderId_listbox']/li[4]");

    private By cardTypeDropDown=By.xpath("//div[@id='divCreditCardDetail']/div[1]/div/div/div/span");

    private By optionOfCardTyeDD=By.xpath("//ul[@id='CardType_listbox']/li[2]");
    private By cardHolderName=By.id("CardHolderName");

    private By cardNumber=By.id("CreditCardNumber");

    private By cardExpireMonthDropDown=By.xpath("//div[@id='divCreditCardDetail']/div[4]/div/div/div[1]/span");

    private By optionOfCardExpireMonth=By.xpath("//ul[@id='CreditCardExpiryMonth_listbox']/li[4]");

    private By cardExpireYearDropDown=By.xpath("//div[@id='divCreditCardDetail']/div[4]/div/div/div[2]/span");

    private By optionOfCardExpireYear=By.xpath("//ul[@id='CreditCardExpiryYear_listbox']/li[4]");

    private By cardCvv=By.id("CreditCardCVV");

    private By sortCodeOfAccount=By.cssSelector("input[id='DirectDebitSortCode']");

    private By directDebitAccountHolderName=By.id("DirectDebitAccountName");

    private By directDebitAccountHolderNumber=By.id("DirectDebitAccountNumber");

    private By createPolicyButton = By.xpath("//div[@id='divQuotebutton']/div[2]/div/div/button[2]");



    //Introductory horse information

    private By optionOfHorseIntroductoryDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[3]");

    private By petHorseName = By.cssSelector("input[id='Question_151']");

    private By petHorseBreedDrpDown = By.xpath("//div[@id='Div_152']/div/div/span");

    private By optionOfPetHorseBreedDD = By.xpath("//ul[@id='Question_152_listbox']/li[5]");

    private By horseColorDropDown = By.xpath("//div[@id='Div_153']/div/div/span");

    private By optionOfHorseColorDD = By.xpath("//ul[@id='Question_153_listbox']/li[3]");

    private By petHorseAgeDropDown = By.xpath("//div[@id='Div_154']/div/div/span");

    private By optionOfPetHorseAgeDD = By.xpath("//ul[@id='Question_154_listbox']/li[9]");

    private By petHorseSexDropDown = By.xpath("//div[@id='Div_155']/div/div/span");

    private By optionOfPetSexAgeDD = By.xpath("//ul[@id='Question_155_listbox']/li[3]");

    private By petHorseHeightDropDown = By.xpath("//div[@id='Div_156']/div/div/span");

    private By optionOfPetHorseHeightDD = By.xpath("//ul[@id='Question_156_listbox']/li[3]");

    private By horseActivityTypeDropDown = By.xpath("//div[@id='Div_157']/div/div/div/div");

    private By optionOfHorseActivityTypeDD = By.xpath("//ul[@id='Question_157_listbox']/li[2]");

    private By petHorseOwnedDD=By.xpath("//div[@id='Div_158']/div/div/span");

    private By optionOfPrtHorseOwnedDD=By.xpath("//ul[@id='Question_158_listbox']/li[2]");

    private By purchaseDate=By.cssSelector("input[id='Question_159']");

    private By horsePurchaseFees = By.cssSelector("input[id='Question_160']");

    private By horseMarketValue = By.cssSelector("input[id='Question_163']");

    private By calculateOfHorse = By.cssSelector("button[id='btnCalculate']");

    private By basicPlanHorse = By.xpath("//div[@id='divCalculationMoreMonthly']/div[3]/div[1]/div/table/tbody/tr/th[3]/div/input\n");

    private By policyStartDate = By.cssSelector("input[id='Question_166']");

    private By nameOfInsurerIfOtherDropDown=By.xpath("//div[@id='Div_167']/div/div/span/span");

    private By optionOfNameOfInsurerIfOtherDD=By.xpath("//ul[@id='Question_167_listbox']/li[3]");

    private By horseDateOfBirth=By.cssSelector("input[id='Question_170']");

    private By petHorseVettedDropDown=By.xpath("//div[@id='Div_172']/div/div/span/span");

    private By optionPetVettedHorseDD=By.xpath("//ul[@id='Question_172_listbox']/li[3]");

    private By question1Horse = By.cssSelector("input[id='Question_173_514']");

    private By acceptCondition = By.cssSelector("input[id='Question_224_552']");

    //Professional information

    private By optionOfProfessionalIntroductoryDD = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[4]");

    private By businessActivityDropDown=By.xpath("//div[@id='Div_10001']/div/div/div/div");

    private By optionOfBusinessActivityDD=By.xpath("//ul[@id='Question_10001_listbox']/li[2]");

    private By businessDropDown=By.xpath("//div[@id='Div_10002']/div/div/span");

    private By optionOfBusinessDD=By.xpath("//ul[@id='Question_10002_listbox']/li[2]");

    private By employeeRadioButton=By.cssSelector("input[id='Question_11072_4371']");

    private By businessRadioButton=By.cssSelector("input[id='Question_10051_4101']");

    private By insurerRadio=By.cssSelector("input[id='Question_11002_4039']");

    private By assumptionRadio=By.cssSelector("input[id='Question_11010_4112']");

    private By checkBox1=By.cssSelector("input[id='Question_11065']");

    private By checkBox2=By.cssSelector("input[id='Question_11066']");

    private By checkBox3=By.cssSelector("input[id='Question_11053']");

    //Fetch quote on manage quote page based on quote number

    private By quoteSearchBox = By.cssSelector("input[id='QuoteNumber']");

    //Verify include payment feature of quote module for Qa

    private By includePaymentCheckBox = By.cssSelector("div[id='search']>:nth-child(1)>:nth-child(6)>:nth-child(1)>div[class^='icheckbox_square-green']");

    //Edit quote information and verifies the same

    private By selectCogIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li[1]/a");

    private By selectEditQuoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li[1]/ul/li[1]/a");

    private By enterPostCodeInAddressDropDown = By.cssSelector("input[id='Address1']");

    private By selectPostCodeFromDD = By.xpath("//div[@id='cc_c2a']/ul/li[3]");

    private By hearAboutUsDropDown = By.xpath("//div[@id='loadpartialview']/div[2]/div/div[17]/div/div/span/span");

    private By selectOptionFromHearAboutUsDD = By.xpath("//ul[@id='HearAboutUs_listbox']/li[3]");

    private By petNameInput = By.cssSelector("input[id='Question_139']");

    private By petBreedDropDown = By.xpath("//div[@id='Div_138']/div/div/span/span");

    private By optionFromPetBreedDD = By.xpath("//ul[@id='Question_138_listbox']/li[3]");

    private By petBreedGenderDropDown = By.xpath("//div[@id='Div_140']/div/div/span/span");

    private By optionFromPetBreedGenderDD = By.xpath("//ul[@id='Question_140_listbox']/li[3]");

    private By petDateOfBirth = By.xpath("//input[@id='Question_141']");

    private By petPurchasePrice = By.xpath("//div[@id='Div_142']/div/div/span/span/input[@id='Question_142']");

    private By petAdminFees = By.cssSelector("input[id='Question_231']");

    private By calculateButton = By.xpath("//button[@id='btnCalculate']");


    public String verifyManageQuotePage() {
        driver.findElement(quoteIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayedData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    public String verifyQuoteDateColumnForamt() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> quoteDateColumn = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[3]")));
        String date = "";
        for (WebElement quoteDate : quoteDateColumn) {
            date = date + " " + quoteDate.getText().toString();

        }
        return date;

    }

    public String verifyExpireDateColumnFormat() {
        WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> expireDateColumn = eWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[4]")));
        String date = "";
        for (WebElement expireDate : expireDateColumn) {
            date = date + " " + expireDate.getText().toString();

        }
        return date;

    }

    public void clickOnAddQuoteButton() {
        driver.findElement(addQuoteButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyAddQuotePage() {
        return driver.findElement(messageOnAddQuotePage).getText();
    }

    public String verifyTotalPremiumColumn() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", driver.findElement(monthlyPremiumColumn));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> yearlyPremiumColum = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[13]")));
        String yPremium = " ";
        for (WebElement amountP : yearlyPremiumColum) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;
    }

    public String verifyMonthlyPremiumColumn() {
        WebDriverWait mWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> monthlyPremiumColumn = mWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[14]")));
        String yPremium = " ";
        for (WebElement amountP : monthlyPremiumColumn) {
            yPremium = yPremium + " " + amountP.getText().toString();
        }
        return yPremium;

    }

    public String clickOnMicrochipButton() {
        driver.findElement(microchipButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String verifyDataOnMicrochipPage() {
        WebDriverWait rWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = rWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='MicrochipFileUploadAuditGrid']/table/tbody/tr")));
        String data = " ";
        for (WebElement rEle : totalRow) {
            data = data + " " + rEle.getText();
        }
        return data;
    }

    //Create and Verify Quote and policy for exotic

    public void selectExoticProductOfBreed() {

        Log.info("**********Generate Quote For Exotic Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfExoticFromProductDD).click();
        Log.info("Selected Breed Is==" + driver.findElement(optionOfExoticFromProductDD).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }


    }
    public void clientDetails(String datasetFile) throws Exception {
        client = clientActions.getClientDetails(datasetFile);

        setFirstName(client.getFirstName());
        setLastName(client.getLastName());
        setBirthDate(client.getBirthDate());
        setEmail(client.getEmail());
        setAddress1(client.getAddressCode());
        setContactNumber(client.getPrimaryContactNumber());
        System.out.println(client.getFirstName()+client.getPrimaryContactNumber());


    }

    public void setFirstName(String firstname) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(titleDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfTitleDD).click();
        Log.info("Client Title is== " + driver.findElement(optionOfTitleDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(firstName).sendKeys(firstname);
        Log.info("Client FirstName is==" + firstname);


    }

    public void setLastName(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
        Log.info("Client LastName is==" + lastname);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//div[@id='divfname']/div[4]/div/div/span")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//ul[@id='Gender_listbox']/li[2]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void setBirthDate(String dob) {
        driver.findElement(birthDate).sendKeys(dob);
        Log.info("Client Date Of Birth Is==" + dob);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setEmail(String EmailId) {
        driver.findElement(Email).sendKeys(EmailId);
        Log.info("Client Email Id Is==" + EmailId);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setAddress1(String postcode) {
        WebElement address = driver.findElement(By.cssSelector("input[id='Address1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", address);

        driver.findElement(addressCode).sendKeys(postcode);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfAddressCode).click();
        Log.info("Client PostCode Is==" + driver.findElement(optionOfAddressCode).getText());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setContactNumber(String contactNumbers) {
       // WebElement contact = driver.findElement(By.cssSelector("input[id='PrimaryContactNumber']"));
        //JavascriptExecutor jse = (JavascriptExecutor)driver;
       // jse.executeScript("arguments[0].value=contactNumbers;", contact);
        driver.findElement(contactNumber).sendKeys(contactNumbers);
        Log.info("Client Primary Contact Number Is==" + contactNumbers);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,100)", "");

        driver.findElement(hearAboutUsDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement optionOfHearAboutUs = driver.findElement(By.xpath("//ul[@id='HearAboutUs_listbox']/li[3]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", optionOfHearAboutUs);
       // driver.findElement(selectOptionFromHearAboutUsDD).click();
        Log.info("Client heared about company from==" + driver.findElement(selectOptionFromHearAboutUsDD).getText());

        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,-300)", "");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void exoticDetails(String datasetFile) throws Exception {
        exotic = getExoticDetails(datasetFile);
        setExoticName(exotic.getPetName());
        setExoticBirthDate(exotic.getBirthDate());
        setExoticPrice(exotic.getPrice());
    }

    public void setExoticName(String firstname) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(exoticPetName).sendKeys(firstname);
        Log.info("Exotic Species Name is==" + firstname);

    }

    public void setExoticBirthDate(String birthDate) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(exoticDateOfBirth).sendKeys(birthDate);
        Log.info("Exotic date of birth is==" + birthDate);

    }

    public void setExoticPrice(String price) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(exoticPrice).sendKeys(price);
        Log.info("Exotic purchased price is==" + price);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.findElement(By.id("Question_143")).click();

    }

    public void enterExoticDetails() {

        driver.findElement(speciesDropDownOfExotic).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesExoticDD).click();

        Log.info("Exotic Breed is==" + driver.findElement(optionOfSpeciesExoticDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(petGenderOfExoticDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetGenderExoticDD).click();
        Log.info("Exotic Gender is==" + driver.findElement(optionOfPetGenderExoticDD).getText());
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void calculateQuoteButton() {

        WebElement calculateButton = driver.findElement(By.id("btnCalculate"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", calculateButton);

        // Scrolling down the page till the element is found
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", calculateButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //calculateButton.click();

//        if (calculateButton.isEnabled()) {
//            calculateButton.click();
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            return false;
//        }
//
//
//        return true;
    }

    public void selectPlanForExoticBreed() {
        WebElement planCheckBox = driver.findElement(By.xpath("//div[@id='tab-MonthlyPremiumCalculation']/div/div/div/div/div/table/tbody/tr/th[2]/input"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", planCheckBox);
        //driver.findElement(plusPlanCheckBox).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void enterDetailsOfExoticForPolicy() {
        WebElement startDateOfPolicy1 = driver.findElement(By.id("Question_80"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", startDateOfPolicy1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(planStartDate).sendKeys("12/11/2023");
        Log.info("Cover Start Date is== 12/11/2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement assumptionRadioButton = driver.findElement(By.id("Question_82_340"));
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView();", assumptionRadioButton);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", assumptionRadioButton);
        Log.info("Client has clicked radio button of assumption ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement termsAndConditionCheckBox = driver.findElement(By.id("Question_137"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", termsAndConditionCheckBox);
        //driver.findElement(termsAndCondition).click();
        Log.info("Client has checked terms and condition check box");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    public void otherPaymentOption(){
        //Payment Details

        WebElement paymentFrequencyRadio = driver.findElement(By.id("PremiumFrequency_1"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", paymentFrequencyRadio);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click();", paymentFrequencyRadio);

        //driver.findElement(paymentFrequency).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Payment Frequency Option Selected By Client is==" + driver.findElement(paymentFrequency).getText());
        WebElement paymentOptionDropDown = driver.findElement(By.xpath("//div[@id='divPayment']/div/div/div/div/span/span"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].click();", paymentOptionDropDown);
        // driver.findElement(paymentOptionDropDown).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement OptionDropDown = driver.findElement(By.xpath("//ul[@id='PaymentTenderId_listbox']/li[5]"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("arguments[0].click();", OptionDropDown);
        // driver.findElement(optionOfPaymentDropDown).click();
        Log.info("Mode Of Payment  Option Selected By Client is==" +OptionDropDown.getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(createPolicyButton).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void creditCardPaymentMode(){
        //Payment Details

        WebElement paymentFrequencyRadio = driver.findElement(By.id("PremiumFrequency_1"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", paymentFrequencyRadio);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click();", paymentFrequencyRadio);

        //driver.findElement(paymentFrequency).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Payment Frequency Option Selected By Client is==" + driver.findElement(paymentFrequency).getText());
        WebElement paymentOptionDropDown = driver.findElement(By.xpath("//div[@id='divPayment']/div/div/div/div/span/span"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click();", paymentOptionDropDown);
        // driver.findElement(paymentOptionDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPaymentDebitCardDropDown).click();
        Log.info("Mode Of Payment  Option Selected By Client is==" + driver.findElement(optionOfPaymentDebitCardDropDown).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfCardTyeDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardHolderName).sendKeys("Nitesh Barot");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardNumber).sendKeys("4929421234600821");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardExpireMonthDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfCardExpireMonth).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardExpireYearDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfCardExpireYear).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(cardCvv).sendKeys("356");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(createPolicyButton).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void directDebitPaymentMode(){
        //Payment Details

        WebElement paymentFrequencyRadio = driver.findElement(By.id("PremiumFrequency_1"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", paymentFrequencyRadio);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].click();", paymentFrequencyRadio);

        //driver.findElement(paymentFrequency).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Log.info("Payment Frequency Option Selected By Client is==" + driver.findElement(paymentFrequency).getText());
        WebElement paymentOptionDropDown = driver.findElement(By.xpath("//div[@id='divPayment']/div/div/div/div/span/span"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].click();", paymentOptionDropDown);
        // driver.findElement(paymentOptionDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPaymentDirectDebitDD).click();
        Log.info("Mode Of Payment  Option Selected By Client is==" + driver.findElement(optionOfPaymentDirectDebitDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(sortCodeOfAccount).sendKeys("200000");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(directDebitAccountHolderName).sendKeys("Nitesh Barot");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(directDebitAccountHolderNumber).sendKeys("55117799");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(createPolicyButton).click();
        Log.info("Client Has clicked on generate Policy button==" + driver.findElement(createPolicyButton).getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //Generate quote and policy for Horse

    public void selectHorseProductOfBreed() {

        Log.info("**********Generate Quote For Horse Product Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfHorseIntroductoryDD).click();
        Log.info("Selected Breed Is==" + driver.findElement(optionOfHorseIntroductoryDD).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }


    public void horseDetails(String datasetFile) throws Exception {
        horse = getHorseDetails(datasetFile);
        setHorseName(horse.getPetName());
        setHorsePurchaseDate(horse.getPurchaseDate());
        setHorsePurchasePrice(horse.getPurchasePrice());
        setHorseMarketPrice(horse.getMarketPrice());
    }

    public void setHorseName(String firstname) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petHorseName).sendKeys(firstname);
        Log.info("Horse Species Name is==" + firstname);

    }

    public void setHorsePurchaseDate(String purchaseDateHorse) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement purchaseDate1 = driver.findElement(By.id("Question_159"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", purchaseDate1);
        driver.findElement(purchaseDate).sendKeys(purchaseDateHorse);
        Log.info("Horse date of birth is==" + purchaseDateHorse);

    }

    public void setHorsePurchasePrice(String purchasePrice1) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_160').style.display='block';");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // WebElement purchasePrice = driver.findElement(By.id("Question_160"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].click();", purchasePrice);
        driver.findElement(horsePurchaseFees).sendKeys(purchasePrice1);
        Log.info("Horse height is==" + purchasePrice1);

    }

    public void setHorseMarketPrice(String marketPrice) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_163').style.display='block';");
        //WebElement marketValue = driver.findElement(By.id("Question_163"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", marketValue);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseMarketValue).sendKeys(marketPrice);
        Log.info("Horse stud fees is==" + marketPrice);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_232').style.display='block';");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("Question_232")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



    public void enterHorseDetails() {

        driver.findElement(petHorseBreedDrpDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetHorseBreedDD).click();
        Log.info("Horse Breed is== " + driver.findElement(optionOfPetHorseBreedDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(horseColorDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfHorseColorDD).click();
        Log.info("Horse Color is== " + driver.findElement(optionOfHorseColorDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petHorseAgeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetHorseAgeDD).click();
        Log.info("Horse Age is== " + driver.findElement(optionOfPetHorseAgeDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petHorseSexDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetSexAgeDD).click();
        Log.info("Horse Sex Type is== " + driver.findElement(optionOfPetSexAgeDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petHorseHeightDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPetHorseHeightDD).click();
        Log.info("Horse Height is== " + driver.findElement(optionOfPetHorseHeightDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseActivityTypeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfHorseActivityTypeDD).click();
        Log.info("Horse activity is== " + driver.findElement(optionOfPetHorseHeightDD).getText());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petHorseOwnedDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfPrtHorseOwnedDD).click();
        Log.info("Horse ownership type is== " + driver.findElement(optionOfPrtHorseOwnedDD).getText());

    }


    public void enterDetailsOfPolicyForHorse() {

      driver.findElement(calculateButton).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(calculateButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement plan=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divCalculationMoreMonthly']/div[3]/div[1]/div/table/tbody/tr/th[3]/div/input")));

        driver.findElement(basicPlanHorse).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement startDate = driver.findElement(By.id("Question_166"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", startDate);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(policyStartDate).sendKeys("11/11/2023");
        Log.info("Policy Start Date is==11.11.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       driver.findElement(nameOfInsurerIfOtherDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfNameOfInsurerIfOtherDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(horseDateOfBirth).sendKeys("15/05/2016");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement vettedDropDown = driver.findElement(By.xpath("//div[@id='Div_172']/div/div/span"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", vettedDropDown);
        //driver.findElement(petHorseVettedDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionPetVettedHorseDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(question1Horse).click();
        Log.info("Client Has clicked on disclosure");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(acceptCondition).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }

    //Generate quote and policy for Professional

    public void selectProfessionalProductOfBreed() {

        Log.info("**********Generate Quote For Professional Product Test Case Starts Here************");

        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        driver.findElement(optionOfProfessionalIntroductoryDD).click();
        Log.info("Selected Breed Is==" + driver.findElement(optionOfProfessionalIntroductoryDD).getText());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
    }

    public void enterProfessionalDetails() {

        driver.findElement(businessActivityDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfBusinessActivityDD).click();
        Log.info("Professional business type is== " + driver.findElement(optionOfBusinessActivityDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(businessDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfBusinessDD).click();
        Log.info("Professional business is== " + driver.findElement(optionOfBusinessDD).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(employeeRadioButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public void enterDetailsOfProfessionalForPolicy() {

        driver.findElement(calculateButton).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement startDate = driver.findElement(By.id("Question_11001"));
        // Scrolling down the page till the element is found
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView();", startDate);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        startDate.sendKeys("11/11/2023");
        Log.info("Policy Start Date is==11.11.2023");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(businessRadioButton).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(insurerRadio).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(assumptionRadio).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(checkBox1).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(checkBox2).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(checkBox3).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }


    public String verifyProductList() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(productListDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> pList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("ul[id='PrimaryProductId_listbox']>li")));
        System.out.println(pList.size());

        String verfiy = " ";
        for (WebElement product : pList) {

            verfiy = verfiy + product.getText() + " ";

        }
        return verfiy;
    }

    public String fetchDataOfQuoteInformation() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody[1]/tr/td[2]/a")));
        String displayMessage = " ";
        for (WebElement cEle : totalColumn) {
            System.out.println(cEle.getText());

            cEle.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println(driver.getCurrentUrl());
            displayMessage = displayMessage + driver.findElement(displayedMessage).getText();
            driver.close();
            driver.switchTo().window(tabs2.get(0));

        }
        return displayMessage;

    }
// Items on manage quote page displays upon item select from quote status dropdown
    public void SelectItemFromDropDown() {
        driver.findElement(quoteStatusDropDown).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(statusOpen).click();
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String fetchAndVerifyDataAgainstDropDown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;
    }

    //Fetch list of quote based upon product drop down

    public void selectOptionFromProductDropDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(productDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromProductDD).click();
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<WebElement> verifyListOfQuoteBasedOnProductDD() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> listOfProduct = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        return listOfProduct;

    }
    //Fetch list of quote based on option from Is referred dropdown on manage quote page

    public void selectOptionFromIsReferredDropDown() {

        driver.findElement(isReferredDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromIsReferredDD).click();

    }



    public String verifyListOfQuoteBasedOnIsReferredDD() {
        return  driver.findElement(detailsOfQuotes).getText();

    }


    //Fetch list of quote based on option from division dropdown on manage quote page

    public void selectOptionFromDivisionDropDown() {

        driver.findElement(divisionDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionsFromDivisionDD).click();

    }



    public String verifyListOfQuoteBasedOnDivisionDD() {
        return  driver.findElement(detailsOfQuotes).getText();

    }

    //Fetch quote on manage quote page based on quote number for UK2 Qa

    public void enterQuoteNumberInsideSearchBox() {
        driver.findElement(quoteSearchBox).sendKeys("Q0043752");
    }

    public String verifyQuoteDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement quoteInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]")));
        return quoteInfo.getText();
    }

    //Verify include payment feature of quote module for Qa

    public void selectIncludePaymentCheckBox() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(includePaymentCheckBox).click();


    }

    public String verifyIncludePaymentDetailsOfQuote() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement quoteInfoIncludePayment = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", quoteInfoIncludePayment);
        //WebDriverWait wait=new WebDriverWait(driver,10);
        // WebElement quoteInfoIncludePayment=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return quoteInfoIncludePayment.getText();
    }

    //Edit quote information and verifies the same

    public void selectEditQuoteOption() {
        WebElement cogIcon = driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[18]/ul/li[1]/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cogIcon);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(selectCogIcon)).perform();
        driver.findElement(selectEditQuoteIcon).click();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void editQuoteDetails() {
        //Scroll up
        //Scroll up
        //JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0,500)", "");
        /*driver.findElement(enterPostCodeInAddressDropDown).clear();
        driver.findElement(enterPostCodeInAddressDropDown).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectPostCodeFromDD).click();*/

        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(hearAboutUsDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(selectOptionFromHearAboutUsDD).click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/


        //Scroll up
      //  JavascriptExecutor js1 = (JavascriptExecutor) driver;
        //js1.executeScript("window.scrollBy(0,-250)", "");
        driver.findElement(petBreedDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromPetBreedDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petNameInput).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petNameInput).sendKeys("TestEditQuote");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petBreedGenderDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromPetBreedGenderDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(petDateOfBirth).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDateOfBirth).sendKeys("02.08.2020");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");
        driver.findElement(petPurchasePrice).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");
        driver.findElement(petPurchasePrice).sendKeys("500");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_231').style.display='block';");
        driver.findElement(petAdminFees).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_231').style.display='block';");
        driver.findElement(petAdminFees).sendKeys("20");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver.findElement(calculateButton).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", driver.findElement(calculateButton));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,150)", "");


        //driver.findElement(petPurchaseDate).clear();
        //driver.findElement(petPurchaseDate).sendKeys("23/08/2022");

    }


}
