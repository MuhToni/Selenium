package syntax.class01.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "Driver/ChromeDriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.facebook.com");
    driver.navigate().to("http://www.google.com");
    driver.navigate().back();
    driver.navigate().forward();
    Thread.sleep(2000); //= 2 seconds
        //add exception to method signature
    driver.navigate().refresh();
    //driver.close(); will close the current tab
    //driver.quit(); will quit the whole browser

}

}
