package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShareLaneTest {
    //1. open browser, url
    //2. enter value in zip code field
    //3. click Continue button

    @Test
    public void fillInZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("444444");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();

    }

    public void fillInZipCodeFieldWithMandatoryFieldsDataTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/main.ry");
        driver.findElement(By.name("first_name")).sendKeys("XAXAAXAX");
        driver.findElement(By.name("email")).sendKeys("kavkaz@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("111111");
        driver.findElement(By.name("password")).sendKeys("111111");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }


    @Test
    public void fillInZipCodeFieldWithEmptyDataTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        fillInZipCodeFieldTest();
        driver.findElement(By.name("last_name")).sendKeys("PIKACHY");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
    }

    @Test
    public void fillInAutorizationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://sharelane.com/cgi-bin/main.ry");
        driver.findElement(By.name("email")).sendKeys("stephen_khan@395.62.sharelane.com");
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.xpath("//*[@value=Login']")).click();


    }
}