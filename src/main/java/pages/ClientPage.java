package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClientPage {
    private WebDriver driver;

    public ClientPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    private By clientIcon = By.cssSelector("ul[id='side-menu']>li:nth-child(3)");
    private By displayedMessage = By.xpath("//div[@id='page-wrapper']/div[3]/div/h2");

    private By searchBox = By.cssSelector("input[id='SearchText']");

    private By searchButton = By.cssSelector("button[id='SearchGrid']");

    private By statusDropDown = By.xpath("//div[@class='ibox-content-search m-b-sm']/div/div[2]/div/span/span");

    private By clientStatus = By.xpath("//ul[@id='IsActive_listbox']/li[2]");

    private By displayedStatus = By.xpath("//div[@class='tooltip-demo pull-right']/div/button");

    private By addQuoteForClient = By.cssSelector("a[id='btnAddClientView']");

    private By existingClientId = By.xpath("//div[@id='loadpartialview']/div/div/div[2]/div/div");

    //Edit client page

    private By cogIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/a");

    private By editClientIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/ul/li[1]");

    //Tab  details on view client page

    private By policyIcon = By.xpath("//div[@class='ibox-content project-content']/div/ul/li[1]/a");

    private By policyDetails = By.xpath("//div[@id='gridClientPolicyList']/table/tbody/tr");

    private By claimIcon = By.xpath("//div[@class='ibox-content project-content']/div/ul/li[2]/a");

    private By claimDetails = By.xpath("//div[@id='gridNameClientClaim']/table/tbody/tr");

    private By contactIcon = By.xpath("//div[@class='ibox-content project-content']/div/ul/li[3]/a");

    private By contactDetails = By.xpath("//div[@id='gridName']/table/tbody/tr");

    private By noteIcon = By.xpath("//div[@class='ibox-content project-content']/div/ul/li[4]/a");

    private By noteDetailsOnViewClient = By.xpath("//div[@id='gridClientNoteName']/table/tbody/tr");

    private By taskIcon = By.xpath("//div[@class='ibox-content project-content']/div/ul/li[5]/a");

    private By taskDetailsOnViewClient = By.xpath("//div[@id='gridClientTaskName']/table/tbody/tr");

    //Add client scenario
    private By addClientButton = By.xpath("//div[@class=' tooltip-demo pull-right']/a[2]");

    private By clientTypeRadioButton = By.cssSelector("input[id='ClientTypeId_1']");

    private By titleDropDown = By.xpath("//div[@id='dvClientName']/div/div/div/div/span/span");

    private By titleValue = By.xpath("//ul[@id='Title_listbox']/li[2]");

    private By firstName = By.cssSelector("input[id='FirstName']");

    private By lastName = By.cssSelector("input[id='LastName']");

    private By genderDropDown = By.xpath("//span[@aria-owns='Gender_listbox']/span");

    private By genderValue = By.xpath("//ul[@id='Gender_listbox']/li[2]");

    private By birthDate = By.cssSelector("input[id='BirthDate']");

    private By Address = By.cssSelector("input[id='Address1']");

    private By postCodeOfAddress = By.xpath("//ul[@class='c2a_results']/li[2]");

    private By okButtonPopUp = By.cssSelector("button[class='dismissButton']");

    private By emailId = By.cssSelector("input[id='Email']");

    private By primaryContact = By.cssSelector("input[id='PrimaryContactNumber']");

    private By createButton = By.cssSelector("button[value='Create']");

    private By displayMessageOfViewClientPage = By.xpath("//div[@class='row wrapper border-bottom white-bg page-heading']/div/h2");

    //Add quote on client

    private By addQuoteIcon = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/ul/li[2]");
    private By productDropdown = By.xpath("//div[@class='ibox-content']/div/div/div[4]/div/div/span");

    private By optionOfProductDropDown = By.xpath("//ul[@id='PrimaryProductId_listbox']/li[2]");

    private By AddressOfClient = By.cssSelector("input[id='Address1']");

    private By optionOfAddress = By.xpath("//div[@id='cc_c2a']/ul/li[3]");

    private By radioButton = By.cssSelector("input[id='Question_234_278']");

    private By speciesDropDown = By.xpath("//div[@id='Div_138']/div/div/span");

    private By optionOfSpeciesDD = By.xpath("//ul[@id='Question_138_listbox']/li[3]");

    private By nameOfSpecies = By.cssSelector("input[id='Question_139']");

    private By genderDropDownAddQuote = By.xpath("//div[@id='Div_140']/div/div/span");

    private By optionOfGenderDD = By.xpath("//ul[@id='Question_140_listbox']/li[3]");

    private By dateOfBirth = By.cssSelector("input[id='Question_141']");

    private By priceOfSpecies = By.cssSelector("input[id='Question_142']");

    //Add contact details of client

    private By settingDropDown = By.xpath("//div[@class='dropdown']/a");

    private By addContactOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[5]");

    private By userName = By.cssSelector("input[id='Name']");

    private By userEmail = By.cssSelector("input[id='Email']");

    private By userRelation = By.cssSelector("input[id='JobTitle']");

    private By userMobile = By.cssSelector("input[id='Mobile']");

    private By Button = By.xpath("//button[@value='Create']");

    private By contactMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[3]");

    private By contactData = By.xpath("//div[@id='gridName']/table/tbody/tr[1]");

    //Add notes details of client

    private By addNotesOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[6]/a");

    private By titleOfNote = By.cssSelector("input[id='Title']");

    private By descriptionOFNote = By.cssSelector("textarea[id='Description']");

    private By createButtonOfWindow = By.xpath("//button[@type='submit' and @title='Create']");

    private By noteTabOFMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[4]/a");

    private By noteDetails = By.xpath("//div[@id='gridClientNoteName']/table/tbody/tr[1]");

    //Add task details of client

    private By addTaskOptionOfDD = By.xpath("//ul[@class='dropdown-menu']/li[7]/a");

    private By titleOfTask = By.cssSelector("input[id='Title']");

    private By statusDropDownOfTask = By.xpath("//div[@class='ibox-content']/div[1]/div[1]/div[3]/div/div/div/div/span");

    private By optionFromStatusDD = By.xpath("//ul[@id='TaskStatusId_listbox']/li[2]/span/span");

    private By priorityDropDown = By.xpath("//div[@class='ibox-content']/div[1]/div[1]/div[4]/div/div/div/span");

    private By optionFromPriority = By.xpath("//ul[@id='TaskPriorityId_listbox']/li[4]");

    private By typeDropDown = By.xpath("//div[@class='ibox-content']/div[1]/div[1]/div[5]/div/div/div/span");

    private By optionFromTypeDD = By.xpath("//ul[@id='TaskTypeId_listbox']/li[2]");

    private By endDate = By.xpath("//input[@id='EndDate']");

    private By createButtonOfTask = By.xpath("//button[@type='submit' and @value='Create']");

    private By taskTabOFMenu = By.xpath("//div[@class='project-tabs user-profile dsh-tab']/ul/li[5]/a");

    private By taskDetails = By.xpath("//div[@id='gridClientTaskName']/table/tbody/tr[1]");

    //Edit client test case

    private By editClientOptionsFromDD = By.xpath("//ul[@class='dropdown-menu']/li[1]");

    private By clientFirstName = By.cssSelector("input[id='FirstName']");

    private By clientLastName = By.cssSelector("input[id='LastName']");

    private By clientBirthDate = By.cssSelector("input[id='BirthDate']");

    private By clientPostAddressCode = By.cssSelector("input[id='Address1']");

    private By clientAddressFromDD = By.xpath("//div[@id='cc_c2a']/ul/li[3]");

    private By clientEmail = By.cssSelector("input[id='Email']");

    private By clientContact = By.cssSelector("input[id='PrimaryContactNumber']");

    // private By saveButton = By.xpath("//button[@type='button' and @value='Create']");


    //Add Primary contact for client on production

    private By settingIconOnProd = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/a");

    private By primaryContactIconFromDD = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/ul/li[5]/a");

    private By addNotesFromDDForProd = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/ul/li[6]/a");

    private By addTaskFromDDForProd = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/ul/li[7]/a");

    private By editClientFromDDForProd = By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/ul/li[1]/a");


    public String verifyClientManage() {
        driver.findElement(clientIcon).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(displayedMessage).getText();
    }

    public String fetchAndDisplayData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalRow = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr")));
        String array = " ";
        for (WebElement rEle : totalRow) {
            array = array + " " + rEle.getText();
        }
        return array;

    }

    public void enterCodeDetails() {
        driver.findElement(searchBox).sendKeys("RAOA-0001");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyClient() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> clientInfo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        String clientCode = " ";
        for (WebElement client : clientInfo) {
            clientCode = client.getText();
            break;
        }
        return clientCode;
    }

    public void selectClientStatus() {
        driver.findElement(statusDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientStatus).click();
    }

    public void clickClientCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> clientInfo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]")));
        for (WebElement client : clientInfo) {
            client.click();

            break;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyClientStatus() {


        ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style','overflow: inline;');", driver.findElement(By.xpath("//button[@class='btn btn-info btn-sm']")));
        String Status = driver.findElement(By.xpath("//div[@class='tooltip-demo pull-right']/div/button")).getText();

        return Status;
    }

    //view client page should displays with all details for each client code link on manage client page

    public String clickOnClientCodeOnManageClient() {
        WebDriverWait cWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> totalColumn = cWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr/td[2]/a")));

        String displayMessage = " ";
        for (WebElement cEle : totalColumn) {
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
            //break;

        }
        return displayMessage;

    }

    //Edit client page should display in editable format by clicking on edit client icon on cog dropdown menu on view client page

    public void clickOnEditClientIcon() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(editClientIcon).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void verifyEditClientPage() {
        driver.findElement(clientFirstName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientFirstName).sendKeys("Nitesh");
        driver.findElement(clientLastName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Barot");
        driver.findElement(clientBirthDate).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientBirthDate).sendKeys("12/09/1980");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       /* new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='Address1']"))).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Address1']"))).sendKeys("RM8 2TE");
       // driver.findElement(clientPostAddressCode).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientAddressFromDD).click();*/


        driver.findElement(clientEmail).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmail).sendKeys("nik@gmail.com");

        driver.findElement(clientContact).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientContact).sendKeys("07459170022");

    }

    //Add quote page should display in editable format by clicking on add quote icon on cog dropdown menu on view client page

    public void clickOnAddQuoteIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(cogIcon)).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(addQuoteIcon).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void verifyAddQuotePage() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(productDropdown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfProductDropDown).click();
       /* JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10)", "");
        driver.findElement(AddressOfClient).clear();
        driver.findElement(AddressOfClient).sendKeys("RM8 2TE");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(optionOfAddress).click();
        JavascriptExecutor js1=(JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,-150)", "");*/
        // driver.findElement(radioButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(speciesDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfSpeciesDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(nameOfSpecies).sendKeys("Test Data");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(genderDropDownAddQuote).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionOfGenderDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(dateOfBirth).sendKeys("12.09.2020");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ((JavascriptExecutor) driver).executeScript("document.getElementById('Question_142').style.display='block';");
        driver.findElement(priceOfSpecies).sendKeys("1500");


    }

    //To check whether add quote page is displays for same user by clicking on add button on view client page
    public String clickClientCodeToGetClientNumber() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clientInfo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        String clientNumber = clientInfo.getText();
        System.out.println(clientNumber);
        clientInfo.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return clientNumber;
    }


    public void clickOnAddQuoteButton() {
        driver.findElement(addQuoteForClient).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyExistingClientOnAddQuote() {
        return driver.findElement(existingClientId).getText();
    }

    //Policies details of client displays by clicking on policy tab on view client page
    public void clickOnPolicyIcon() {
        //WebElement element=driver.findElement(By.xpath("//div[@class='ibox-content project-content']/div/ul/li[1]"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();", element);
       // driver.findElement(policyIcon).click();
        driver.findElement(By.xpath("//a[contains(.,'Policies')]")).click();
        //WebDriverWait wait=new WebDriverWait(driver,10);
       // WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='ibox-content project-content']/div/ul/li[1]")));
       // element.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyPolicyDetails() {
        return driver.findElement(policyDetails).getText();

    }

    //Claims details of client displays by clicking on policy tab on view client page

    public void clickOnClaimIcon() {
        driver.findElement(claimIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyClaimDetails() {
        return driver.findElement(claimDetails).getText();

    }

    //Contacts details of client displays by clicking on contact tab on view client page

    public void clickOnContactIcon() {
        driver.findElement(contactIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyContactDetails() {
        return driver.findElement(contactDetails).getText();

    }

    //Notes details of client displays by clicking on notes tab on view client page

    public void clickOnNotesIcon() {
        driver.findElement(noteIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyNotesDetails() {
        return driver.findElement(noteDetails).getText();

    }

    //Task details of client displays by clicking on task tab on view client page

    public void clickOnTaskIcon() {
        driver.findElement(taskIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String verifyTaskDetails() {
        return driver.findElement(taskDetails).getText();

    }

    //Add client scenario

    public void clickOnAddClientButton() {
        driver.findElement(addClientButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterUserDetails() {
        String clientType = driver.findElement(By.xpath("//div[@class='ibox-content']/div[2]/div/div/div")).getText();
        String clientRadio[] = clientType.split(" ");
        if (clientRadio[0].equals("Individual")) {
            driver.findElement(titleDropDown).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(titleValue).click();
            driver.findElement(firstName).sendKeys("Deep");
            driver.findElement(lastName).sendKeys("Rao");
            driver.findElement(genderDropDown).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(genderValue).click();
            driver.findElement(birthDate).sendKeys("19/06/1987");
            driver.findElement(Address).sendKeys("RM8 2TE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(postCodeOfAddress).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //Alert simpleAlert = driver.switchTo().alert();
            //simpleAlert.accept();
            driver.findElement(emailId).sendKeys(Constant.getSaltString() + "@gmail.com");
            driver.findElement(primaryContact).sendKeys("4444444444");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void clickOnCreateClientButton() {
        if (driver.findElement(createButton).isEnabled()) {
            driver.findElement(createButton).click();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String verifyCreatedClient() {
        return driver.findElement(displayMessageOfViewClientPage).getText();
    }

//Add contact details of client

    public void openViewClient() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        element.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectAddContactOfClient() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        WebElement settingDropDown = driver.findElement(By.xpath("//a[@id='dropdownMenu1']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", settingDropDown);
        actions.moveToElement(settingDropDown).perform();
        driver.findElement(addContactOptionOfDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void enterContactDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(userName).sendKeys("Maitry");
        driver.findElement(userEmail).sendKeys("maitry@gmail.com");
        driver.findElement(userRelation).sendKeys("Wife");
        driver.findElement(userMobile).sendKeys("9898989898");
        driver.findElement(Button).click();

    }


    public void clickOnCreateButton() {

    }

    public String verifyGeneratedContactDetails() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(contactMenu).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(contactData).getText();

    }


    //Add notes information for client

    public void selectAddNotesOfClient() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(addNotesOptionOfDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void enterNotesDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(titleOfNote).sendKeys("Test");
        driver.findElement(descriptionOFNote).sendKeys("Test Test Test");

        driver.findElement(createButtonOfWindow).click();

    }

    public String verifyGeneratedNotesDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(noteTabOFMenu).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(noteDetails).getText();
    }

    //Add task details of client

    public void selectAddTaskOfClient() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(settingDropDown)).perform();
        driver.findElement(addTaskOptionOfDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void enterTaskDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(titleOfNote).sendKeys("Test");
        driver.findElement(statusDropDownOfTask).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromStatusDD).click();
        driver.findElement(priorityDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromPriority).click();
        driver.findElement(typeDropDown).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(optionFromTypeDD).click();
        driver.findElement(endDate).sendKeys("12/06/2023");
        driver.findElement(createButtonOfTask).click();


    }

    public String verifyGeneratedTaskDetails() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(taskTabOFMenu).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(taskDetails).getText();
    }

    //Edit client details

    public void selectEditClientDetails() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(settingDropDown)).perform();
        WebElement settingDropDown = driver.findElement(By.xpath("//a[@id='dropdownMenu1']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", settingDropDown);
        actions.moveToElement(settingDropDown).perform();
        driver.findElement(editClientOptionsFromDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void editClientData() {
        driver.findElement(clientFirstName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientFirstName).sendKeys("Nitesh");
        driver.findElement(clientLastName).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientLastName).sendKeys("Barot");
        driver.findElement(clientBirthDate).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientBirthDate).sendKeys("12.09.1980");

        driver.findElement(clientPostAddressCode).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientPostAddressCode).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientAddressFromDD).click();

        driver.findElement(clientEmail).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientEmail).sendKeys("nik@gmail.com");

        driver.findElement(clientContact).clear();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(clientContact).sendKeys("07459170022");
        // driver.findElement(saveButton).click();
    }

    public String verifyUpdatedClient() {
        return driver.findElement(By.cssSelector("ul[class='iconlist']>li")).getText();
    }

    //Add client primary contact details on production

    public void enterClientCode() {
        driver.findElement(searchBox).sendKeys("TEST-0325");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void SelectPrimaryContactFromSetting() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/a"))).perform();
        driver.findElement(primaryContactIconFromDD).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void clickONClientCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> clientInfo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[2]")));
        for (WebElement client : clientInfo) {
            client.click();
            break;

        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Add client note feature for production

    public void SelectAddNotesFromSetting() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/a"))).perform();
        driver.findElement(addNotesFromDDForProd).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //Add Task for client on Production

    public void SelectAddTaskFromSetting() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/a"))).perform();
        driver.findElement(addTaskFromDDForProd).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    //verify edit client feature on production

    public void SelectEditClientFromSetting() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[@id='gridName']/table/tbody/tr[1]/td[7]/ul/li/a"))).perform();
        driver.findElement(editClientFromDDForProd).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
