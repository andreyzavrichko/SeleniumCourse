import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

    public static void main(String[] args) {
        WebDriver auto = new ChromeDriver();
        auto.get("https://unsplash.com/");
        auto.findElement(By.className("TkpKu")).click();
    }
}
