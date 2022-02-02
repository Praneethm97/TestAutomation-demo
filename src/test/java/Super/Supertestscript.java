package Super;

import com.Excel.ExcelOperations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Supertestscript {
    public static WebDriver driver;
    @BeforeTest
    public void open(){
       String browser = ExcelOperations.readStringData("TC-01",2,4);
       if(browser.equals("Chrome")){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       }
       else if(browser.equals("firefox")){
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
       }
        driver.get(ExcelOperations.readStringData("TC-01",2,1));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterTest
    public void close(){

        driver.quit();
    }
}
