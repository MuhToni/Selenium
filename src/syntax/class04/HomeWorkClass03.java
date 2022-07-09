package syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkClass03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement startPractising = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPractising.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a" +
                ""));
        simpleFormDemo.click();
        Thread.sleep(2000);
        //WebElement textBox = driver.findElement(By.cssSelector("input"))





        /*HW
Navigate to http://syntaxprojects.com
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
quit the browser*/


    }
}
