import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindImage {

    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();


       private By getText = By.xpath("//p[contains(@class,'ObPWP LAU8F')]");


    @Test
    public void negFindText(){
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();

        String getTextVisualSearch = driver.findElement(getText).getText();

        Assert.assertEquals("Unsplash Awards", getTextVisualSearch);




    }

}
