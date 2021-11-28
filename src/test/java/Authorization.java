import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authorization {

    WebDriver driver = new ChromeDriver();
    Data getDate = new Data();

    private By btnLogin = By.xpath("//a[@href='/login']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");
    private By btnJoin = By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");
    private By getErrorText = By.xpath("//div[@class='row']//div[@class='col-xs-10 col-sm-6 center-block flash__message']");





    @Test
    public void authorization(){

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btnJoin).click();
    }

    @Test
    public void negAuthorization(){

        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        driver.findElement(btnLogin).click();
        driver.findElement(inputEmail).sendKeys(getDate.email);
        driver.findElement(inputPassword).sendKeys(getDate.password);
        driver.findElement(btnJoin).click();
       String getError = driver.findElement(getErrorText).getText();

        Assert.assertEquals("Invalid email or password.", getError);
    }
}
