import com.Excel.ExcelOperations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM
{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("Webdriver.chrome.driver","F:\\Praneeth\\Drivers\\chromedriver.exe");
        ChromeDriver ff = new ChromeDriver();
        ff.get(ExcelOperations.readStringData("TC-01",2,1));
    }

}
