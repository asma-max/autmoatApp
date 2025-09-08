package Steps;

import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PreDdefinedSteps{



    @Then("j'ouvre l'url")
    public void test() throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        // accepte les coockies
        WebElement accepte = driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]"));

        accepte.click();

        Thread.sleep(5000);



        driver.quit();
    }

}