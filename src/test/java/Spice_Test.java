import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class Spice_Test {
    SHAFT.GUI.WebDriver driver;



    @Test
    public void testcase(){
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://www.spicejet.com/");
        new  Spiceject(driver).click();
    }
    @AfterClass
    public void finish(){
        driver.quit();
    }
}
