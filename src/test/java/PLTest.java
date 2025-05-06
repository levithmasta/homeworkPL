import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PLTest {
    public static void main(String[] args) {

        By.id("firstname");
        By.name("formSubmit");
        By.cssSelector("input.inputbox[type='text'][value='Norway']");
        By.className("");
        By.xpath("//input[@type='text' and @value='me@whatyouknow.com']");

    }


}
