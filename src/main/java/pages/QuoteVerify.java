package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class QuoteVerify {
    private WebDriver driver;

    public QuoteVerify(WebDriver driver) {
        this.driver = driver;
    }


    private By Cookies = By.xpath("//div[@class='cky-notice-btn-wrapper']/button[3]");

    private By petSpeciesDropDown = By.xpath("//div[@class='btn-group bootstrap-select form15 form-control col-md-1']");

    private By petSpeciesValue = By.xpath("//div[@class='dropdown-menu open']/ul/li[9]");

    private By petName = By.cssSelector("input[id='PetName_1']");

    private By petGenderDropdown = By.id("PetGender_1");

    private By petDateOfBirth = By.cssSelector("input[id='PetDOB_1']");

    private By petPrice = By.cssSelector("input[id='PetPrice_1']");

    private By nextButton = By.cssSelector("button[id='btnstep1next']");

    private By customerTitle = By.id("Title");

    private By customerFirstName = By.cssSelector("input[id='FirstName']");

    private By customerLastName = By.cssSelector("input[id='LastName']");

    private By customerDateOfBirth = By.cssSelector("input[id='BirthDate']");

    private By customerEmail = By.cssSelector("input[id='Email']");

    private By customerAddressDropDown = By.cssSelector("input[id='Address1']");

    private By customerAddressDDValue = By.xpath("//div[@id='cc_c2a']/ul/li[1]");

    private By customerPhone = By.cssSelector("input[id='Phone']");

    private By firstRadio = By.cssSelector("input[id='Nominate_2']");

    private By secondRadio = By.cssSelector("input[id='expirednoti_2']");

    private By lastRadio = By.cssSelector("input[id='othernoti_2']");

    private By premierValue = By.xpath("//span[@class='QuotationCCTotalPremiumLowPremierPerMonth lowExcessMonthlyPremium']");

    private By plusValue = By.xpath("//span[@class='QuotationCCTotalPremiumLowStandardPerMonth lowExcessMonthlyPremium']");

    private By valuePrice = By.xpath("//span[@class='QuotationCCTotalPremiumLowValuePerMonth lowExcessMonthlyPremium']");

    private By saveButton = By.xpath("//button[@id='PremierSaveQuote']");


    public void clickOnCookies() {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(Cookies).click();
    }

    public String enterPetDetails() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,270)", "");
        driver.findElement(petSpeciesDropDown).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petSpeciesValue).click();

        driver.findElement(petName).sendKeys("Perhu");

        Select se = new Select(driver.findElement(petGenderDropdown));

// Select the option by index
        se.selectByValue("2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(petDateOfBirth).sendKeys("18/04/2022");
        driver.findElement(petPrice).sendKeys("100");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(nextButton).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(By.cssSelector("div[class='repeat-box screenDiv Counter']>h2")).getText();


    }

    public void enterCustomerDetail() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,270)", "");
        Select se = new Select(driver.findElement(customerTitle));

// Select the option by index
        se.selectByValue("1");

        driver.findElement(customerFirstName).sendKeys("Rocky");
        driver.findElement(customerLastName).sendKeys("John");
        driver.findElement(customerDateOfBirth).sendKeys("12/08/1986");
        driver.findElement(customerEmail).clear();
        driver.findElement(customerEmail).sendKeys("nitesh.barot31@yahoo.com");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(customerAddressDropDown).sendKeys("RM8 2TE");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement addressDD = driver.findElement(By.xpath("//div[@id='cc_c2a']/ul/li[1]"));
        System.out.println(addressDD.getText());
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", addressDD);
        driver.findElement(customerPhone).sendKeys("07459170022");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement radioBtn1 = driver.findElement(By.xpath("//div[@class='form-group required multi-line']/div[1]/div[2]/input[@id='Nominate_2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn1);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[id='expirednoti_2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn2);

        WebElement radioBtn3 = driver.findElement(By.cssSelector("input[id='othernoti_2"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtn3);
        driver.findElement(By.xpath("//button[@id='Step2_Next']")).click();


    }

    public String fetchQuotePrice() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,950)", "");
        String premireValue = driver.findElement(premierValue).getText();

        WebElement saveButton = driver.findElement(By.xpath("//button[@id='PremierSaveQuote']"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", saveButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return premireValue;
    }

    public void url(String url){

        driver.get(url);


    }
    public String UserClickOnInbox(){
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("nitesh.barot31@yahoo.com");
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Chesta98barot");
        driver.findElement(By.xpath("//button[@id='login-signin']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("div[class$='c22hqzz_GN ']>ul>li:nth-child(3)>a")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
        String value=driver.findElement(By.cssSelector("div[class^='jb_0 X_6MGW ']>div>div>div>div>table>tbody>:nth-child(2)>td>table>tbody>tr:nth-child(2)>:nth-child(2)>div>table>tbody>:nth-child(4)>td>table>tbody>:nth-child(12)>td>:nth-child(1)>tbody>:nth-child(2)>:nth-child(1)>span")).getText();
        //System.out.println(value);
        return value;



    }
}

