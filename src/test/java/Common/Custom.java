package Common;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Custom implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        String name = result.getName();
        try {
            Commonlibrary.takeScreenshot(name);
        } catch (IOException e) {

        }
    }
}
