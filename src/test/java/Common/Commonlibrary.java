package Common;

import Super.Supertestscript;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Commonlibrary {

    public static void selectValue(WebElement ele,String val){
        Select s = new Select(ele);
        s.selectByValue(val);

    }
    public static void selectIndex(WebElement ele,int ind){
        Select s = new Select(ele);
        s.selectByIndex(ind);

    }
    public static void selectText(WebElement ele,String text){
        Select s = new Select(ele);
        s.selectByVisibleText(text);

    }
    public static void takeScreenshot(String name) throws IOException {
        EventFiringWebDriver e= new EventFiringWebDriver(Supertestscript.driver);
        File source= e.getScreenshotAs(OutputType.FILE);
        File destination = new File("F:\\Praneeth\\Screenshots"+name);
        FileUtils.moveFile(source,destination);

    }

}
