package syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Claas02HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("John");
        driver.findElement(By.name("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Jump St");
        driver.findElement(By.name("customer.address.city")).sendKeys("Syntax");
        driver.findElement(By.name("customer.address.state")).sendKeys("Maryland");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("00000");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("000-000-0000");
        driver.findElement(By.name("customer.ssn")).sendKeys("000-00-0000");
        driver.findElement(By.name("customer.username")).sendKeys("JohnDoe");
        driver.findElement(By.name("customer.password")).sendKeys("JohnDoe1213");
        driver.findElement(By.name("repeatedPassword")).sendKeys("JohnDoe1213");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.close();
        //driver.findElement(By.name("")).sendKeys("");
        //driver.findElement(By.name("")).sendKeys("");
        //driver.findElement(By.name("")).sendKeys("");




    }
}
/*HW
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser

navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser*/