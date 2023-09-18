package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLoad {

    public  void waitForPageLoad(WebDriver driver, int timeout) {

        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver driver) {

                return ((JavascriptExecutor)driver). executeScript("return document.readyState")
                        .toString().equals("complete");}

        };

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(pageLoadCondition);

    }
}
