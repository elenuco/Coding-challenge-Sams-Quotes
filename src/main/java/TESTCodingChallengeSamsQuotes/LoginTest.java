package TESTCodingChallengeSamsQuotes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public static  void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://quotes.toscrape.com/");
        driver.manage().window().maximize();
        //This is the time of excecution
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));

        //Access to log in
        WebElement login = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
        login.isDisplayed();
        login.isEnabled();
        login.click();
        //Provide username
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("admin");

        //provide password
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("admin");

        //Clicking on a login button
        WebElement LoginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        LoginButton.isDisplayed();
        LoginButton.isEnabled();
        LoginButton.click();
        //Close window
        driver.close();

    }

}
