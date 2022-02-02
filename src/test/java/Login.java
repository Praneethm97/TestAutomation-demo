import PageObjects.LoginPage;
import Super.Supertestscript;
import com.Excel.ExcelOperations;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Common.Custom;

@Listeners(Custom.class)
public class Login extends Supertestscript {

    @Test
    public void log(){
        String user = ExcelOperations.readStringData("TC-01",2,2);
        String pass = ExcelOperations.readStringData("TC-01",2,3);
        LoginPage l = new LoginPage();
        l.enterCredentials(user);
        l.enterPassword(pass);
        l.enter();
    }
}
