import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkool on 7/14/2017.
 */
public class email {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dkool\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.va-doeapp.com/SuperintendentBySchoolDivisions.aspx?w=true");
        Thread.sleep(5000);

        List<WebElement> elements;
        elements = driver.findElements(By.xpath("//a[contains(@href, 'mailto:')]"));

        for (WebElement e: elements) {
           System.out.println(e.getAttribute("href").substring(7) + ";");
        }

    }
}
