package TESTCodingChallengeSamsQuotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://quotes.toscrape.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/p/a"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}