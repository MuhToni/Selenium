package syntax.class01.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main (String [] args) {
    System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.amazon.com");
    String title = driver.getTitle();
    String url = driver.getCurrentUrl();
    System.out.println(title+""+url);
    driver.quit();

    }
}
