import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Spiceject
{
    SHAFT.GUI.WebDriver driver;
public Spiceject(SHAFT.GUI.WebDriver driver){this.driver = driver;}
    By radio_bt = By.xpath("//*[@class=\"css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa\"]");
    By redio_bts= By.xpath("(//*[@class=\"css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa\"])[6]");

    public void click(){
       int lengh =  driver.element().getElementsCount(radio_bt);
        System.out.printf(String.valueOf(driver.element().getElementsCount(radio_bt)));
        for (int i = 0; i < lengh; i++) {
            driver.element().click(redio_bts);

        }
    }
}
